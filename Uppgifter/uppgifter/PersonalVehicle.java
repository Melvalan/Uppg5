package uppgifter;

import javax.swing.JOptionPane;

public class PersonalVehicle extends Vehicle{

	PersonalVehicleModifiers carModifier;
	
	PersonalVehicle(String r, String o, String manu, String model, int num){
		
		super(r,o);
		this.setPersonalVehicleInfo(manu, model, num);
	
	}
	
	@Override
	String getInfo() {
		
		return (carModifier==null)?"Personal Vehicle with registration number: " + this.registrationNumber + " is owned by " + this.owner
				+ "\nThe personal car is manufactured by: " + this.manufacturer + " and the model is: " + this.make + "" +".\n":carModifier.getInfo();
		
	}
	
	PersonalVehicle(String r, String o, String manu, String model, int num, double mV, int hk, double use, int km){
		
		super(r,o);
		

		this.setPersonalVehicleInfo(manu, model, num);	
		carModifier = new PersonalVehicleModifiers(mV,hk,use,km);
		
	}
	
}
