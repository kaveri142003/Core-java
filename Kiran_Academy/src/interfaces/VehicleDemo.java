package interfaces;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Car("BMW" , "X500" , 5000);
		System.out.println("CAR DAILY RENT DETAILS : ");
		System.out.println();
		v1.calculateRent(5);
		String s = v1.getVehicleType();
		System.out.println(s);
		
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		Vehicle v2 = new Bike("Ninja" , "V600" , 3000);
		System.out.println("BIKE DAILY RENT DETAILS : ");
		System.out.println();
		v2.calculateRent(5);
		String s1 = v2.getVehicleType();
		System.out.println(s1);
		
	}

}
