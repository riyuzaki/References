import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;


public class K_AdjMat{



public int[][] adjMat1(String filename, int roads, int findK, int adjacency_matrix[][]) throws IOException{
int[][] a;



String file = filename;
Scanner sc = new Scanner(new FileReader(file));

for(int i = 1; i <= 2+roads+findK; i++){

sc.nextLine();

}

String splitstring = sc.nextLine();

String[] results = splitstring.split(":");     

int city1 = Integer.parseInt(results[0]);
int city2 = Integer.parseInt(results[1]);
int roadlen = Integer.parseInt(results[2]);

adjacency_matrix[city1][city2] = roadlen;

return adjacency_matrix;

}	


}