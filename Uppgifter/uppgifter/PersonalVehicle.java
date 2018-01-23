package uppgifter;

public class PersonalVehicle extends Vehicle{

	PersonalVehicle(String r, String o, String manu, String model, String num){
		
		super(r,o);
		this.setPersonalVehicleInfo(manu, model, num);
	
	}
	
	@Override
	String getInfo() {
		
		return "Personal Vehicle with registration number: " + this.registrationNumber + " is owned by " + this.owner
				+ "\nThe personal car is manufactured by: " + this.manufacturer + " and the model is: " + this.make + "" +".\n";
		
	}
	
}
