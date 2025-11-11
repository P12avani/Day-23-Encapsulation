package com.codegnan.oopexamples;

public class EmployeeSalary {
	private int empId;
	private String name;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	
	public EmployeeSalary(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void Salary(double salary) {
		if(salary>0) {
		this.salary=salary;
		}else {
			System.out.println("Salary must be positive");
		}
	}
		public void displayEmployeeInfo() {
			System.out.println("Employee Id:"+empId);
			System.out.println("Name:"+name);
			System.out.println("Salary:"+salary);
			
		}
	}


