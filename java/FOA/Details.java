import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class Details {

    public static void main(String[] args) {

         HashMap<Integer, String> hmap = new HashMap<Integer, String>();
         hmap.put(5, "A");
         hmap.put(11, "C");
         hmap.put(4, "Z");
         hmap.put(77, "Y");
         hmap.put(9, "P");
         hmap.put(66, "Q");
         hmap.put(0, "R");

         Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
         System.out.println("After Sorting:");
         Set set2 = map.entrySet();
         Iterator iterator2 = set2.iterator();
		 
		 System.out.println(iterator2.hasNext());
		 
		 
		 System.out.println("The shortest paths and their values(shortest to largest)");
        while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
			  
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
         }
    }
}