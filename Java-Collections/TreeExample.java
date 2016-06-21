import java.util.Iterator;
import java.util.TreeSet;
 
public class TreeExample {
 
   public static void main(String[] args) {
	
	// We create a tree set.    
	TreeSet<Integer> tree = new TreeSet<Integer>();
	
	// Add to the tree set.
	tree.add(12);
	tree.add(63);
	tree.add(34);
	tree.add(45);
 
	// We sort the tree set. With the largest number being the last in the list.
	Iterator<Integer> iterator = tree.iterator();
	System.out.print("Tree set data: ");
 
	// This does the displaying  of the Tree set
	while (iterator.hasNext()) {
		System.out.print(iterator.next() + " ");
	}
	System.out.println();
 
	// Check to see if the Tree is empty or not
	if (tree.isEmpty()) {
		System.out.print("Tree Set is empty.");
	} else {
		System.out.println("Tree Set size: " + tree.size());
	}
 
	// Retrieve first data from tree set
	System.out.println("First data: " + tree.first());
 
	// Retrieve last data from tree set
	System.out.println("Last data: " + tree.last());
 
	// We will remove the data from the tree set. 
	if (tree.remove(45)) { // remove element by value
		System.out.println("Data is removed from tree set");
	} else {
		System.out.println("Data doesn't exist!");
	}
	
	// The updated tree set after the removal.
	System.out.print("Now the tree set contain: ");

	// sorts the Tree set in ascending order.
	iterator = tree.iterator();
 
	// Displaying the Tree set data
	while (iterator.hasNext()) {
		System.out.print(iterator.next() + " ");
	}
	System.out.println();
	System.out.println("Now the size of tree set: " + tree.size());
 
	// Remove all the data in the tree set.
	tree.clear();
	if (tree.isEmpty()) {
		System.out.print("Tree Set is empty.");
	} else {
		System.out.println("Tree Set size: " + tree.size());
	}
   }
}
