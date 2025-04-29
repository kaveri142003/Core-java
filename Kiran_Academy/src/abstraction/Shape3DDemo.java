package abstraction;

public class Shape3DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape3D s1 = new Sphere3D();
		s1.calVolume();
		s1.calSurfaceArea();
		
		Shape3D s2 = new Cube3D();
		s2.calVolume();
		s2.calSurfaceArea();
		
	}

}
