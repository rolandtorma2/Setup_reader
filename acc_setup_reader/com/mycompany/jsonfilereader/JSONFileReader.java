package com.mycompany.jsonfilereader;

//import every package i need 
import static com.mycompany.jsonfilereader.JSONFileReader.JsonParser.getJson;
import static com.mycompany.jsonfilereader.Utils.*;
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

    //Basic setup methods: 
    //tyres method
    public static Tyres saveTyreData(JSONObject setupTyres) {
        long tyreCompound = (long) setupTyres.get("tyreCompound");
        JSONArray tyrePressure = (JSONArray) setupTyres.get("tyrePressure");

        //giving parameters to the tyre class
        Tyres tyreClass;
        tyreClass = new Tyres((int) tyreCompound, tyrePressure);

        //Outputting the information about tyres to the console
        System.out.println("Tyre Compound: " + tyreClass.tyreCompound);
        System.out.println("Tyre Pressures: ");

        return tyreClass;
    }

    //Alignment method
    public static Alignment saveAlignmentData(JSONObject setupAlignment) {
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

        return alignmentClass;
    }

    //Electronics method
    public static Electronics saveElectronicsData(JSONObject saveElectronics) {
        //getting the electronics data 
        long tC1 = (long) saveElectronics.get("tC1");
        long tC2 = (long) saveElectronics.get("tC2");
        long abs = (long) saveElectronics.get("abs");
        long eCUMap = (long) saveElectronics.get("eCUMap");
        long fuelMix = (long) saveElectronics.get("fuelMix");
        long telemetryLaps = (long) saveElectronics.get("telemetryLaps");
        //making electronic class
        Electronics electronicsClass = new Electronics(tC1, tC2, abs, eCUMap, fuelMix, telemetryLaps);

        return electronicsClass;
    }

    //strategy method
    public static Strategy saveStrategyData(JSONObject saveStrategy) {

        long fuel = (long) saveStrategy.get("fuel");
        long nPitStops = (long) saveStrategy.get("nPitStops");
        long tyreSet = (long) saveStrategy.get("tyreSet");
        long frontBrakePadCompound = (long) saveStrategy.get("frontBrakePadCompound");
        long rearBrakePadCompound = (long) saveStrategy.get("rearBrakePadCompound");
        double fuelPerLap = (double) saveStrategy.get("fuelPerLap");
        JSONArray temp = (JSONArray) saveStrategy.get("pitStrategy");
        // TODO: prepare this for multiple pitstrategies
        JSONObject pitStrategy = (JSONObject) temp.get(0);
        JSONObject tyres = (JSONObject) pitStrategy.get("tyres");
        JSONArray tyrePressures = (JSONArray) tyres.get("tyrePressure");

        Strategy strategyClass = new Strategy(fuel, nPitStops, tyreSet, frontBrakePadCompound, rearBrakePadCompound, fuelPerLap, pitStrategy);

        return strategyClass;
    }

    //Advanced setup methods: 
    //MechanicalBalance method
    public static MechanicalBalance saveMechanicalBalanceData(JSONObject saveMechanicalBalance) {
        long aRBFront = (long) saveMechanicalBalance.get("aRBFront");
        long aRBRear = (long) saveMechanicalBalance.get("aRBRear");
        JSONArray wheelRate = (JSONArray) saveMechanicalBalance.get("wheelRate");
        JSONArray bumpStopRateUp = (JSONArray) saveMechanicalBalance.get("bumpStopRateUp");
        JSONArray bumpStopRateDn = (JSONArray) saveMechanicalBalance.get("bumpStopRateDn");
        JSONArray bumpStopWindow = (JSONArray) saveMechanicalBalance.get("bumpStopWindow");
        long brakeTorque = (long) saveMechanicalBalance.get("brakeTorque");
        long brakeBias = (long) saveMechanicalBalance.get("brakeBias");

        MechanicalBalance mechanicalBalanceClass = new MechanicalBalance(wheelRate, bumpStopRateUp, bumpStopRateDn, bumpStopWindow, aRBFront, aRBRear, brakeTorque, brakeBias);

        return mechanicalBalanceClass;
    }

    //Dampers data: 
    public static Dampers saveDamperData(JSONObject saveDamper) {
        JSONArray bumpSlow = (JSONArray) saveDamper.get("bumpSlow");
        JSONArray bumpFast = (JSONArray) saveDamper.get("bumpFast");
        JSONArray reboundSlow = (JSONArray) saveDamper.get("reboundSlow");
        JSONArray reboundFast = (JSONArray) saveDamper.get("reboundFast");

        Dampers dampersClass = new Dampers(bumpSlow, bumpFast, reboundSlow, reboundFast);

        return dampersClass;
    }

    //Aerobalance method: 
    public static AeroBalance saveAeroBalanceData(JSONObject saveAeroBalance) {

        JSONArray rideHeight = (JSONArray) saveAeroBalance.get("rideHeight");
        JSONArray rodLength = (JSONArray) saveAeroBalance.get("rodLength");
        JSONArray brakeDuct = (JSONArray) saveAeroBalance.get("brakeDuct");
        long splitter = (long) saveAeroBalance.get("splitter");
        long rearWing = (long) saveAeroBalance.get("rearWing");

        AeroBalance aeroBalanceClass = new AeroBalance(rideHeight, rodLength, brakeDuct, splitter, rearWing);

        return aeroBalanceClass;
    }

    public static DriveTrain saveDriveTrainData(JSONObject saveDriveTrain) {
        long preLoad = (long) saveDriveTrain.get("preload");

        DriveTrain driveTrainClass = new DriveTrain(preLoad);

        return driveTrainClass;
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

            //Basic setup datas: 
            //Car name: 
            String carName = (String) mainJsonObject.get("carName");
            System.out.println("Car name: " + carName + "\n");

            //Tyres
            System.out.println("Tyre data: \n");

            JSONObject basicSetup = (JSONObject) mainJsonObject.get("basicSetup");
            JSONObject tyres = (JSONObject) basicSetup.get("tyres");

            //Alignment
            System.out.println("Alignment data: \n");
            JSONObject alignment = (JSONObject) basicSetup.get("alignment");
            Alignment y = saveAlignmentData(alignment);

            //Electronics 
            System.out.println("Electronics data: \n");
            JSONObject electronics = (JSONObject) basicSetup.get("electronics");
            Electronics electronicsData = saveElectronicsData(electronics);

            //Strategy
            System.out.println("Strategy data: \n");
            JSONObject strategy = (JSONObject) basicSetup.get("strategy");

            Strategy stragetyData = saveStrategyData(strategy);

            //Advanced setup data:  
            //MechanicalBalance data: 
            System.out.println("Mechanical Balance data: \n");
            JSONObject advancedSetup = (JSONObject) mainJsonObject.get("advancedSetup");
            JSONObject mechanicalBalance = (JSONObject) advancedSetup.get("mechanicalBalance");
            MechanicalBalance mechanicalData = saveMechanicalBalanceData(mechanicalBalance);

            //Dampers data: 
            System.out.println("Bumpstop slow data: \n");
            JSONObject dampers = (JSONObject) advancedSetup.get("dampers");
            Dampers dampersData = saveDamperData(dampers);

            //Aerobalance data: 
            System.out.println("Aerobalance data: \n");
            JSONObject aeroBalance = (JSONObject) advancedSetup.get("aeroBalance");
            AeroBalance aeroBalanceData = saveAeroBalanceData(aeroBalance);

            //DriveTrain data: 
            System.out.println("Drive Train data: \n");
            JSONObject drivetrain = (JSONObject) advancedSetup.get("drivetrain");
            DriveTrain driveTrainData = saveDriveTrainData(drivetrain);

            //TrackBopType data:
            System.out.println("");
            long trackBopType = (long) mainJsonObject.get("trackBopType");
            System.out.println("Track BOP Data: " + trackBopType);
           

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
