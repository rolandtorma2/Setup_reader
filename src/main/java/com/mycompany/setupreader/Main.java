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
 * The Main class provides methods for reading and processing JSON setup files
 * containing information about car setup including tyres, alignment, electronics, and strategy.
 */
public class Main {

    /**
     * Reads the content of a JSON file and returns it as a String.
     *
     * @param filename The path to the JSON file.
     * @return The content of the JSON file as a String.
     * @throws FileNotFoundException If the specified file is not found.
     */

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

    /**
     * Saves the tyre setup data from a JSON object and prints information about it.
     *
     * @param setupTyres The JSON object containing tyre setup data.
     * @return An instance of the Tyres class representing the tyre setup.
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
     * Saves the alignment setup data from a JSON object and prints information about it.
     *
     * @param setupAlignment The JSON object containing alignment setup data.
     * @return An instance of the Alignment class representing the alignment setup.
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
     * The main method of the program that reads a JSON setup file, processes the data,
     * and prints information about the car setup including tyres, alignment, electronics, and strategy.
     *
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {

        // Read the content of the JSON file into a String.
        String strJsn = getJson("./src/main/resources/testresource.json");

         // Parse the JSON String using the JSONParser.
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJsn);
            JSONObject mainJsonObject = (JSONObject) object;

            // Extract and print the car name.
            String carName = (String) mainJsonObject.get("carName");
            System.out.println("Car name : " + carName);
            System.out.println();

            // Extract and process Tyres setup data.
            JSONObject basicSetup = (JSONObject) mainJsonObject.get("basicSetup");
            JSONObject tyres = (JSONObject) basicSetup.get("tyres");
            Tyres x = saveTyreData(tyres);

            // Extract and process Alignment setup data.
            JSONObject alignment = (JSONObject) basicSetup.get("alignment");
            Alignment y = saveAlignmentData(alignment);

            // Extract and process Electronics setup data.
            JSONObject electronics = (JSONObject) basicSetup.get("electronics");

            // Extract and initialize electronic class with the electronics data.
            long tC1 = (long) electronics.get("tC1");
            long tC2 = (long) electronics.get("tC2");
            long abs = (long) electronics.get("abs");
            long eCUMap = (long) electronics.get("eCUMap");
            long fuelMix = (long) electronics.get("fuelMix");
            long telemetryLaps = (long) electronics.get("telemetryLaps");
            
            Electronics electronicsClass = new Electronics(tC1, tC2, abs, eCUMap, fuelMix, telemetryLaps);

            // Print information about Traction Control, ABS, ECU Mapping, Fuel Mix, and Telemetry.
            System.out.println("Traction Control 1 power : " + tC1);
            System.out.println("Traction Control 2 power : " + tC2);

            System.out.println("Abs power : " + abs);

            System.out.println("ECU Mapping level : " + eCUMap);

            System.out.println("Fuel mix : " + fuelMix);

            System.out.println("Telemetry laps: " + telemetryLaps);

            // Extract and process Strategy setup data.
            JSONObject strategy = (JSONObject) basicSetup.get("strategy");
            // Extract various strategy parameters.
            long fuel = (long) strategy.get("fuel");
            long nPitStops = (long) strategy.get("nPitStops");
            long tyreSet = (long) strategy.get("tyreSet");
            long frontBrakePadCompound = (long) strategy.get("frontBrakePadCompound");
            long rearBrakePadCompound = (long) strategy.get("rearBrakePadCompound");
            double fuelPerLap = (double) strategy.get("fuelPerLap");

        } catch (Exception ex) {
            // Print the stack trace if an exception occurs during processing.
            ex.printStackTrace();
        }
    }
}
