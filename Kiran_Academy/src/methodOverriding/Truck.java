package methodOverriding;

public class Truck extends Vehicle9{
	
	private double loadCapacity; // in tons

    public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 8.0; // Lower efficiency due to heavy load
    }

    @Override
    public double getMaxSpeed() {
        return 120.0; // Max speed for a truck
    }
    
    @Override
    public double calculateDistanceTraveled(float speed , float time) {
        return speed * time;
    }
	

}
