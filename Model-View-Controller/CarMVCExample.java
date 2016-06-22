import java.util.HashMap;

public class CarMVCExample {
	public static void main(String[] args) {

		CarController controller = new CarController(new CarModel(), new CarView());

		// Build Cars
		controller.createCar("Albert", "Infinti", "4 Door", "2000");
		controller.createCar("Janice", "Lexus", "Sedan", "2010");
		controller.createCar("Valerie", "BMW", "4 Door", "2009");
		controller.createCar("Becky", "Nissan", "4 Door", "2004");
		controller.createCar("Richard", "Dodge", "Truck", "2007");
		controller.createCar("Kami", "Honda", "Sedan", "2009");
		controller.createCar("Rocky", "KIA", "4 Door", "2015");

		// Show cars that are of make Infiniti
		HashMap<String, Car> carsMake = controller.getCarsByMake("Infinti");
		System.out.println("Make Infinti");
		System.out.println("------------------------------------------");
		controller.printCars(carsMake);

		// Show cars that are of model Sedan
		HashMap<String, Car> carsModel = controller.getCarsByModel("Sedan");
		System.out.println("Model Sedan");
		System.out.println("------------------------------------------");
		controller.printCars(carsModel);

		// Show cars that are of year 2009
		HashMap<String, Car> carsYear = controller.getCarsByYear("2009");
		System.out.println("Year 2009");
		System.out.println("------------------------------------------");
		controller.printCars(carsYear);

		// Get Car and modify it then save it.
		Car cozierCar = controller.getCarsByOwner("Cozier").get("Cozier");
		cozierCar.setDirection("Forward");
		cozierCar.setSpeed("15mph");
		controller.saveCarState("Crozier", cozierCar);

		// Reload car and print the results.
		Car cozierCarLoaded = controller.getCarsByOwner("Cozier").get("Cozier");
		controller.updateCarViewDashboard(cozierCarLoaded);
	}
}
