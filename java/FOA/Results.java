import java.io.FileReader;
import java.util.*;
import java.io.IOException;
import java.io.*;

public class Results{

public void results(String filename, int[] dist, int findK, int roads) throws IOException{

HashMap<Integer, String> hmap = new HashMap<Integer, String>();

for (int i = 1; i <= findK; i++)
{


String file = filename;
Scanner sc = new Scanner(new FileReader(file));

for(int j = 1; j <= 2+roads+i; j++){

sc.nextLine();

}

String splitstring = sc.nextLine();

String[] results = splitstring.split(":");     

String city1 = results[0];
String city2 = results[1];

String Value = city1 + ":" + city2;

hmap.put(dist[i], Value);

//System.out.print(dist[i] + " ");
}

Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
Set set2 = map.entrySet();
Iterator iterator2 = set2.iterator();

System.out.println("The minimum distance and the edge which mimimizes it, respectively are as follows");
        while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
			  
              System.out.print(me2.getKey() + "; ");
              System.out.println(me2.getValue());
         }



}

}