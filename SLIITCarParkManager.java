import java.util.ArrayList;
import java.util.Scanner;

public class SLIITCarParkManager implements CarParkManager {
	private ArrayList<Vehicle> arrayList = new ArrayList<Vehicle>();
	
	Scanner myScanner = new Scanner(System.in);
	
	@Override
	public boolean vehicleEntered() {
		// TODO Auto-generated method stub
		if(arrayList.size() < totalVehicleSlots) {
			DateTime dateTimeClass = new DateTime();
			String dateTime = dateTimeClass.getDateTime();

			myScanner.nextLine();
			System.out.print("Enter vehicle type(Car/ Van/ ThreeWheeler): ");
			String vType = myScanner.nextLine();
			
			if(vType.equalsIgnoreCase("Car")) {
				String idPlate, brand, color;
				int numOfDoors;
				
				System.out.print("Enter ID Plate: ");
				idPlate = myScanner.nextLine();
				
				System.out.print("Enter Brand: ");
				brand = myScanner.nextLine();
				
				System.out.print("Enter Color: ");
				color = myScanner.nextLine();
				
				//myScanner.nextLine();
				
				System.out.print("Enter number of doors: ");
				numOfDoors = myScanner.nextInt();
				
				Vehicle car = new Car(idPlate, brand, dateTime, numOfDoors, color);
				
				arrayList.add(car);
			} else if(vType.equalsIgnoreCase("Van")) {
				String idPlate, brand;
				int numOfSeats;

				System.out.print("Enter ID Plate: ");
				idPlate = myScanner.nextLine();
				
				System.out.print("Enter Brand: ");
				brand = myScanner.nextLine();
				
				System.out.print("Enter number of seats: ");
				numOfSeats = myScanner.nextInt();

				Van van = new Van(idPlate, brand, dateTime, numOfSeats);
				
				arrayList.add(van);
			} else if(vType.equalsIgnoreCase("ThreeWheeler")) {
				String idPlate, brand, type;
				
				System.out.print("Enter ID Plate: ");
				idPlate = myScanner.nextLine();
				
				System.out.print("Enter Brand: ");
				brand = myScanner.nextLine();
				
				System.out.print("Enter Type(Taxi/NotForHire): ");
				type = myScanner.nextLine();

				ThreeWheeler threeWheeler = new ThreeWheeler(idPlate, brand, dateTime, type);
				
				arrayList.add(threeWheeler);
			} else {
				System.out.println("Sorry! Invalid Vehicle Type");
				return false;
			}
		} else {
			System.out.println("Sorry! No parking slots available");
			return false;
		}
		System.out.println("Remaining parking slots: " + (totalVehicleSlots - arrayList.size()));
		return true;
	}

	@Override
	public int vehicleLeft() {
		// TODO Auto-generated method stub
		myScanner.nextLine();
		System.out.print("Enter vehicle id plate: ");
		String idPlate = myScanner.nextLine();
		
		for(Vehicle v: arrayList) {
			if(v.getIdPlate().equalsIgnoreCase(idPlate)) {
				System.out.println("Type of the vehicle leaving park: " + v.getType());
				System.out.println("Vehicle ID: " + v.getIdPlate());
				arrayList.remove(v);
				return totalVehicleSlots - arrayList.size();
			}			
		}
		return totalVehicleSlots - arrayList.size();
	}

	@Override
	public int getNumEmptySlots() {
		// TODO Auto-generated method stub
		return totalVehicleSlots - arrayList.size();
	}

	@Override
	public int getNumOccupiedSlots() {
		// TODO Auto-generated method stub
		return arrayList.size();
	}
	
	public void printVehicles() {
		for(Vehicle v: arrayList) {
			System.out.println("\nID Plate: " + v.getIdPlate());
			System.out.println("Entry Time: " + v.getDateTime());
			System.out.println("Vehicle type: " + v.getType());
		}
	}
}
