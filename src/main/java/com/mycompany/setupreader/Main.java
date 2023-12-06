package com.mycompany.setupreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Class responsible for reading and processing setup data from a JSON file.
 */

public class Main {

    /**
     * Reads the contents of a file and returns it as a string.
     *
     * @param filename The name of the file to read.
     * @return The contents of the file as a string.
     * @throws FileNotFoundException If the specified file is not found.
     */

    public static String getJson(String filename) throws FileNotFoundException { // method implementation
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

    /**
     * Parses and saves tyre setup data from a JSON object.
     *
     * @param setupTyres The JSON object containing tyre setup data.
     * @return An instance of the Tyres class with the parsed data.
     */

    public static Tyres saveTyreData(JSONObject setupTyres) {
        long tyreCompound = (long) setupTyres.get("tyreCompound");
        JSONArray tyrePressure = (JSONArray) setupTyres.get("tyrePressure");

        // giving parameters to the tyre class
        Tyres tyreClass;
        tyreClass = new Tyres((int) tyreCompound, tyrePressure);

        // Outputting the information about tyres to the console
        System.out.println("Tyre Compound : " + tyreClass.tyreCompound);
        System.out.println("Tyre Pressures : ");
        System.out.println("Front Left Tyre : " + tyreClass.tyrePressure.get(Utils.FRONT_LEFT) + " psi");
        System.out.println("Front Right Tyre : " + tyreClass.tyrePressure.get(Utils.FRONT_RIGHT) + " psi");
        System.out.println("Rear Left Tyre : " + tyreClass.tyrePressure.get(Utils.REAR_LEFT) + " psi");
        System.out.println("Rear Right Tyre : " + tyreClass.tyrePressure.get(Utils.REAR_RIGHT) + " psi\n");

        return tyreClass;
    }

    /**
     * Parses and saves alignment setup data from a JSON object.
     *
     * @param setupAlignment The JSON object containing alignment setup data.
     * @return An instance of the Alignment class with the parsed data.
     */

    public static Alignment saveAlignmentData(JSONObject setupAlignment) {
        // getting the alignment data
        JSONArray camber = (JSONArray) setupAlignment.get("camber");
        JSONArray toe = (JSONArray) setupAlignment.get("toe");
        JSONArray staticCamber = (JSONArray) setupAlignment.get("staticCamber");
        JSONArray toeOutLinear = (JSONArray) setupAlignment.get("toeOutLinear");
        long casterLF = (long) setupAlignment.get("casterLF");
        long casterRF = (long) setupAlignment.get("casterRF");
        long steerRatio = (long) setupAlignment.get("steerRatio");

        // making alignment class
        Alignment alignmentClass = new Alignment(camber, toe, staticCamber, toeOutLinear, casterLF, casterRF,
                steerRatio);

        // CAMBER
        System.out.println("Front left camber : " + alignmentClass.camber.get(Utils.CAMBER_FRONT_LEFT) + "%");
        System.out.println("Front right camber : " + alignmentClass.camber.get(Utils.CAMBER_FRONT_RIGHT) + "%");
        System.out.println("Rear left camber : " + alignmentClass.camber.get(Utils.CAMBER_REAR_LEFT) + "%");
        System.out.println("Rear right camber : " + alignmentClass.camber.get(Utils.CAMBER_REAR_RIGHT) + "%\n");

        // TOE
        System.out.println("Front left toe : " + alignmentClass.toe.get(Utils.TOE_FRONT_LEFT));
        System.out.println("Front right toe : " + alignmentClass.toe.get(Utils.TOE_FRONT_RIGHT));
        System.out.println("Rear left toe : " + alignmentClass.toe.get(Utils.TOE_REAR_LEFT));
        System.out.println("Rear right toe : " + alignmentClass.toe.get(Utils.TOE_REAR_RIGHT) + "\n");

        // STATIC CAMBER
        System.out.println("Front left static camber : "
                + alignmentClass.staticCamber.get(Utils.STATIC_CAMBER_FRONT_LEFT) + " degrees");
        System.out.println("Front right static camber : "
                + alignmentClass.staticCamber.get(Utils.STATIC_CAMBER_FRONT_RIGHT) + " degrees");
        System.out.println("Rear left static camber : " + alignmentClass.staticCamber.get(Utils.STATIC_CAMBER_REAR_LEFT)
                + " degrees");
        System.out.println("Rear right static camber : "
                + alignmentClass.staticCamber.get(Utils.STATIC_CAMBER_REAR_RIGHT) + " degrees\n");

        // TOE OUT LINEAR
        System.out.println(
                "Front left toe out linear : " + alignmentClass.toeOutLinear.get(Utils.TOE_OUT_LINEAR_FRONT_LEFT));
        System.out.println(
                "Front right toe out linear : " + alignmentClass.toeOutLinear.get(Utils.TOE_OUT_LINEAR_FRONT_RIGHT));
        System.out.println(
                "Rear left toe out linear : " + alignmentClass.toeOutLinear.get(Utils.TOE_OUT_LINEAR_REAR_LEFT));
        System.out.println("Rear right toe out linear : "
                + alignmentClass.toeOutLinear.get(Utils.TOE_OUT_LINEAR_REAR_RIGHT) + "\n");

        // CASTER LEFT FRONT
        System.out.println("Left Front Caster : " + alignmentClass.casterLF);
        System.out.println("Right Front Caster : " + alignmentClass.casterRF);
        System.out.println("Steering ratio : " + alignmentClass.steerRatio + "\n");

        return alignmentClass;
    }

    /**
     * Parses and saves electronics setup data from a JSON object.
     *
     * @param setupElectronics The JSON object containing electronics setup data.
     * @return An instance of the Electronics class with the parsed data.
     */

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

    /**
     * Parses and saves strategy setup data from a JSON object.
     *
     * @param setupStrategy The JSON object containing strategy setup data.
     * @return An instance of the Strategy class with the parsed data.
     */

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

    /**
     * Parses and saves mechanical balance setup data from a JSON object.
     *
     * @param setupMechanicalBalance The JSON object containing mechanical balance
     *                               setup data.
     * @return An instance of the MechanicalBalance class with the parsed data.
     */

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

    /**
     * Parses and saves dampers setup data from a JSON object.
     *
     * @param setupDampers The JSON object containing dampers setup data.
     * @return An instance of the Dampers class with the parsed data.
     */

    public static Dampers saveDampersData(JSONObject setupDampers) {

        JSONArray bumpSlow = (JSONArray) setupDampers.get("bumpSlow");
        JSONArray bumpFast = (JSONArray) setupDampers.get("bumpFast");
        JSONArray reboundSlow = (JSONArray) setupDampers.get("reboundSlow");
        JSONArray reboundFast = (JSONArray) setupDampers.get("reboundFast");

        Dampers dampersClass = new Dampers(bumpSlow, bumpFast, reboundSlow, reboundFast);

        return dampersClass;
    }

    /**
     * Parses and saves aero balance setup data from a JSON object.
     *
     * @param setupAeroBalance The JSON object containing aero balance setup data.
     * @return An instance of the AeroBalance class with the parsed data.
     */

    public static AeroBalance saveAeroBalanceData(JSONObject setupAeroBalance) {

        JSONArray rideHeight = (JSONArray) setupAeroBalance.get("rideHeight");
        JSONArray rodLength = (JSONArray) setupAeroBalance.get("rodLength");
        long splitter = (long) setupAeroBalance.get("splitter");
        long rearWing = (long) setupAeroBalance.get("rearWing");
        JSONArray brakeDuct = (JSONArray) setupAeroBalance.get("brakeDuct");

        AeroBalance aeroBalanceClass = new AeroBalance(rideHeight, rodLength, brakeDuct, splitter, rearWing);

        return aeroBalanceClass;
    }

    /**
     * Parses and saves drivetrain setup data from a JSON object.
     *
     * @param setupDriveTrain The JSON object containing drivetrain setup data.
     * @return An instance of the DriveTrain class with the parsed data.
     */

    public static DriveTrain saveDriveTrainData(JSONObject setupDriveTrain) {

        long preload = (long) setupDriveTrain.get("preload");

        DriveTrain driveTrainData = new DriveTrain(preload);

        return driveTrainData;
    }

    /**
     * The main entry point of the program. Reads JSON data, processes and prints
     * setup information.
     *
     * @param args Command line arguments (not used in this application).
     * @throws FileNotFoundException If the specified JSON file is not found.
     * @throws ParseException        If there is an error parsing the JSON file.
     */

    public static void main(String[] args) throws FileNotFoundException, ParseException {

        // reading the file
        String strJsn = getJson("./src/main/resources/testresource.json");

        // making the parser
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJsn);
            JSONObject mainJsonObject = (JSONObject) object;

            // Car name :
            String carName = (String) mainJsonObject.get("carName");
            System.out.println("Car name : " + carName);
            System.out.println();

            // Tyres
            JSONObject basicSetup = (JSONObject) mainJsonObject.get("basicSetup");
            JSONObject tyres = (JSONObject) basicSetup.get("tyres");
            Tyres x = saveTyreData(tyres);

            // Alignment
            JSONObject alignment = (JSONObject) basicSetup.get("alignment");
            Alignment y = saveAlignmentData(alignment);

            // Electronics
            JSONObject electronics = (JSONObject) basicSetup.get("electronics");

            // getting the electronics data
            long tC1 = (long) electronics.get("tC1");
            long tC2 = (long) electronics.get("tC2");
            long abs = (long) electronics.get("abs");
            long eCUMap = (long) electronics.get("eCUMap");
            long fuelMix = (long) electronics.get("fuelMix");
            long telemetryLaps = (long) electronics.get("telemetryLaps");
            // making electronic class
            Electronics electronicsClass = new Electronics(tC1, tC2, abs, eCUMap, fuelMix, telemetryLaps);

            // TRACTION CONTROL
            System.out.println("Traction Control 1 power : " + tC1);
            System.out.println("Traction Control 2 power : " + tC2);
            // ABS
            System.out.println("Abs power : " + abs);
            // ECU
            System.out.println("ECU Mapping level : " + eCUMap);
            // FUEL MIX
            System.out.println("Fuel mix : " + fuelMix);
            // TELEMETRY
            System.out.println("Telemetry laps: " + telemetryLaps);

            // Strategy
            JSONObject strategy = (JSONObject) basicSetup.get("strategy");

            long fuel = (long) strategy.get("fuel");
            long nPitStops = (long) strategy.get("nPitStops");
            long tyreSet = (long) strategy.get("tyreSet");
            long frontBrakePadCompound = (long) strategy.get("frontBrakePadCompound");
            long rearBrakePadCompound = (long) strategy.get("rearBrakePadCompound");
            double fuelPerLap = (double) strategy.get("fuelPerLap");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
