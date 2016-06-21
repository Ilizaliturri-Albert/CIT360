import java.util.*;

public class ListExample {

	 public static void main(String args[]) {

		 // We create a new List.
		 List<String> listStrings = new ArrayList<String>();
		 
		 // We add to the list. 
		 listStrings.add("One");
		 listStrings.add("Two");
		 listStrings.add("Three");
		 listStrings.add("One");
		 listStrings.add("Two");
		 listStrings.add("Three");
		 listStrings.add("Hello");
		 
		 // Print the elements of the Set
	     System.out.println("listStrings: " + listStrings);
	     
	     // We modify the list and placing it an a specific index.
	     listStrings.add(1, "Four");
	     
	     // Print the elements of the List
	     System.out.println("listStrings: " + listStrings);
	     
	     //Modify the string using set method. This will replace what is already in the index.
	     listStrings.set(2, "Hi");
	     
	     // Print the elements of the List
	     System.out.println("listStrings: " + listStrings);
	     
	     // remove an element in the list. 
	     listStrings.remove(5);  // the index.
	     listStrings.remove("Two"); // the actual element.
	      
	     // Print the elements of the List
	     System.out.println("listStrings: " + listStrings);
	     
	     // Search the list.
	     if (listStrings.contains("Hello")) {
	    	    System.out.println("Found the element");
	    	} else {
	    	    System.out.println("There is no such element");
	    	}
	 }
}

