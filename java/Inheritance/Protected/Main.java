public class Main{

public static void main(String args[]){

	Employee e1 = new Employee("Pradeep", 30000);
	Manager m1 = new Manager("Jishnu", 40000, "Development");
	System.out.println(e1.displayEmpInfo());
	System.out.println(m1.displayEmpInfo());
	
	m1.changeSalary(e1, 35000);
	System.out.println(e1.displayEmpInfo());

}



}