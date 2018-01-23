package uppgifter;

public class TruckVehicle extends Vehicle {

	TruckVehicle(String r, String o, String manu, String model){
		
		super(r,o);
		this.setTruckVehicleInfo(manu, model);
		
	}
	
	@Override
	String getInfo() {
		
		return "Truck with registration number: " + this.registrationNumber + " is owned by " + this.owner
				+ "\nThe truck is manufactured by: " + this.manufacturer + " and the model is: " + this.make + ".\n";
		
	}
	
}
