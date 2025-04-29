package abstraction;

public class Tiger extends Animal{
	
	
	@Override
	public void eat() {
		System.out.println("Eats non-veg");
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeps 10-12 hrs");
	}
}
