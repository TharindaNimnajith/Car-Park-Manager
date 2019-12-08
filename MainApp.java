import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
	 	Scanner myScanner = new Scanner(System.in);
		
		SLIITCarParkManager sliitCarParkManager = new SLIITCarParkManager();
		
		int option = 0;
		
		while(option != 6) {
		
		System.out.println("\n-----Option List-----");
		System.out.println("1. Enter Vehicle");
		System.out.println("2. Remove Vehicle");
		System.out.println("3. Print Vehicles");
		System.out.println("4. Print Number of Emply Slots");
		System.out.println("5. Print Number of Occupied Slots");
		System.out.println("6. Exit");
		
		System.out.print("Select an option: ");
		option = myScanner.nextInt();
		
		if(option == 1) {
			sliitCarParkManager.vehicleEntered();
		} else if(option == 2) {
			sliitCarParkManager.vehicleLeft();
		} else if(option == 3) {
			sliitCarParkManager.printVehicles();
		} else if(option == 4) {
			System.out.println(sliitCarParkManager.getNumEmptySlots());
		} else if(option == 5) {
			System.out.println(sliitCarParkManager.getNumOccupiedSlots());
		} else if(option == 6) {
			System.out.println("Exiting the programme");
		}
		}
	}
}
