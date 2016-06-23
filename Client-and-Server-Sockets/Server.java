import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
	
	public static void main(String[] args) throws IOException {
		
		try (ServerSocket listener = new ServerSocket(9090)) {
			
			while (true) {
				
				try (Socket socket = listener.accept()) {
					
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					
					out.println(new Date().toString());
					
				}
			}
		}
	}
}
