public class Car {
     private String description;
     private boolean isEngineStared;

    public Car(String description) {
        this.description = description;
    }

    public static Car createCar(char type, String description){
        return switch (type){
            case 'g' -> new GasPoweredCar(description);
            case 'e' -> new ElectricCar(description);
            case 'h' -> new HybridCar(description);
            default -> new Car(description);
        };

    }

    public void startEngine(){
         System.out.println("Starting the "+description+" engine.");
         isEngineStared = true;
     }

     public void drive(){
         if(!isEngineStared){
             startEngine();
         }
         runEngine();
         System.out.println("driving "+description);
     }

     protected void runEngine(){
         System.out.println("Engine is running in "+description );
     }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        this(description,0.0,1);
    }

    public GasPoweredCar(String description,double avgKmPerLitre) {
        this(description,avgKmPerLitre,1);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        System.out.println(" Gas powered "+description+" car is created");
    }

    @Override
    protected void runEngine() {
        System.out.println("GasPowered Engine is running");
    }
}

class ElectricCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description) {
        this(description,0.0,1);
    }

    public ElectricCar(String description, double avgKmPerLitre) {
        this(description,avgKmPerLitre,1);
    }

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        System.out.println(" Electric "+description+" car is created");
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric Engine is running");
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        this(description,0.0,1,1);
    }

    public HybridCar(String description, double avgKmPerLitre) {
        this(description,0.0,1,1);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize) {
        this(description,0.0,1,1);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
        System.out.println(getClass().getSimpleName()+description+" car is created");
    }
    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName()+" Engine is running");
    }
}
