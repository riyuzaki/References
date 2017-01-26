import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;


public class File{
public static void main(String args[]) throws IOException{
String file = "C:\\Users\\Purshi\\Desktop\\java\\java\\File_handling\\Reading\\numbs.txt";
Scanner sc = new Scanner(new FileReader(file));
int numb;

while(sc.hasNextLine()){
numb = Integer.parseInt(sc.nextLine());
System.out.println(numb);
}

}	


}