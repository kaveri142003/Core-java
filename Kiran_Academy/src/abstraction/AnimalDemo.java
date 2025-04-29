package abstraction;

public class AnimalDemo {
	
	public static void main(String[] args) {
		Animal a1 = new Lion();
		a1.eat();
		a1.sleep();
		
		System.out.println();
		Animal a2 = new Tiger();
		a2.eat();
		a2.sleep();
		
		System.out.println();
		Animal a3 = new Deer();
		a3.eat();
		a3.sleep();
	}
}
