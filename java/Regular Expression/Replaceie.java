import java.io.*;
import java.util.regex.*;

public class Replaceie {
   public static void main(String args[]) throws IOException {
      BufferedReader bf = new BufferedReader(new FileReader("eiwords.txt"));
      String line;
      Pattern pattern = Pattern.compile("cie");
      Matcher matcher;
      while ((line = bf.readLine()) != null) {
         System.out.print(line + " ");
         matcher = pattern.matcher(line);
         if (matcher.find()) {
            line = matcher.replaceAll("cei");
            System.out.println(line);
         }
         else {
            System.out.println();
         }
      }
   }
}