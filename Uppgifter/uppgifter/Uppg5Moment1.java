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
						
						Methods.registerVehicle();
						System.out.println("Debugging: " + vehicles.get(0).getInfo());
						break;
						
					case 1:
						
						JOptionPane.showMessageDialog(null, "The currently entered vehicles, with the newest one last:\n\n" 
						+ Methods.printVehicles());
						break;
						
					case 2:
						
						break mainLoop;
						
					default:
						
						break;
			
			}
		}
		
	}

}
