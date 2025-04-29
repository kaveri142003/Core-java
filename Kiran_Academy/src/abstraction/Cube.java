package abstraction;

public class Cube extends CalculateVolume{
	
	private float edge;
	
	Cube(float edge){
		this.edge = edge;
		calVolume();
	}
	
	@Override
	public void calVolume() {
		float volume;
		volume = edge * edge * edge;
		System.out.println("Volume of Cube  : " + volume);
	}
}
