public class Manager extends Employee{

private String department;

Manager(String n, int s, String d){    
	super(n,s);											
	department = d;
}

public String getDept(){
	return  department;
}

//method overloading in action
public String displayEmpInfo(){
	String empinfo = super.displayEmpInfo();
	return empinfo + "Dept: " + department + "\n"; 
}

public void changeSalary(Employee e, int amount){
	e.salary = amount;     //This is important step!
}

}