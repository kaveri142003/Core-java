package methodOverriding;

public abstract class Vehicle9 {
	String make;
	String model;
	int year;
	String fuelType;
	
	public Vehicle9(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public abstract double calculateFuelEfficiency(); // Returns km per liter
    public abstract double getMaxSpeed(); // Returns max speed in km/h
    
    public double calculateDistanceTraveled(float speed , float time) {
        return speed * time;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType);
    }
}
