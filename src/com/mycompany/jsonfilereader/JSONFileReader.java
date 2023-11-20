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

<<<<<<< Updated upstream
=======
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

        //Tyres data : 
        System.out.println("Front Left Tyre: " + tyreClass.tyrePressure.get(FRONT_LEFT) + " psi");
        System.out.println("Front Right Tyre: " + tyreClass.tyrePressure.get(FRONT_RIGHT) + " psi");
        System.out.println("Rear Left Tyre: " + tyreClass.tyrePressure.get(REAR_LEFT) + " psi");
        System.out.println("Rear Right Tyre: " + tyreClass.tyrePressure.get(REAR_RIGHT) + " psi\n");

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

        //CAMBER data: 
        System.out.println("Camber front data:");
        System.out.println("Front left camber: " + alignmentClass.camber.get(CAMBER_FRONT_LEFT) + "%");
        System.out.println("Front right camber: " + alignmentClass.camber.get(CAMBER_FRONT_RIGHT) + "%");
        System.out.println("Rear left camber: " + alignmentClass.camber.get(CAMBER_REAR_LEFT) + "%");
        System.out.println("Rear right camber: " + alignmentClass.camber.get(CAMBER_REAR_RIGHT) + "%\n");

        //TOE data: 
        System.out.println("Toe data:");
        System.out.println("Front left toe: " + alignmentClass.toe.get(TOE_FRONT_LEFT));
        System.out.println("Front right toe: " + alignmentClass.toe.get(TOE_FRONT_RIGHT));
        System.out.println("Rear left toe: " + alignmentClass.toe.get(TOE_REAR_LEFT));
        System.out.println("Rear right toe: " + alignmentClass.toe.get(TOE_REAR_RIGHT) + "\n");

        //STATIC CAMBER data: 
        System.out.println("Static camber data:");
        System.out.println("Front left static camber: " + alignmentClass.staticCamber.get(STATIC_CAMBER_FRONT_LEFT) + " degrees");
        System.out.println("Front right static camber: " + alignmentClass.staticCamber.get(STATIC_CAMBER_FRONT_RIGHT) + " degrees");
        System.out.println("Rear left static camber: " + alignmentClass.staticCamber.get(STATIC_CAMBER_REAR_LEFT) + " degrees");
        System.out.println("Rear right static camber: " + alignmentClass.staticCamber.get(STATIC_CAMBER_REAR_RIGHT) + " degrees\n");

        //TOE OUT LINEAR data: 
        System.out.println("Toe out linear data:");
        System.out.println("Front left toe out linear: " + alignmentClass.toeOutLinear.get(TOE_OUT_LINEAR_FRONT_LEFT));
        System.out.println("Front right toe out linear: " + alignmentClass.toeOutLinear.get(TOE_OUT_LINEAR_FRONT_RIGHT));
        System.out.println("Rear left toe out linear: " + alignmentClass.toeOutLinear.get(TOE_OUT_LINEAR_REAR_LEFT));
        System.out.println("Rear right toe out linear: " + alignmentClass.toeOutLinear.get(TOE_OUT_LINEAR_REAR_RIGHT) + "\n");

        //CASTER FRONT data: 
        System.out.println("Caster front data");
        System.out.println("Left Front Caster: " + alignmentClass.casterLF);
        System.out.println("Right Front Caster: " + alignmentClass.casterRF);

        //Steering ratio data: 
        System.out.println("Steering ratio: " + alignmentClass.steerRatio + "\n");

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

        //TRACTION CONTROL
        System.out.println("Traction Control data: ");
        System.out.println("Traction Control 1 power: " + tC1);
        System.out.println("Traction Control 2 power: " + tC2);
        //ABS
        System.out.println("Abs data: ");
        System.out.println("Abs power: " + abs);
        //ECU
        System.out.println("ECU data: ");
        System.out.println("ECU Mapping level: " + eCUMap);
        //FUEL MIX
        System.out.println("Fuel data: ");
        System.out.println("Fuel mix: " + fuelMix);
        //TELEMETRY
        System.out.println("Telemetry data: ");
        System.out.println("Telemetry laps: " + telemetryLaps + "\n");

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

        System.out.println("Default fuel: " + fuel);
        System.out.println("Number of Pitstops: " + nPitStops);
        System.out.println("Tyre set: " + tyreSet);
        System.out.println("Front brake pad compound: " + frontBrakePadCompound);
        System.out.println("Rear brake pad compound: " + rearBrakePadCompound + "\n");
        System.out.println("Fuel per laps: " + fuelPerLap + "\n");

        System.out.println("Pit strategy data: ");

        System.out.println("Pit strategy: fuel to add: " + pitStrategy.get("fuelToAdd"));
        System.out.println("Pit strategy: Tyre set: " + pitStrategy.get("tyreSet"));
        System.out.println("Pit strategy: Tyres: Tyre compound: " + tyres.get("tyreCompound"));
        System.out.println("Pit strategy: Tyres: Tyre pressures: Front Left: " + tyrePressures.get(FRONT_LEFT));
        System.out.println("Pit strategy: Tyres: Tyre pressures: Front Right: " + tyrePressures.get(FRONT_RIGHT));
        System.out.println("Pit strategy: Tyres: Tyre pressures: Rear Left: " + tyrePressures.get(REAR_LEFT));
        System.out.println("Pit strategy: Tyres: Tyre pressures: Rear Right: " + tyrePressures.get(REAR_RIGHT));
        System.out.println("Pit strategy: Front brakepad compound: " + pitStrategy.get("frontBrakePadCompound"));
        System.out.println("Pit strategy: Rear brakepad compound:: " + pitStrategy.get("rearBrakePadCompound") + "\n");

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

        System.out.println("ARB Data: ");
        System.out.println("ARB Front: " + aRBFront);
        System.out.println("ARB Rear: " + aRBRear + "\n");
        //Wheelrate data: 
        System.out.println("Wheelrate data: ");
        System.out.println("Wheelrate: Front left: " + wheelRate.get(WHEELRATE_FRONT_LEFT));
        System.out.println("Wheelrate: Front right: " + wheelRate.get(WHEELRATE_FRONT_RIGHT));
        System.out.println("Wheelrate: Rear left: " + wheelRate.get(WHEELRATE_REAR_LEFT));
        System.out.println("Wheelrate: Rear right: " + wheelRate.get(WHEELRATE_REAR_RIGHT) + "\n");

        //Bumpstop Rate Up data: 
        System.out.println("Bumpstop Rateup data: ");
        System.out.println("Bumpstop Rateup: Front Left: " + bumpStopRateUp.get(BUMP_RATE_UP_FRONT_LEFT));
        System.out.println("Bumpstop Rateup: Front Right: " + bumpStopRateUp.get(BUMP_RATE_UP_FRONT_RIGHT));
        System.out.println("Bumpstop Rateup: Rear Left: " + bumpStopRateUp.get(BUMP_RATE_UP_REAR_LEFT));
        System.out.println("Bumpstop Rateup: Rear Right: " + bumpStopRateUp.get(BUMP_RATE_UP_REAR_RIGHT) + "\n");

        //BumpStop Rate Down data: 
        System.out.println("Bumpstop Ratedown data: ");
        System.out.println("Bumpstop Ratedown: Front Left: " + bumpStopRateDn.get(BUMP_RATE_DOWN_FRONT_LEFT));
        System.out.println("Bumpstop Ratedown: Front Right: " + bumpStopRateDn.get(BUMP_RATE_DOWN_FRONT_RIGHT));
        System.out.println("Bumpstop Ratedown: Rear Left: " + bumpStopRateDn.get(BUMP_RATE_DOWN_REAR_LEFT));
        System.out.println("Bumpstop Ratedown: Rear Right: " + bumpStopRateDn.get(BUMP_RATE_DOWN_REAR_RIGHT) + "\n");

        //BumpStop Window data: 
        System.out.println("Bumpstop window data: ");
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(BUMP_WINDOW_FRONT_LEFT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(BUMP_WINDOW_FRONT_RIGHT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(BUMP_WINDOW_REAR_LEFT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(BUMP_WINDOW_REAR_RIGHT) + "\n");

        //Brake data:
        System.out.println("Brake data: ");
        System.out.println("Braketorque: " + brakeTorque);
        System.out.println("Brake Bias: " + brakeBias + "\n");

        return mechanicalBalanceClass;
    }

    //Dampers data: 
    public static Dampers saveDamperData(JSONObject saveDamper) {
        JSONArray bumpSlow = (JSONArray) saveDamper.get("bumpSlow");
        JSONArray bumpFast = (JSONArray) saveDamper.get("bumpFast");
        JSONArray reboundSlow = (JSONArray) saveDamper.get("reboundSlow");
        JSONArray reboundFast = (JSONArray) saveDamper.get("reboundFast");

        Dampers dampersClass = new Dampers(bumpSlow, bumpFast, reboundSlow, reboundFast);

        //Bumpslow data: 
        System.out.println("Bumpstop slow front left: " + dampersClass.bumpSlow.get(BUMP_SLOW_FRONT_LEFT));
        System.out.println("Bumpstop slow front right: " + dampersClass.bumpSlow.get(BUMP_SLOW_FRONT_RIGHT));
        System.out.println("Bumpstop slow rear left: " + dampersClass.bumpSlow.get(BUMP_FAST_REAR_LEFT));
        System.out.println("Bumpstop slow rear right: " + dampersClass.bumpSlow.get(BUMP_FAST_REAR_RIGHT) + "\n");

        //Bumpfast data: 
        System.out.println("Bumpstop fast data: \n");
        System.out.println("Bumpstop fast front left: " + dampersClass.bumpFast.get(BUMP_FAST_FRONT_LEFT));
        System.out.println("Bumpstop fast front left: " + dampersClass.bumpFast.get(BUMP_FAST_FRONT_RIGHT));
        System.out.println("Bumpstop fast front left: " + dampersClass.bumpFast.get(BUMP_FAST_REAR_LEFT));
        System.out.println("Bumpstop fast front left: " + dampersClass.bumpFast.get(BUMP_FAST_REAR_RIGHT) + "\n");

        //Rebound slow data: 
        System.out.println("Rebound slow data: \n");
        System.out.println("Rebound slow front left: " + dampersClass.reboundSlow.get(REBOUND_SLOW_FRONT_LEFT));
        System.out.println("Rebound slow front left: " + dampersClass.reboundSlow.get(REBOUND_SLOW_FRONT_RIGHT));
        System.out.println("Rebound slow front left: " + dampersClass.reboundSlow.get(REBOUND_SLOW_REAR_LEFT));
        System.out.println("Rebound slow front left: " + dampersClass.reboundSlow.get(REBOUND_SLOW_REAR_RIGHT) + "\n");

        //Rebound fast data: 
        System.out.println("Rebound fast data: \n");
        System.out.println("Rebound fast front left: " + dampersClass.reboundFast.get(REBOUND_FAST_FRONT_LEFT));
        System.out.println("Rebound fast front left: " + dampersClass.reboundFast.get(REBOUND_FAST_FRONT_RIGHT));
        System.out.println("Rebound fast front left: " + dampersClass.reboundFast.get(REBOUND_FAST_REAR_LEFT));
        System.out.println("Rebound fast front left: " + dampersClass.reboundFast.get(REBOUND_FAST_REAR_RIGHT) + "\n");

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

        //Ride height
        System.out.println("Ride heightt data: \n");
        System.out.println("Ride height front left: " + aeroBalanceClass.rideHeight.get(RIDE_HEIGHT_FRONT_LEFT));
        System.out.println("Ride height front right: " + aeroBalanceClass.rideHeight.get(RIDE_HEIGHT_FRONT_RIGHT));
        System.out.println("Ride height rear left: " + aeroBalanceClass.rideHeight.get(RIDE_HEIGHT_REAR_LEFT));
        System.out.println("Ride height rear right: " + aeroBalanceClass.rideHeight.get(RIDE_HEIGHT_REAR_RIGHT) + "\n");

        //Rod length
        System.out.println("Rod length data: \n");
        System.out.println("Rod length front left: " + aeroBalanceClass.rodLength.get(ROD_LENGTH_FRONT_LEFT));
        System.out.println("Rod length front right: " + aeroBalanceClass.rodLength.get(ROD_LENGTH_FRONT_RIGHT));
        System.out.println("Rod length rear left: " + aeroBalanceClass.rodLength.get(ROD_LENGTH_REAR_LEFT));
        System.out.println("Rod length rear right: " + aeroBalanceClass.rodLength.get(ROD_LENGTH_REAR_RIGHT) + "\n");

        //brake ducts
        System.out.println("Brake duct data: \n");
        System.out.println("Brake duct front left: " + aeroBalanceClass.brakeDuct.get(BRAKE_DUCT_FRONT_LEFT));
        System.out.println("Brake duct front right: " + aeroBalanceClass.brakeDuct.get(BRAKE_DUCT_FRONT_RIGHT) + "\n");

        //Splitter 
        System.out.println("Aerodynamics data: \n");
        System.out.println("Front Splitter: " + splitter);

        //Rear wing 
        System.out.println("Rear wing: " + rearWing + "\n");

        return aeroBalanceClass;
    }

    public static DriveTrain saveDriveTrainData(JSONObject saveDriveTrain) {
        long preLoad = (long) saveDriveTrain.get("preload");
        System.out.println("Drivetrain preload: " + preLoad);

        DriveTrain driveTrainClass = new DriveTrain(preLoad);

        return driveTrainClass;
    }

    //main
>>>>>>> Stashed changes
    public static void main(String[] args) throws FileNotFoundException, ParseException {

        //reading the file
        String strJsn = getJson("C:\\Users\\rOlie\\Documents\\Assetto Corsa Competizione\\Setups\\ferrari_296_gt3\\nurburgring\\GO2 296 GT3 NUR S Q01.json");

        //making the parser
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJsn);
            JSONObject mainJsonObject = (JSONObject) object;

<<<<<<< Updated upstream
            //Car name : 
            String carName = (String) mainJsonObject.get("carName");
            System.out.println("Car name : " + carName);
            
            //Tyre Compound
=======
            //Basic setup datas: 
            //Car name: 
            String carName = (String) mainJsonObject.get("carName");
            System.out.println("Car name: " + carName + "\n");

            //Tyres
            System.out.println("Tyre data: \n");
>>>>>>> Stashed changes
            JSONObject basicSetup = (JSONObject) mainJsonObject.get("basicSetup");
            JSONObject tyres = (JSONObject) basicSetup.get("tyres");
<<<<<<< Updated upstream
            
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
            
=======
            Tyres x = saveTyreData(tyres);

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
>>>>>>> Stashed changes

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
