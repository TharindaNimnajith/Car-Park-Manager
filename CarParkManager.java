
public interface CarParkManager {
	final int totalVehicleSlots = 20;
	boolean vehicleEntered();
	int vehicleLeft();
	int getNumEmptySlots();
	int getNumOccupiedSlots();
}
