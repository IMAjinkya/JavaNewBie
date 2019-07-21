package com.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeUtils {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Tim", 30, "E-001"));
		empList.add(new Employee("Kim", 26, "E-002"));
		empList.add(new Employee("Bim", 22, "E-003"));
		
		System.out.println("Before sorting:"+empList);
		
		Collections.sort(empList,new EmployeeComparator());
		
		System.out.println("After sorting:"+empList);
	}

}

class Employee {
	private String name;
	private int Age;
	private String emp_id;
	
	public Employee(String name, int age, String emp_id) {
		super();
		this.name = name;
		Age = age;
		this.emp_id = emp_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	
	@Override
	public String toString(){
		return "Emp_ID:"+emp_id+" Name: "+name+" Age: "+Age;
		
	}
}


class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getAge() < e2.getAge())
			return -1;
		else if(e1.getAge() > e2.getAge())
			return 1;
		else
			return 0;
	}
}