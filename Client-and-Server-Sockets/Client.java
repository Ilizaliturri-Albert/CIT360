import java.io.BufferedReader;
import javax.swing.JOptionPane;
import java.net.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		String serverAddress = JOptionPane.showInputDialog("Enter IP Address of machine that is running port 9090:");
		
		Socket s = new Socket(serverAddress, 9090);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String answer = input.readLine();
		
		JOptionPane.showMessageDialog(null, answer);
		
		System.exit(0);
		
		
	}
}
