public class Car {
	// Car Details
	private String make;
	private String model;
	private String year;
	
	// Car Dashboard
	private String direction;
	private String speed;
	
	public Car(String make, String model, String year) {
		// Car Details
		this.make = make;
		this.model = model;
		this.year = year;

		// Car Dashboard
		this.direction = "None";
		this.speed = "0mph";
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public String toString() {
		return "Make: " + make + "\nModel: " + model + "\nYear: " + year;
	}
}
