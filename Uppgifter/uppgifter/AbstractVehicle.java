package uppgifter;

public abstract class AbstractVehicle {
	
	protected String registrationNumber;
	protected String owner;
	protected String manufacturer;
	protected String make;
	protected String numberOfSeats;
		
	AbstractVehicle(String r, String o) {
		
		this.registrationNumber = r;
		this.owner = o;
		
	}
	
	String getInfo() {
		
		return "Vehicle with registration number: " + registrationNumber + " is owned by " + owner + ".\n";
		
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
