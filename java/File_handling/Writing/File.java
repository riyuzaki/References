import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class File{
public static void main(String args[]) throws IOException{
String filename = "numbs.txt";
PrintWriter pw = new PrintWriter(new FileWriter(filename));
pw.println(1312);
pw.println(1231);
pw.close();
}

}