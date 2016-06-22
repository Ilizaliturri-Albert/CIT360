import java.util.HashMap;
import java.util.Map;

public class CarView {
	public void printCarDetails(String make, String model, String year) {
		System.out.println();
		System.out.println("Car Details");
		System.out.println("-------------------------");
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}

	public void printCarDashboard(String direction, String speed) {
		System.out.println();
		System.out.println("Car Dashboard");
		System.out.println("-------------------------");
		System.out.println("direction: " + direction);
		System.out.println("speed: " + speed);
	}

	public void printCars(HashMap<String, Car> carsToPrint) {
		for (Map.Entry<String, Car> entry : carsToPrint.entrySet()) {
			String owner = entry.getKey();
			Car car = entry.getValue();
			System.out.println("Owner: " + owner);
			System.out.println(car.toString());
			System.out.println();
		}
	}
}
