package interfaces;

public class Bike implements Vehicle{
	
	private String brand , model ;
	private double dailyRent, rent;
	
	Bike(String brand , String model , double dailyRent){
		this.brand = brand;
		this.model = model;
		this.dailyRent = dailyRent;
	}
	
	public double calculateRent(int days) {
		return rent = days * dailyRent ;
	}
	public String getVehicleType() {
		return "Brand : "  + brand + " , Model : " + model + " , Daily Rent : " + dailyRent + " , Total Rent : " + rent;
	}
}
