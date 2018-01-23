package uppgifter;

public class TruckVehicleModifiers extends TruckVehicle{
	
	TruckVehicleModifiers(String regNum, String own, String manu, String model, String lw, String c, String dep, String dest){
		
		super(regNum,own,manu,model);
		this.setTruckVehicleModifiers(lw, c, dep, dest);
		
	}
	
	@Override
	String getInfo() {
		
		return "Truck with registration number: " + this.registrationNumber + " is owned by " + this.owner
				+ "\nThe truck is manufactured by: " + this.manufacturer + " and the model is: " + this.make + "."
				+ "\nThe truck is loaded with: " + this.loadedWith + " of which it can hold: " + this.capacity + ". "
				+ "\nThe truck is driving from " + this.depart + " to " + this.destination + ".";
		
	}
	
}
