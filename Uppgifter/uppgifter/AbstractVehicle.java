package uppgifter;

public abstract class AbstractVehicle {
	
	protected String registrationNumber;
	protected String owner;
	protected String manufacturer;
	protected String make;
	protected String numberOfSeats;
	protected String loadedWith;
	protected String capacity;
	protected String depart;
	protected String destination;
		
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
	
	public void setTruckVehicleModifiers(String lW, String c, String dep, String dest) {
		
		this.loadedWith = lW;
		this.capacity = c;
		this.depart = dep;
		this.destination = dest;
		
	}
	
}
