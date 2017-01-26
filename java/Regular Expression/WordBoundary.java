import java.io.*;
import java.util.regex.*;

public class WordBoundary {
   public static void main(String args[]) throws IOException {
      BufferedReader bf = new BufferedReader(new FileReader("words.txt"));
      String line;
      Pattern pattern = Pattern.compile("\\bcat\\b");
      Matcher matcher;
      while ((line = bf.readLine()) != null) {
         matcher = pattern.matcher(line);
         if (matcher.find()) {
            System.out.println(matcher.group());
         }
         else {
            System.out.println("Match not found.");
         }
      }
   }
}