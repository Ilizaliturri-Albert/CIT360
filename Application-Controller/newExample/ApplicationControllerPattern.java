import java.util.Scanner;

public class ApplicationControllerPattern {
    
    public static void main(String[] args) {
        
        // Define Variables
        ApplicationController1 deligate = new ApplicationController1();
        Integer num1, num2;
        String command;
        Scanner in = new Scanner(System.in);
        
        // Gather input
        System.out.println("Enter first number: ");
        num1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter a command (+, -, *, /, ^): ");
        command = in.nextLine();
        System.out.println("Enter second number: ");
        num2 = Integer.parseInt(in.nextLine());
        
        // Perform calculation
        System.out.print(num1 + " " + command + " " + num2 + " = ");
        delegate.handleCommand(num1,command,num2);
        
    }
    
}