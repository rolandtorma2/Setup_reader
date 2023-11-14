package com.mycompany.jsonfilereader;

//import utils class
import static com.mycompany.jsonfilereader.JSONFileReader.JsonParser.getJson;
import static com.mycompany.jsonfilereader.Utils.*;
//import every package
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//making a class for the file reader
public class JSONFileReader {

    //creating jsonparser
    public class JsonParser {

        public static String getJson(String filename) throws FileNotFoundException { //making the file reader
            String jsonText = "";

            try {
                BufferedReader buffereader
                        = new BufferedReader(new FileReader(filename));
                String line;

                while ((line = buffereader.readLine()) != null) {
                    jsonText += line + "\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return jsonText;
        }
    }

    public static Tyres saveTyreData(JSONObject setupTyres) {
        long tyreCompound = (long) setupTyres.get("tyreCompound");
        JSONArray tyrePressure = (JSONArray) setupTyres.get("tyrePressure");

        //giving parameters to the tyre class
        Tyres tyreClass;
        tyreClass = new Tyres((int) tyreCompound, tyrePressure);

        //Outputting the information about tyres to the console
        System.out.println("Tyre Compound : " + tyreClass.tyreCompound);
        System.out.println("Tyre Pressures : ");
        System.out.println("Front Left Tyre : " + tyreClass.tyrePressure.get(FRONT_LEFT) + " psi");
        System.out.println("Front Right Tyre : " + tyreClass.tyrePressure.get(FRONT_RIGHT) + " psi");
        System.out.println("Rear Left Tyre : " + tyreClass.tyrePressure.get(REAR_LEFT) + " psi");
        System.out.println("Rear Right Tyre : " + tyreClass.tyrePressure.get(REAR_RIGHT) + " psi\n");
        
        return tyreClass;
    }
    
    public static Alignment saveAlignmentData (JSONObject setupAlignment) {
        //getting the alignment data
            JSONArray camber = (JSONArray) setupAlignment.get("camber");
            JSONArray toe = (JSONArray) setupAlignment.get("toe");
            JSONArray staticCamber = (JSONArray) setupAlignment.get("staticCamber");
            JSONArray toeOutLinear = (JSONArray) setupAlignment.get("toeOutLinear");
            long casterLF = (long) setupAlignment.get("casterLF");
            long casterRF = (long) setupAlignment.get("casterRF");
            long steerRatio = (long) setupAlignment.get("steerRatio");

            //making alignment class
            Alignment alignmentClass = new Alignment(camber, toe, staticCamber, toeOutLinear, casterLF, casterRF, steerRatio);

            //CAMBER
            System.out.println("Front left camber : " + alignmentClass.camber.get(CAMBER_FRONT_LEFT) + "%");
            System.out.println("Front right camber : " + alignmentClass.camber.get(CAMBER_FRONT_RIGHT) + "%");
            System.out.println("Rear left camber : " + alignmentClass.camber.get(CAMBER_REAR_LEFT) + "%");
            System.out.println("Rear right camber : " + alignmentClass.camber.get(CAMBER_REAR_RIGHT) + "%\n");
            

            //TOE
            System.out.println("Front left toe : " + alignmentClass.toe.get(TOE_FRONT_LEFT));
            System.out.println("Front right toe : " + alignmentClass.toe.get(TOE_FRONT_RIGHT));
            System.out.println("Rear left toe : " + alignmentClass.toe.get(TOE_REAR_LEFT));
            System.out.println("Rear right toe : " + alignmentClass.toe.get(TOE_REAR_RIGHT) + "\n");
        

            //STATIC CAMBER
            System.out.println("Front left static camber : " + alignmentClass.staticCamber.get(STATIC_CAMBER_FRONT_LEFT) + " degrees");
            System.out.println("Front right static camber : " + alignmentClass.staticCamber.get(STATIC_CAMBER_FRONT_RIGHT) + " degrees");
            System.out.println("Rear left static camber : " + alignmentClass.staticCamber.get(STATIC_CAMBER_REAR_LEFT) + " degrees");
            System.out.println("Rear right static camber : " + alignmentClass.staticCamber.get(STATIC_CAMBER_REAR_RIGHT) + " degrees\n");
        

            //TOE OUT LINEAR
            System.out.println("Front left toe out linear : " + alignmentClass.toeOutLinear.get(TOE_OUT_LINEAR_FRONT_LEFT));
            System.out.println("Front right toe out linear : " + alignmentClass.toeOutLinear.get(TOE_OUT_LINEAR_FRONT_RIGHT));
            System.out.println("Rear left toe out linear : " + alignmentClass.toeOutLinear.get(TOE_OUT_LINEAR_REAR_LEFT));
            System.out.println("Rear right toe out linear : " + alignmentClass.toeOutLinear.get(TOE_OUT_LINEAR_REAR_RIGHT) + "\n");


            //CASTER LEFT FRONT
            System.out.println("Left Front Caster : " + alignmentClass.casterLF);
            System.out.println("Right Front Caster : " + alignmentClass.casterRF);
            System.out.println("Steering ratio : " + alignmentClass.steerRatio + "\n");
            
            return alignmentClass;
    }
    
    

    //main
    public static void main(String[] args) throws FileNotFoundException, ParseException {

        //reading the file
        String strJsn = getJson("C:\\Users\\rOlie\\Documents\\Assetto Corsa Competizione\\Setups\\ferrari_296_gt3\\nurburgring\\GO2 296 GT3 NUR S Q01.json");

        //making the parser
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJsn);
            JSONObject mainJsonObject = (JSONObject) object;

            //Car name : 
            String carName = (String) mainJsonObject.get("carName");
            System.out.println("Car name : " + carName);
            System.out.println();

            //Tyres
            JSONObject basicSetup = (JSONObject) mainJsonObject.get("basicSetup");
            JSONObject tyres = (JSONObject) basicSetup.get("tyres");
            Tyres x = saveTyreData(tyres);

            //Alignment
            JSONObject alignment = (JSONObject) basicSetup.get("alignment");
            Alignment y = saveAlignmentData(alignment);

            //Electronics 
            JSONObject electronics = (JSONObject) basicSetup.get("electronics");

            //getting the electronics data 
            long tC1 = (long) electronics.get("tC1");
            long tC2 = (long) electronics.get("tC2");
            long abs = (long) electronics.get("abs");
            long eCUMap = (long) electronics.get("eCUMap");
            long fuelMix = (long) electronics.get("fuelMix");
            long telemetryLaps = (long) electronics.get("telemetryLaps");
            //making electronic class
            Electronics electronicsClass = new Electronics(tC1, tC2, abs, eCUMap, fuelMix, telemetryLaps);

            //TRACTION CONTROL
            System.out.println("Traction Control 1 power : " + tC1);
            System.out.println("Traction Control 2 power : " + tC2);
            //ABS
            System.out.println("Abs power : " + abs);
            //ECU
            System.out.println("ECU Mapping level : " + eCUMap);
            //FUEL MIX
            System.out.println("Fuel mix : " + fuelMix);
            //TELEMETRY
            System.out.println("Telemetry laps: " + telemetryLaps);

            //Strategy
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
