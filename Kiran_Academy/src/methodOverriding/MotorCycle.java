package methodOverriding;

public class MotorCycle extends Vehicle9{
	
	private boolean hasSidecar;

    public MotorCycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 30.0; // Higher efficiency for motorcycles
    }

    @Override
    public double getMaxSpeed() {
        return 200.0; // High speed for a motorcycle
    }

}
