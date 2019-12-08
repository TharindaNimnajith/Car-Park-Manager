
public class Van extends Vehicle {
	private int numOfSeats;

	public Van(String idPlate, String brand, String dateTime, int numOfSeats) {
		super(idPlate, brand, dateTime, "Van");
		this.numOfSeats = numOfSeats;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
}
