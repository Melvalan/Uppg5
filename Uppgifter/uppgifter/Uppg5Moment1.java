package uppgifter;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Uppg5Moment1 {

	static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public static void main(String[] args) {
		
		String[] possibilities = {"Enter new Vehicle", "Print Current Vehicles", "Close Programme"};
		
		mainLoop: while(true) {
			
			switch (JOptionPane.showOptionDialog(null,
					"Please, select one of the options below to perform that function.",
					"Vehicle Database Programme 2000",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					possibilities,
					possibilities[0])) {
			
					case 0:
						
						registerVehicle();
						break;
						
					case 1:
						
						JOptionPane.showMessageDialog(null, "The currently entered vehicles, with the newest one last:\n\n" 
						+ printVehicles());
						break;
						
					case 2:
						
						break mainLoop;
						
					default:
						
						break;
			
			}
		}
		
	}
	
static String printVehicles() {
		
		String printer = "";
		
		for(int i = 0; i < Uppg5Moment1.vehicles.size(); i++) {
			
			printer += vehicles.get(i).getInfo() + "\n"; 
			
		}
		
		return printer;
		
	}

	static void registerVehicle() {
	
		String[] separatedInput = new String[9];
			
		inputLoop: while(true) {
		
			String input = JOptionPane.showInputDialog("Hello and welcome to the fantastic vehicle management database, programme."
				+ "\nYou may now enter a vehicle. Please, do so in the following fashion for a generic vehicle:"
				+ "\n\n<Registration number>,<First and Last name>"
				+ "\n\nTo enter a Truck, do it in the following fashion:"
				+ "\n\n<Registration number>,<First and Last name>,<Manufacturer>,<Model>"
				+ "\n\nTo enter a personal car, do it in the following fashion:"
				+ "\n\n<Registration number>,<First and Last name>,<Manufacturer>,<Model>,<Number of Seats>"
				+ "\n\nIf you want to define some more information for the truck, do it in the following fashion:"
				+ "\n\n<Registration number>,<First and Last name>,<Manufacturer>,<Model>,<Loaded with>,<Capacity>,<Depart>,<Destination>");
		
			if(input == null) {
				
				break inputLoop;
				
			}
			
			try {
		
				separatedInput = input.split(",");
				System.out.println("Debugging: " + separatedInput[0] + separatedInput[1]);
				
				switch(separatedInput.length) {
				
				case 2:

					vehicles.add(new Vehicle(separatedInput[0],separatedInput[1]));
					
					break inputLoop;
					
				case 4:

					vehicles.add(new TruckVehicle(separatedInput[0],separatedInput[1],separatedInput[2],separatedInput[3]));
					
					break inputLoop;
					
				case 5:

					vehicles.add(new PersonalVehicle(separatedInput[0],separatedInput[1],separatedInput[2],separatedInput[3],Integer.parseInt(separatedInput[4])));
					
					break inputLoop;
				
				case 8:
					
					vehicles.add(new TruckVehicleModifiers(separatedInput[0],separatedInput[1],separatedInput[2],separatedInput[3],separatedInput[4],separatedInput[5],separatedInput[6],separatedInput[7]));
					
					break inputLoop;
				
				case 9:
					
					vehicles.add(new PersonalVehicle(separatedInput[0],separatedInput[1],separatedInput[2],separatedInput[3],Integer.parseInt(separatedInput[4]),Double.parseDouble(separatedInput[5]),Integer.parseInt(separatedInput[6]),Double.parseDouble(separatedInput[7]),Integer.parseInt(separatedInput[8])));
									
					break inputLoop;
					
				}
				
			}
		
			catch(Exception e) {
			
				JOptionPane.showMessageDialog(null, "Sigh, well... Apparantly the instructions were not clear enough..."
					+ "\nFirst enter registration number, then first and last name. Make sure to separate those with a comma."
					+ "\nNo spaces, just a comma ','."
					+ "\nDo please, also keep in mind where you should enter just numbers, and make sure to use a decimal point to indicate decimal numbers. That is all."
					+ "\n\nYou may try again... I guess.");
			
				continue inputLoop;
			
			}
		
		}
	
	}

}
