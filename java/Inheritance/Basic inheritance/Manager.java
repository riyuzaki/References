public class Manager extends Employee{

private String department;

Manager(String n, int s, String d){     //This is the confusing part of inheritance!
	super(n,s);							// i.e. the cons of the subvlass also contains the variables of the superclass					
	department = d;
}

public String getDept(){
	return  department;
}


}