import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;


public class File{
public static void main(String args[]) throws IOException{
String file = "text.txt";
Scanner sc = new Scanner(new FileReader(file));
String splitstring;

String n_cities = sc.nextLine();
String m_roads = sc.nextLine();

int o = 0;
while(sc.hasNextLine()){
//numb = Integer.parseInt(sc.nextLine());
o = o + 1;
splitstring = sc.nextLine();

if(splitstring.length() > 3)
{
String[] results = splitstring.split(":");     //split whitespace

 
String city1 = results[0];
String city2 = results[1];
String roadlen = results[2];

//System.out.println(numb);
System.out.println(city1 + " " + city2 + " " + roadlen);
}
}
System.out.println(o);

String file2 = "text.txt";
Scanner sc2 = new Scanner(new FileReader(file2));

for(int i = 1; i < o + 1; i++)
{
sc2.nextLine();
}
String source = sc2.nextLine();
String destination = sc2.nextLine();

System.out.println(source + " " + destination);

}	


}