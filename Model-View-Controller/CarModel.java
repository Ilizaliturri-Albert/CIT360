import java.util.HashMap;
import java.util.Map;


public class CarModel {
	private HashMap<String, Car> cars = new HashMap<String, Car>();
	
	public HashMap<String, Car> getCarsByMake(String make) {
		HashMap<String, Car> carsByMake = new HashMap<String, Car>();
		
		for (Map.Entry<String, Car> entry : this.cars.entrySet()) {
			String owner = entry.getKey();
			Car car = entry.getValue();
			
			if (car.getMake().equals(make)) {
				carsByMake.put(owner, car);
			}
		}
		
		return carsByMake;
	}
	
	public HashMap<String, Car> getCarsByModel(String model) {
		HashMap<String, Car> carsByModel = new HashMap<String, Car>();
		
		for (Map.Entry<String, Car> entry : this.cars.entrySet()) {
			String owner = entry.getKey();
			Car car = entry.getValue();
			
			if (car.getModel().equals(model)) {
				carsByModel.put(owner, car);
			}
		}
		
		return carsByModel;
	}
	
	public HashMap<String, Car> getCarsByYear(String year) {
		HashMap<String, Car> carsByYear = new HashMap<String, Car>();
		
		for (Map.Entry<String, Car> entry : this.cars.entrySet()) {
			String owner = entry.getKey();
			Car car = entry.getValue();
			
			if (car.getYear().equals(year)) {
				carsByYear.put(owner, car);
			}
		}
		
		return carsByYear;
	}
	
	public HashMap<String, Car> getCarsByOwner(String owner) {
		HashMap<String, Car> carsByOwner = new HashMap<String, Car>();
		
		carsByOwner.put(owner, this.cars.get(owner));
		
		return carsByOwner;
	}
	
	public Car createCar(String owner, String make, String model, String year) {
		//	Create new car
		Car newCar = new Car(make, model, year);
		
		//	Add it to our HashMap
		this.cars.put(owner, newCar);
		return newCar;
	}
	
	public void saveCarState(String owner, Car car) {
		this.cars.put(owner, car);
	}
	
	public HashMap<String, Car> loadCarState(String owner) {
		HashMap<String, Car> loadCar = new HashMap<String, Car>();
		loadCar.put(owner, this.cars.get(owner));
		return loadCar;
	}
	
	public static void printCars(HashMap<String, Car> carsToPrint) {
		for (Map.Entry<String, Car> entry : carsToPrint.entrySet()) {
			String owner = entry.getKey();
			Car car = entry.getValue();
			System.out.println("Owner: " + owner);
			System.out.println(car.toString());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		CarModel model = new CarModel();
		
		model.createCar("Albert", "Infinti", "4 Door", "2000");
		model.createCar("Janice", "Lexus", "Sedan", "2010");
		model.createCar("Valerie", "BMW", "4 Door", "2009");
		model.createCar("Becky", "Nissan", "4 Door", "2004");
		model.createCar("Richard", "Dodge", "Truck", "2007");
		model.createCar("Kami", "Honda", "Sedan", "2009");
		model.createCar("Rocky", "KIA", "4 Door", "2015");
		
		System.out.println("Driving Alberts's Car");
		Car albertCar = model.getCarsByOwner("Albert").get("Albert");
		albertCar.setDirection("Forward");
		albertCar.setSpeed("25mph");
		
		model.saveCarState("Albert", albertCar);
		Car albertCarLoaded = model.getCarsByOwner("Albert").get("Albert");
		System.out.println("Dashboard:");
		System.out.println("Direction: " + albertCarLoaded.getDirection());
		System.out.println("Speed: " + albertCarLoaded.getSpeed());
		
//		HashMap<String, Car> carsMake = model.getCarsByMake("Infiniti");
//		HashMap<String, Car> carsModel = model.getCarsByModel("4 Door");
//		HashMap<String, Car> carsYear = model.getCarsByYear("2000");
//		printCars(carsYear);

	}
}
