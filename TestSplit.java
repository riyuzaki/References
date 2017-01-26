import java.io.*;


public class TestSplit {

public static void main(String args[]){

//String splitstring = "123-456-789";

String splitstring = "123 456 789";

//String[] results = splitstring.split("-");	 //split -
//String[] results = splitstring.split("\\$");   //split $ 
String[] results = splitstring.split("\\s");     //split whitespace
 
String result1 = results[0];
String result2 = results[1];
String result3 = results[2];
	
//System.out.println(result1);
//System.out.println(result2);
//System.out.println(result3);

for(int i=0; i<splitstring.split("\\s").length; i++){

System.out.println(results[i]);

}
}


}