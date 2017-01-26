import java.io.*;
import java.util.regex.*;

public class CurveGrades {
   public static void main(String args[]) throws IOException {
      BufferedReader bf = new BufferedReader(new FileReader("grades.txt"));
      String line, lines;
      StringBuffer newgrades = new StringBuffer();
      lines = "";
      while ((line = bf.readLine()) != null) {
         lines += line + "\n";
      }
      System.out.println(lines);
      Pattern regex = Pattern.compile("\\d+");
      Matcher matches = regex.matcher(lines);
      while (matches.find()) {
         Integer curved = Integer.parseInt(matches.group()) + 5;
         matches.appendReplacement(newgrades, curved.toString());
      }
      System.out.println(newgrades);
   }
}