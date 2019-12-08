
public abstract class Vehicle {
	protected String idPlate;
	protected String brand;
	protected String dateTime;
	protected String type;
	
	public Vehicle(String idPlate, String brand, String dateTime, String type) {
		super();
		this.idPlate = idPlate;
		this.brand = brand;
		this.dateTime = dateTime;
		this.type = type;
	}

	public String getIdPlate() {
		return idPlate;
	}

	public void setIdPlate(String idPlate) {
		this.idPlate = idPlate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
