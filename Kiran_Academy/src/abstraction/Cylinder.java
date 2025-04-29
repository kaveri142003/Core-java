package abstraction;

public class Cylinder extends CalculateVolume{
	private float radius , height;
	
	Cylinder(float radius , float height){
		this.height = height;
		this.radius = radius;
		calVolume();
	}
	
	@Override
	public void calVolume() {
		double volume;
		volume = 3.14 * radius * radius * height;
		System.out.println("Volume of Cylinder  : " + volume);
	}
}
