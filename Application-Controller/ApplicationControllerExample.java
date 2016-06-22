import java.util.Scanner;

public class ApplicationControllerExample {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose Albert, Justin or Mallory to learn about them.");
		ApplicationController app = new ApplicationController();
		app.dispatchRequest(input.next());
	}
}
