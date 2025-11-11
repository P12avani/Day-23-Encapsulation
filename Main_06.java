package com.codegnan.oopexamples;

public class Main_06 {

	public static void main(String[] args) {
		EmployeeSalary es=new EmployeeSalary(95, "pavani", 60000);
		es.displayEmployeeInfo();
		es.setEmpId(95);
		es.setName("pavani");
		es.setSalary(60000);
		//es.displayEmployeeInfo();
		System.out.println(es.getEmpId());
		System.out.println(es.getName());
		System.out.println(es.getSalary());
		

	}

}
