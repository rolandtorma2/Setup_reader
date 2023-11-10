package com.mycompany.jsonfilereader;

//import every package i need 
import static com.mycompany.jsonfilereader.JSONFileReader.JsonParser.getJson;
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
    private final static int FRONT_LEFT = 0; 
    private final static int FRONT_RIGHT = 1; 
    private final static int REAR_LEFT = 2; 
    private final static int REAR_RIGHT = 3;

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
            
            //Tyre Compound
            JSONObject basicSetup = (JSONObject) mainJsonObject.get("basicSetup");
            JSONObject tyres = (JSONObject) basicSetup.get("tyres");
            
            long tyreCompound = (long) tyres.get("tyreCompound");
            JSONArray tyrePressure = (JSONArray) tyres.get("tyrePressure");
            
            Tyres tyreClass = new Tyres((int)tyreCompound, tyrePressure);
            System.out.println("Compound : " + tyreClass.tyreCompound);
            System.out.println("Pressures : ");
            System.out.println("LF : " + tyreClass.tyrePressure.get(FRONT_LEFT));
            System.out.println("RF : " + tyreClass.tyrePressure.get( FRONT_RIGHT));
            System.out.println("LR : " + tyreClass.tyrePressure.get(REAR_LEFT));
            System.out.println("RR : " + tyreClass.tyrePressure.get(REAR_RIGHT));
            
            
            int x = 0;
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
