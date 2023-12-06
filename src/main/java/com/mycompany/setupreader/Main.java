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

    public static String getJson(String filename) throws FileNotFoundException {
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

    public static void main(String[] args) throws FileNotFoundException, ParseException {

        String strJsn = getJson("./src/main/resources/testresource.json");

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
