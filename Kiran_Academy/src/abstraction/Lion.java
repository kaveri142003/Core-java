package abstraction;

public class Lion extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Eats Non-veg");
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeps 7-8 hrs");
	}
	
}
