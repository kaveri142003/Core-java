package methodOverriding;

public class Vehicle9Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Car9 car = new Car9("Toyota", "Corolla", 2022, "Petrol", 5);
	        Truck truck = new Truck("Volvo", "FH16", 2021, "Diesel", 20);
	        MotorCycle motorcycle = new MotorCycle("Yamaha", "R1", 2023, "Petrol", false);

	        car.displayInfo();
	        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
	        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
	        System.out.println("Distance Travelled: "+ truck.calculateDistanceTraveled(120, 2) + " km\n");

	        truck.displayInfo();
	        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
	        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");
	        System.out.println("Distance Travelled: "+ truck.calculateDistanceTraveled(80, 2) + " km\n");

	        motorcycle.displayInfo();
	        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
	        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");
	        System.out.println("Distance Travelled: "+ truck.calculateDistanceTraveled(50, 2) + " km\n");
	        

	}

}
