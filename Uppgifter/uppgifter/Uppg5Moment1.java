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
						System.out.println("Debugging: " + vehicles.get(0).getInfo());
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
	
		String[] separatedInput = new String[2];
			
		inputLoop: while(true) {
		
			String input = JOptionPane.showInputDialog("Hello and welcome to the fantastic vehicle management database, programme."
				+ "\nYou may now enter a vehicle. Please, do so in the following fashion for a generic vehicle:"
				+ "\n\n<Registration number>,<First and Last name>"
				+ "\n\nTo enter a Truck, do it in the following fashion:"
				+ "\n\n<Registration number>,<First and Last name>,<Manufacturer>,<Model>"
				+ "\n\nTo enter a personal car, do it in the following fashion:"
				+ "\n\n<Registration number>,<First and Last name>,<Manufacturer>,<Model>,<Number of Seats>");
		
			try {
		
				separatedInput = input.split(",");
				System.out.println("Debugging: " + separatedInput[0] + separatedInput[1]);
			
				vehicles.add(new Vehicle(separatedInput[0],separatedInput[1]));
			
				vehicles.add(new TruckVehicle("MKZ-234","Christian","Toyota","54"));
				
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
