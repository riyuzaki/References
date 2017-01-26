public class Time{

private int hours, minutes, seconds;

Time(){                            //a simple constructor(default constructor)
	hours = 0;
	minutes = 0;
	seconds = 0;
}
Time(int h,int m,int s){           //parameterized constructor
	hours = h;
	minutes = m;
	seconds = s;
}

public String toString(){						//for debugging
	return "Hours:" + hours + "\n" +
			"Minutes:" + minutes + "\n" +
			"Seconds:" + seconds;
}                        

public String display(){
	return hours + ":" + minutes + ":" + seconds;
}

}