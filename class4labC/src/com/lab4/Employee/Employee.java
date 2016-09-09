package com.lab4.Employee;
import com.lab4.Paycheck.*;
public abstract class Employee {
	abstract public double calcGrossPay();
	
	public void print() {
		// TODO: do something
	}
	
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay();
		return new Paycheck(grossPay,23.0,5.0,1.0,3.0,7.5);
	}
}
