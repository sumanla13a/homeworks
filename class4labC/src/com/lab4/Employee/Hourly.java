package com.lab4.Employee;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;
	public Hourly(double anHourlyWage) {
		this.hourlyWage = anHourlyWage;
	}
	@Override
	public double calcGrossPay() {
		return this.hourlyWage * this.hoursPerWeek;
	}

}
