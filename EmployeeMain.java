package package1;
class Employee
{
	public int salary; // attribute of employee class
	
	public Employee(int sal)
	{
		salary=sal;
	}
	
	public void work() {
		System.out.println("Working as a employee  ");
	}
	public int getSalary()
	{
		 return salary;
	}
	
}
class Manager extends Employee{

	public Manager(int sal)
	{
		super(sal);
	}
	public void work()
	{
		System.out.println("Managing the Employee  ");
	}

	public void addEmployee()
	{
		System.out.println("Adding the employee  ");
	}
}

public class EmployeeMain {
	public static void main(String[]args) {
	   
		Employee emp= new Employee(40000);
		Manager mg=new Manager(50000);
		
		emp.work();
		System.out.println("Employee Salary  " +emp.getSalary());
		
		mg.work();
		System.out.println("Manager Salary  " + mg.getSalary());
		mg.addEmployee();
		
		
	}
	}
