package uppgifter;

public class PersonalVehicleModifiers extends AbstractVehicle{
	
	PersonalVehicleModifiers(double mV, int hk, double use, int km){
		
		super();
		
		this.motorVolume = mV;
		this.horsePower = hk;
		this.fuelConsumption = use;
		this.distance = km;
		
	}
	
	@Override
	String getInfo() {
		
		return "Personal Vehicle with registration number: " + this.registrationNumber + " is owned by " + this.owner
				+ "\nThe personal car is manufactured by: " + this.manufacturer + " and the model is: " + this.make + "" +"."
				+ "\nAdditional Information: Its motor volume is: " + this.motorVolume + " which gives it a horse power of " + this.horsePower + ", this means it consumes " + this.fuelConsumption + " and finally, the car has driven: " + this.distance + " km.\n";
		
	}
	
}
