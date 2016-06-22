import java.util.HashMap;

public class CarController {
	private CarModel model;
	private CarView view;

	public CarController(CarModel model, CarView view) {
		this.model = model;
		this.view = view;
	}
	
	public HashMap<String, Car> getCarsByMake(String make) {
		return this.model.getCarsByMake(make);
	}


	public HashMap<String, Car> getCarsByModel(String model) {
		return this.model.getCarsByModel(model);
	}

	public HashMap<String, Car> getCarsByYear(String year) {
		return this.model.getCarsByYear(year);
	}

	public HashMap<String, Car> getCarsByOwner(String owner) {
		return this.model.getCarsByOwner(owner);
	}

	public void createCar(String owner, String make, String model, String year) {
		Car newCar = this.model.createCar(owner, make, model, year);
	}

	public void saveCarState(String owner, Car car) {
		this.model.saveCarState(owner, car);
	}

	public HashMap<String, Car> loadCarState(String owner) {
		return this.model.loadCarState(owner);
	}

	public void updateCarViewDetails(Car car) {
		view.printCarDetails(car.getMake(), car.getModel(), car.getYear());
	}

	public void updateCarViewDashboard(Car car) {
		view.printCarDashboard(car.getDirection(), car.getSpeed());
	}

	public void printCars(HashMap<String, Car> carsToPrint) {
		view.printCars(carsToPrint);
	}

	public void updateView(Car car) {
		updateCarViewDetails(car);
		updateCarViewDashboard(car);
	}
}
