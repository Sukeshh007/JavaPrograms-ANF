package com.demo.sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeComparator {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(7,"Sukesh", 70000 );
		Employee emp2 = new Employee(9,"Tejas",  150000 );
		Employee emp3 = new Employee(8,"Tushar", 50000 );
		Employee emp4 = new Employee(10,"Abhay", 50000 );

		
		ArrayList <Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		
		//System.out.println(emplist);
		
		// EmployeeIdComparator id = new EmployeeIdComparator();
		
		//Collections.sort(emplist,id);
		System.out.println("Before Sorting");
		System.out.println(emplist);
		
		//EmployeeSalaryComparator sal = new EmployeeSalaryComparator();
		 //Collections.sort (emplist,sal);
		 
		 System.out.println("After Sorting");
		 //System.out.println(emplist);
		 
		 EmployeeName name = new EmployeeName();
		 Collections.sort(emplist,name);
		 
		 System.out.println(emplist);
		 
		 
		 
	
	}

}
