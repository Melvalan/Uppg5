package uppgifter;

public abstract class AbstractVehicle {
	
	private String registrationNumber;
	private String owner;
	private String manufacturer;
	private String make;
	private String numberOfSeats;
		
	AbstractVehicle(String r, String o) {
		
		this.registrationNumber = r;
		this.owner = o;
		
	}
	
	String getInfo() {
		
		return registrationNumber + " is owned by " + owner;
		
	}

	public void setPersonalVehicleInfo(String manu, String model, String num) {
		
		this.manufacturer = manu;
		this.make = model;
		this.numberOfSeats = num;
	
	}

	public void setTruckVehicleInfo(String manu, String model) {
		
		this.manufacturer = manu;
		this.make = model;
		
	}
	
}
