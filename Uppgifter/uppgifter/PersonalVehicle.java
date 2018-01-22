package uppgifter;

public class PersonalVehicle extends Vehicle{

	PersonalVehicle(String r, String o, String manu, String model, String num){
		
		super(r,o);
		this.setPersonalVehicleInfo(manu, model, num);
	
	}
	
}
