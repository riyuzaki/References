import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;

public class File_test{

public int city(String filename) throws IOException{

String file = filename;
Scanner sc = new Scanner(new FileReader(file));
String splitstring;

int n_cities = Integer.parseInt(sc.nextLine());

return n_cities;
}

public int roads(String filename) throws IOException{

String file = filename;
Scanner sc = new Scanner(new FileReader(file));
String splitstring;

sc.nextLine();
int n_roads = Integer.parseInt(sc.nextLine());

return n_roads;
}

public int source(String filename, int roads) throws IOException{

String file = filename;
Scanner sc = new Scanner(new FileReader(file));

String n_cities = sc.nextLine();
String m_roads = sc.nextLine();

for(int i = 1; i <= roads; i++){

sc.nextLine();

}
int k = Integer.parseInt(sc.nextLine());

for(int i = 1; i <= k; i++){

sc.nextLine();

}
int sr = Integer.parseInt(sc.nextLine());
return sr;

}	

public int destination(String filename, int roads) throws IOException{

String file = filename;
Scanner sc = new Scanner(new FileReader(file));

String n_cities = sc.nextLine();
String m_roads = sc.nextLine();

for(int i = 1; i <= roads; i++){

sc.nextLine();

}
int k = Integer.parseInt(sc.nextLine());

for(int i = 1; i <= k; i++){

sc.nextLine();

}
sc.nextLine();
int dest = Integer.parseInt(sc.nextLine());
return dest;
}

public int findK(String filename, int roads) throws IOException{

String file = filename;
Scanner sc = new Scanner(new FileReader(file));

String n_cities = sc.nextLine();
String m_roads = sc.nextLine();

for(int i = 1; i <= roads; i++){

sc.nextLine();

}
int k = Integer.parseInt(sc.nextLine());

return k;
}


}