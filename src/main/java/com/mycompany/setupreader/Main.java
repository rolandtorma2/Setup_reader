package com.mycompany.setupreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    public static Tyres saveTyreData(JSONObject setupTyres) {
        long tyreCompound = (long) setupTyres.get("tyreCompound");
        JSONArray tyrePressure = (JSONArray) setupTyres.get("tyrePressure");

        Tyres tyreClass;
        tyreClass = new Tyres((int) tyreCompound, tyrePressure);

        return tyreClass;
    }

    public static Alignment saveAlignmentData(JSONObject setupAlignment) {

        JSONArray camber = (JSONArray) setupAlignment.get("camber");
        JSONArray toe = (JSONArray) setupAlignment.get("toe");
        JSONArray staticCamber = (JSONArray) setupAlignment.get("staticCamber");
        JSONArray toeOutLinear = (JSONArray) setupAlignment.get("toeOutLinear");
        long casterLF = (long) setupAlignment.get("casterLF");
        long casterRF = (long) setupAlignment.get("casterRF");
        long steerRatio = (long) setupAlignment.get("steerRatio");

        Alignment alignmentClass = new Alignment(camber, toe, staticCamber, toeOutLinear, casterLF, casterRF,
                steerRatio);

        return alignmentClass;
    }

    public static Electronics saveElectronicsData(JSONObject setupElectronics) {

        long tC1 = (long) setupElectronics.get("tC1");
        long tC2 = (long) setupElectronics.get("tC2");
        long abs = (long) setupElectronics.get("abs");
        long eCUMap = (long) setupElectronics.get("eCUMap");
        long fuelMix = (long) setupElectronics.get("fuelMix");
        long telemetryLaps = (long) setupElectronics.get("telemetryLaps");

        Electronics electronicsClass = new Electronics(tC1, tC2, abs, eCUMap, fuelMix, telemetryLaps);
        return electronicsClass;
    }

    public static Strategy saveStrategyData(JSONObject setupStrategy) {

        long fuel = (long) setupStrategy.get("fuel");
        long nPitStops = (long) setupStrategy.get("nPitStops");
        long tyreSet = (long) setupStrategy.get("tyreSet");
        long frontBrakePadCompound = (long) setupStrategy.get("frontBrakePadCompound");
        long rearBrakePadCompound = (long) setupStrategy.get("rearBrakePadCompound");
        double fuelPerLap = (double) setupStrategy.get("fuelPerLap");
        JSONObject pitStratgy = (JSONObject) setupStrategy.get("pitStrategy");

        Strategy strategyClass = new Strategy(fuel, nPitStops, tyreSet, frontBrakePadCompound, rearBrakePadCompound,
                fuelPerLap, pitStratgy);
        return strategyClass;
    }

    public static MechanicalBalance saveMechanicalBalanceData(JSONObject setupMechanicalBalance) {

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

        return mechanicalBalanceClass;
    }

    public static Dampers saveDampersData(JSONObject setupDampers) {

        JSONArray bumpSlow = (JSONArray) setupDampers.get("bumpSlow");
        JSONArray bumpFast = (JSONArray) setupDampers.get("bumpFast");
        JSONArray reboundSlow = (JSONArray) setupDampers.get("reboundSlow");
        JSONArray reboundFast = (JSONArray) setupDampers.get("reboundFast");

        Dampers dampersClass = new Dampers(bumpSlow, bumpFast, reboundSlow, reboundFast);

        return dampersClass;
    }

    public static AeroBalance saveAeroBalanceData(JSONObject setupAeroBalance) {

        JSONArray rideHeight = (JSONArray) setupAeroBalance.get("rideHeight");
        JSONArray rodLength = (JSONArray) setupAeroBalance.get("rodLength");
        long splitter = (long) setupAeroBalance.get("splitter");
        long rearWing = (long) setupAeroBalance.get("rearWing");
        JSONArray brakeDuct = (JSONArray) setupAeroBalance.get("brakeDuct");

        AeroBalance aeroBalanceClass = new AeroBalance(rideHeight, rodLength, brakeDuct, splitter, rearWing);

        return aeroBalanceClass;
    }

    public static DriveTrain saveDriveTrainData(JSONObject setupDriveTrain) {

        long preload = (long) setupDriveTrain.get("preload");

        DriveTrain driveTrainData = new DriveTrain(preload);

        return driveTrainData;
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

            JSONObject tyres = (JSONObject) basicSetup.get("tyres");
            Tyres t = saveTyreData(tyres);

            JSONObject alignment = (JSONObject) basicSetup.get("alignment");
            Alignment a = saveAlignmentData(alignment);

            JSONObject electronics = (JSONObject) basicSetup.get("electronics");
            Electronics e = saveElectronicsData(electronics);

            JSONObject strategy = (JSONObject) basicSetup.get("strategy");
            Strategy s = saveStrategyData(strategy);

            JSONObject mechanicalBalance = (JSONObject) advancedSetup.get("mechanicalBalance");
            Strategy mB = saveStrategyData(mechanicalBalance);

            JSONObject dampers = (JSONObject) advancedSetup.get("dampers");
            Strategy d = saveStrategyData(dampers);

            JSONObject aeroBalance = (JSONObject) advancedSetup.get("aeroBalance");
            Strategy aB = saveStrategyData(aeroBalance);

            JSONObject drivetrain = (JSONObject) advancedSetup.get("drivetrain");
            Strategy dT = saveStrategyData(drivetrain);

            long trackBopType = (long) mainJsonObject.get("trackBopType");
            System.out.println(trackBopType);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
