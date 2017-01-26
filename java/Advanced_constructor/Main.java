public class Main{

public static void main(String args[]){

	Time myTime = new Time();
	Time newTime = new Time(9, 0, 0);
	System.out.println(myTime.display());
	System.out.println(newTime.toString()); 
	
	newTime.increment(122);
	System.out.println(newTime.toString());
	
}

}