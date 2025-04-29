package abstraction;

public class DemoAppliance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appliance a = new Refrigerator();
		a.turnOn();
		
		Appliance a1 = new WashingMachine();
		a1.turnOn();
	}

}
