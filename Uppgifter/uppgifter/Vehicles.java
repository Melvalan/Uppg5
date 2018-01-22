package uppgifter;

public class Vehicles implements AbstractVehicle{

	private String registrationNumber;
	private String owner;
	
	Vehicles(String r, String o){
		
		this.registrationNumber = r;
		this.owner = o;
		
	}
	
}
