
public class ThreeWheeler extends Vehicle {
	private String type;

	public ThreeWheeler(String idPlate, String brand, String dateTime, String type) {
		super(idPlate, brand, dateTime, "ThreeWheeler");
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
