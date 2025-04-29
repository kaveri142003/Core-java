package methodOverriding;

public class Car9 extends Vehicle9{
	
	private int passengers;

    public Car9(String make, String model, int year, String fuelType, int passengers) {
        super(make, model, year, fuelType);
        this.passengers = passengers;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0; // Average fuel efficiency in km per liter
    }

    @Override
    public double getMaxSpeed() {
        return 180.0; // Average max speed in km/h
    }
}
