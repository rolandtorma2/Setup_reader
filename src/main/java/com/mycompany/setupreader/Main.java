package com.mycompany.setupreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Savepoint;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static String getJson(String filename) throws FileNotFoundException { // making the file reader
        String jsonText = "";

        try {
            BufferedReader buffereader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = buffereader.readLine()) != null) {
                jsonText += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonText;
    }

    public static void saveTyreData(JSONObject setupTyres) {
        long tyreCompound = (long) setupTyres.get("tyreCompound");
        JSONArray tyrePressure = (JSONArray) setupTyres.get("tyrePressure");

        Tyres tyreClass;
        tyreClass = new Tyres((int) tyreCompound, tyrePressure);
    }

    public static void saveAlignmentData(JSONObject setupAlignment) {

        JSONArray camber = (JSONArray) setupAlignment.get("camber");
        JSONArray toe = (JSONArray) setupAlignment.get("toe");
        JSONArray staticCamber = (JSONArray) setupAlignment.get("staticCamber");
        JSONArray toeOutLinear = (JSONArray) setupAlignment.get("toeOutLinear");
        long casterLF = (long) setupAlignment.get("casterLF");
        long casterRF = (long) setupAlignment.get("casterRF");
        long steerRatio = (long) setupAlignment.get("steerRatio");

        Alignment alignmentClass = new Alignment(camber, toe, staticCamber, toeOutLinear, casterLF, casterRF,
                steerRatio);
    }

    public static void saveElectronicsData(JSONObject setupElectronics) {

        long tC1 = (long) setupElectronics.get("tC1");
        long tC2 = (long) setupElectronics.get("tC2");
        long abs = (long) setupElectronics.get("abs");
        long eCUMap = (long) setupElectronics.get("eCUMap");
        long fuelMix = (long) setupElectronics.get("fuelMix");
        long telemetryLaps = (long) setupElectronics.get("telemetryLaps");

        Electronics electronicsClass = new Electronics(tC1, tC2, abs, eCUMap, fuelMix, telemetryLaps);

    }

    public static void saveStrategyData(JSONObject setupStrategy) {

        long fuel = (long) setupStrategy.get("fuel");
        long nPitStops = (long) setupStrategy.get("nPitStops");
        long tyreSet = (long) setupStrategy.get("tyreSet");
        long frontBrakePadCompound = (long) setupStrategy.get("frontBrakePadCompound");
        long rearBrakePadCompound = (long) setupStrategy.get("rearBrakePadCompound");
        double fuelPerLap = (double) setupStrategy.get("fuelPerLap");

        // Pitstrategy access code:
        JSONArray temp = (JSONArray) setupStrategy.get("pitStrategy");
        JSONObject pitStrategy = (JSONObject) temp.get(0);
        JSONObject tyres = (JSONObject) pitStrategy.get("tyres");
        JSONArray tyrePressures = (JSONArray) tyres.get("tyrePressure");

        Strategy strategyClass = new Strategy(fuel, nPitStops, tyreSet, frontBrakePadCompound, rearBrakePadCompound,
                fuelPerLap, pitStrategy);
    }

    public static void saveMechanicalBalanceData(JSONObject setupMechanicalBalance) {

        long aRBFront = (long) setupMechanicalBalance.get("aRBFront");
        long aRBRear = (long) setupMechanicalBalance.get("aRBRear");
        JSONArray wheelRate = (JSONArray) setupMechanicalBalance.get("wheelRate");
        JSONArray bumpStopRateUp = (JSONArray) setupMechanicalBalance.get("bumpStopRateUp");
        JSONArray bumpStopRateDn = (JSONArray) setupMechanicalBalance.get("bumpStopRateDn");
        JSONArray bumpStopWindow = (JSONArray) setupMechanicalBalance.get("bumpStopWindow");
        long brakeTorque = (long) setupMechanicalBalance.get("brakeTorque");
        long brakeBias = (long) setupMechanicalBalance.get("brakeBias");

        MechanicalBalance mechanicalBalanceClass = new MechanicalBalance(wheelRate, bumpStopRateUp, bumpStopRateDn,
                bumpStopWindow, aRBFront, aRBRear, brakeTorque, brakeBias);
    }

    public static void saveDampersData(JSONObject setupDampers) {

        JSONArray bumpSlow = (JSONArray) setupDampers.get("bumpSlow");
        JSONArray bumpFast = (JSONArray) setupDampers.get("bumpFast");
        JSONArray reboundSlow = (JSONArray) setupDampers.get("reboundSlow");
        JSONArray reboundFast = (JSONArray) setupDampers.get("reboundFast");

        Dampers dampersClass = new Dampers(bumpSlow, bumpFast, reboundSlow, reboundFast);

    }

    public static void saveAeroBalanceData(JSONObject setupAeroBalance) {

        JSONArray rideHeight = (JSONArray) setupAeroBalance.get("rideHeight");
        JSONArray rodLength = (JSONArray) setupAeroBalance.get("rodLength");
        long splitter = (long) setupAeroBalance.get("splitter");
        long rearWing = (long) setupAeroBalance.get("rearWing");
        JSONArray brakeDuct = (JSONArray) setupAeroBalance.get("brakeDuct");

        AeroBalance aeroBalanceClass = new AeroBalance(rideHeight, rodLength, brakeDuct, splitter, rearWing);
    }

    public static void saveDriveTrainData(JSONObject setupDriveTrain) {

        long preload = (long) setupDriveTrain.get("preload");

        DriveTrain driveTrainData = new DriveTrain(preload);
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {

        String strJsn = getJson("./src/main/resources/testresource.json");

        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJsn);
            JSONObject mainJsonObject = (JSONObject) object;

            String carName = (String) mainJsonObject.get("carName");
            System.out.println("Car name : " + carName);

            JSONObject basicSetup = (JSONObject) mainJsonObject.get("basicSetup");
            JSONObject advancedSetup = (JSONObject) mainJsonObject.get("advancedSetup");

            saveTyreData((JSONObject) basicSetup.get("tyres"));
            saveAlignmentData((JSONObject) basicSetup.get("alignment"));
            saveElectronicsData((JSONObject) basicSetup.get("electronics"));
            saveStrategyData((JSONObject) basicSetup.get("strategy"));
            saveMechanicalBalanceData((JSONObject) advancedSetup.get("mechanicalBalance"));
            saveDampersData((JSONObject) advancedSetup.get("dampers"));
            saveAeroBalanceData((JSONObject) advancedSetup.get("aeroBalance"));
            saveDriveTrainData((JSONObject) advancedSetup.get("drivetrain"));

            long trackBopType = (long) mainJsonObject.get("trackBopType");
            System.out.println("Track BoP Type: " + trackBopType);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
