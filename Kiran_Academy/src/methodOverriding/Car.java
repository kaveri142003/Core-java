package methodOverriding;

public class Car extends Vehicle {
	
	@Override
	public void drive(){
		super.drive();
		System.out.println("Car Class");
	}

}
