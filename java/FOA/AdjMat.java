import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;


public class AdjMat{

public int[][] adjMat(String filename, int cities) throws IOException{
int[][] a;

a = new int[cities + 1][cities + 1];

for(int i = 1; i < cities + 1; i++)
{
for(int j = 1; j < cities + 1; j++)
{
a[i][j] = Integer.MAX_VALUE;
}
}

for(int i = 1; i < cities + 1; i++)
{
a[i][i] = 0;
}

String file = filename;
Scanner sc = new Scanner(new FileReader(file));
String splitstring;

String n_cities = sc.nextLine();
String m_roads = sc.nextLine();

while(sc.hasNextLine()){
//numb = Integer.parseInt(sc.nextLine());
splitstring = sc.nextLine();

if(splitstring.length() > 3)
{
String[] results = splitstring.split(":");     //split colon

 
int city1 = Integer.parseInt(results[0]);
int city2 = Integer.parseInt(results[1]);
int roadlen = Integer.parseInt(results[2]);

a[city1][city2] = roadlen;

}
}

return a;
}	


}