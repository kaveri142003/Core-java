package abstraction;

public class Sphere extends CalculateVolume{
	
	private float radius;
	
	Sphere(float radius){
		this.radius = radius;
		calVolume();
	}
	
	@Override
	public void calVolume() {
		double volume;
		volume = 1.33 * 3.14 * radius * radius * radius;
		System.out.println("Volume of Sphere  : " + volume);
	}
}
