import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class HttpUrlConnection {
	
	public static void main (String[] args) {
		
		String output = getUrlContents("http://ajilizaliturri.com");
		System.out.println(output);
		
	}
	
	private static String getUrlContents(String theUrl) {
		
		StringBuilder content = new StringBuilder();
		
		try {
			URL url = new URL(theUrl);
			
			URLConnection urlConnection = url.openConnection();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String line;
			
			while((line = bufferedReader.readLine()) != null) {
				
				content.append(line + "\n");
				
			}
			
			bufferedReader.close();
			
		}
		
		catch(Exception e)
		
		{
			
			e.printStackTrace();
		
		}
		
		return content.toString();
	}
}
