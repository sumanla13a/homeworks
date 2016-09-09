package com.lab4.Employee;

public class Salaried extends Employee {
	private double salary;
	
	public Salaried(double aSalary) {
		this.salary = aSalary;
	}
	@Override
	public double calcGrossPay() {
		return salary;
	}

}
