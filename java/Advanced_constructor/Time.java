public class Time{

private int hours, minutes, seconds;

Time(){                            //a simple constructor(default constructor)
	hours = 0;
	minutes = 0;
	seconds = 0;
}
Time(int h,int m,int s){           //Constructor is used not only for Intializtion of parameters but also
	if(h > 0 && h < 24) 			 //conditions(if, for etc) can be used
	hours = h;	
	else
	hours = 0;	
	
	if(m > 0 && m < 60) 			 //conditions(if, for etc) can be used
	minutes = m;	
	else
	minutes = 0;	
	
	if(s > 0 && s < 60) 			 //conditions(if, for etc) can be used
	seconds = s;	
	else
	seconds = 0;	
}

public String toString(){						//for debugging
	return "Hours:" + hours + "\n" +
			"Minutes:" + minutes + "\n" +
			"Seconds:" + seconds;
}                        

public String display(){
	return hours + ":" + minutes + ":" + seconds;
}

public void increment(int amt){
	minutes += amt;
	if(minutes > 59){
		int f = minutes/60;
		hours += f;
		int g = minutes%60;
		minutes -= 60*g;
		}
		

}


}