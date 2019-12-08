
public class Car extends Vehicle {
	private int numOfDoors;
	private String color;
	
	public Car(String idPlate, String brand, String dateTime, int numOfDoors, String color) {
		super(idPlate, brand, dateTime, "Car");
		this.numOfDoors = numOfDoors;
		this.color = color;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
