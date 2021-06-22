package vehicles;


public abstract class Vehicle {
    public static final double EARTH_GRAVITY_CONSTANT = 9.8;

    private String make;
    private String model;
    // private byte acceleration;
    // private byte deceleration = ;
    // private byte braking = ;
    // private int maxSpeed;
    private boolean hasDriver = false;
    private byte age;
    private byte[] gears;
    private long uniqueID;
    
    public enum powerType {
        ELECTRIC,
        HYBRID,
        PETROL,
        DIESEL
    }
    private powerType vehicleType;

    public Vehicle(String make, String model) {
        super();
        this.make = make;
        this.model = model;
        // this.acceleration = acceleration;
        // this.maxSpeed = maxSpeed;
        // this.age = age;
        // this.gears = gears;
        // this.uniqueID; // TODO create unique ID
    }

    public void on() {

    }

    public void off() {
        
    }

    public void accelerate() {

    }

    public void decelerate() {

    }

    public void brake() {
        
    }
}
