package com.demo;

class Employee{
public void calculateSalary()
{
	System.out.println("Calculating salary for the employee");
}
}
class Manager extends Employee{
	public void calculateSalary()
	{
		System.out.println("Salary of Manager is 15 LPA");
	}
}
class Programmer extends Employee{
	public void calculateSalary()
	{
		System.out.println("Salary of programmer is 7 LPA");
	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.calculateSalary();
		
		Manager man= new Manager();
		man.calculateSalary();
		
		Programmer pgm= new Programmer();
		pgm.calculateSalary();
	}

}

