package abstraction;

public class Deer extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Vegetarian");
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeps 8-10 hrs");
	}
}
