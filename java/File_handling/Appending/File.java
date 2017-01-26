import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class File{
public static void main(String args[]) throws IOException{
String file = "numbs.txt";
PrintWriter pw = new PrintWriter(new FileWriter(file, true)); //true is important here
Scanner sc  = new Scanner(System.in);
System.out.println("Please enter -1 to quite entering!");
int numb = 0;
/*while(numb != -1){
numb = sc.nextInt();
pw.println(numb);
} */
while(1 == 1){
numb = sc.nextInt();
if(numb == -1)
break;
else
pw.println(numb);
}

pw.close();


}


}