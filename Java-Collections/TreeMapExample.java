import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;


public class TreeMapExample {

   public static void main(String args[]) {

      /* This is how to declare TreeMap */
      TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

      /*Adding elements to TreeMap*/
      tmap.put(1, "Albert");
      tmap.put(28, "Mallory");
      tmap.put(2, "Janice");
      tmap.put(8, "Richard");
      tmap.put(7, "Ilizliturri");

      /* Display content using Iterator*/
      Set set = tmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

   }
}
