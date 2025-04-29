package methodOverriding;

public class Rectangle extends Shape {
	
	@Override
	void getArea() {
		super.getArea();
		int l = 5 , b =10;
		System.out.println("Area of Rectangle is : " + l*b);
	}
}
