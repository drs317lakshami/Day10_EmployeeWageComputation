package com.bridgelabz.day10;

public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee emp = new Employee();
		String str = emp.employeeAttendance();
		System.out.println(str);
		emp.checkEmpWage(str);
	}
}