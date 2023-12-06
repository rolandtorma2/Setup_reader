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

        return new Tyres((int) tyreCompound, tyrePressure);
    }

    /**
     * Parses and saves alignment setup data from a JSON object.
     *
     * @param setupAlignment The JSON object containing alignment setup data.
     * @return An instance of the Alignment class with the parsed data.
     */

    public static Alignment saveAlignmentData(JSONObject setupAlignment) {

        JSONArray camber = (JSONArray) setupAlignment.get("camber");
        JSONArray toe = (JSONArray) setupAlignment.get("toe");
        JSONArray staticCamber = (JSONArray) setupAlignment.get("staticCamber");
        JSONArray toeOutLinear = (JSONArray) setupAlignment.get("toeOutLinear");
        long casterLF = (long) setupAlignment.get("casterLF");
        long casterRF = (long) setupAlignment.get("casterRF");
        long steerRatio = (long) setupAlignment.get("steerRatio");

        return new Alignment(camber, toe, staticCamber, toeOutLinear, casterLF, casterRF,
                steerRatio);
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

        return new Electronics(tC1, tC2, abs, eCUMap, fuelMix, telemetryLaps);
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
        // Pitstrategy access code:
        JSONArray temp = (JSONArray) setupStrategy.get("pitStrategy");
        JSONObject pitStrategy = (JSONObject) temp.get(0);
        JSONObject tyres = (JSONObject) pitStrategy.get("tyres");
        JSONArray tyrePressures = (JSONArray) tyres.get("tyrePressure");

        return new Strategy(fuel, nPitStops, tyreSet, frontBrakePadCompound, rearBrakePadCompound,
                fuelPerLap, pitStrategy);
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

        return new MechanicalBalance(wheelRate, bumpStopRateUp, bumpStopRateDn,
                bumpStopWindow, aRBFront, aRBRear, brakeTorque, brakeBias);
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

        return new Dampers(bumpSlow, bumpFast, reboundSlow, reboundFast);
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

        return new AeroBalance(rideHeight, rodLength, brakeDuct, splitter, rearWing);
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

        return new DriveTrain(preload);
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

        String strJsn = getJson("./src/main/resources/testresource.json");

        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJsn);
            JSONObject mainJsonObject = (JSONObject) object;

            JSONObject basicSetupJSON = (JSONObject) mainJsonObject.get("basicSetup");
            JSONObject advancedSetupJSON = (JSONObject) mainJsonObject.get("advancedSetup");

            BasicSetup basicSetup = new BasicSetup(saveTyreData((JSONObject) basicSetupJSON.get("tyres")),
                    saveAlignmentData((JSONObject) basicSetupJSON.get("alignment")),
                    saveElectronicsData((JSONObject) basicSetupJSON.get("electronics")),
                    saveStrategyData((JSONObject) basicSetupJSON.get("strategy")));

            AdvancedSetup advancedSetup = new AdvancedSetup(
                    saveMechanicalBalanceData((JSONObject) advancedSetupJSON.get("mechanicalBalance")),
                    saveDampersData((JSONObject) advancedSetupJSON.get("dampers")),
                    saveAeroBalanceData((JSONObject) advancedSetupJSON.get("aeroBalance")),
                    saveDriveTrainData((JSONObject) advancedSetupJSON.get("drivetrain")));

            Setup setup = new Setup((String) mainJsonObject.get("carName"), basicSetup, advancedSetup,
                    (long) mainJsonObject.get("trackBopType"));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
