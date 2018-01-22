package uppgifter;

import javax.swing.JOptionPane;

public class Methods {//Denna klass kommer att innehålla alla "extra metoder" inom denna uppgift.

	static String printVehicles() {
		
		String printer = "";
		
		for(int i = 0; i < Uppg5Moment1.vehicles.size(); i++) {
			
			printer += Uppg5Moment1.vehicles.get(i).getInfo() + "\n"; 
			
		}
		
		return printer;
		
	}
	
	static void registerVehicle() {
		
		String[] separatedInput = new String[2];
				
		inputLoop: while(true) {
			
			String input = JOptionPane.showInputDialog("Hello and welcome to the fantastic vehicle management database, programme."
				+ "\nYou may now enter a vehicle. Please, do so in the following fashion:"
				+ "\n\n<Registration number>,<First and Last name>");
			
			try {
			
				separatedInput = input.split(",");
				System.out.println("Debugging: " + separatedInput[0] + separatedInput[1]);
				
				Uppg5Moment1.vehicles.add(new Vehicle(separatedInput[0],separatedInput[1]));
				
				break inputLoop;
				
			}
			
			catch(Exception e) {
				
				JOptionPane.showMessageDialog(null, "Sigh, well... Apparantly the instructions were not clear enough..."
						+ "\nFirst enter registration number, then first and last name. Make sure to separate those with a comma."
						+ "\nNo spaces, just a comme ','."
						+ "\n\nYou may try again... I guess.");
				
				continue inputLoop;
				
			}
			
		}
		
	}
	
	static void exit() {
		
		
		
	}
	
}
