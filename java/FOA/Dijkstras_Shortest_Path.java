import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Dijkstras_Shortest_Path{

private static int dist[];
private String filename;

public Dijkstras_Shortest_Path(){


}
	
public static void main(String args[]) throws IOException{

try{

if(args[0] == null){
filename = "test_1.txt";

PrintWriter pw = new PrintWriter(new FileWriter(filename));
pw.println(scan.nextLine());
int m = Integer.parseInt(scan.nextLine());

String str = new Integer(m).toString();

pw.println(str);


for (int i = 1; i <= m+2; i++){
pw.println(scan.nextLine());
}
pw.close();

File_test F = new File_test();
int cities = F.city(filename);
int roads = F.roads(filename);
int source = F.source(filename, roads);
int destination = F.destination(filename, roads);
int findK = F.findK(filename, roads);

//AdjMat M = new AdjMat();

//int[][] adjacency_matrix = M.adjMat(filename, cities);

//---------------------------------------------------
//Dijkstras_implementation answer = new  Dijkstras_implementation(cities);

//int k = answer.shortestAnswer(adjacency_matrix, source, destination);

//System.out.println("The shortest distance between the two cities is " + answer.shortestAnswer(adjacency_matrix, source, destination));

//----------------------------------------------------

//int dist[];

dist = new int[100];

for(int i = 1; i <= findK; i++)
{

//int dist[];
AdjMat M = new AdjMat();

int[][] adjacency_matrix = M.adjMat(filename, cities);


Dijkstras_implementation answer = new  Dijkstras_implementation(cities);

K_AdjMat K = new K_AdjMat();

int[][] K_adjacency_matrix = K.adjMat1(filename, roads, i, adjacency_matrix);

dist[i] = answer.shortestAnswer(K_adjacency_matrix, source, destination);

}

Results R = new Results();

R.results(filename, dist, findK, roads);

//----------------------------------------------------
}

else{

String filename = args[0];

File_test F = new File_test();
int cities = F.city(filename);
int roads = F.roads(filename);
int source = F.source(filename, roads);
int destination = F.destination(filename, roads);
int findK = F.findK(filename, roads);

//AdjMat M = new AdjMat();

//int[][] adjacency_matrix = M.adjMat(filename, cities);

//---------------------------------------------------
//Dijkstras_implementation answer = new  Dijkstras_implementation(cities);

//int k = answer.shortestAnswer(adjacency_matrix, source, destination);

//System.out.println("The shortest distance between the two cities is " + answer.shortestAnswer(adjacency_matrix, source, destination));

//----------------------------------------------------

//int dist[];

dist = new int[100];

for(int i = 1; i <= findK; i++)
{

//int dist[];
AdjMat M = new AdjMat();

int[][] adjacency_matrix = M.adjMat(filename, cities);


Dijkstras_implementation answer = new  Dijkstras_implementation(cities);

K_AdjMat K = new K_AdjMat();

int[][] K_adjacency_matrix = K.adjMat1(filename, roads, i, adjacency_matrix);

dist[i] = answer.shortestAnswer(K_adjacency_matrix, source, destination);

}

Results R = new Results();

R.results(filename, dist, findK, roads);


}

}


catch(InputMismatchException iM)
{
System.out.println("Either there are inconsistencies in the inputs given OR a format error");
}




}

}