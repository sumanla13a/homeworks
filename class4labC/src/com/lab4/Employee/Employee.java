package com.lab4.Employee;
import com.lab4.Paycheck.*;
public abstract class Employee {
	abstract public double calcGrossPay();
	
	public void print(String message) {
		// TODO: do something
		System.out.println(message);
	}
	
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay();
		Paycheck employeePayCheck = new Paycheck(grossPay,23.0,5.0,1.0,3.0,7.5);
		print("Total Fica tax is : " + String.valueOf(employeePayCheck.getFica()));
		print("Total Local tax is : " + String.valueOf(employeePayCheck.getLocal()));
		print("Total State tax is : " + String.valueOf(employeePayCheck.getState()));
		print("Total Medicare is : " + String.valueOf(employeePayCheck.getMedicare()));
		print("Total SocialSecurity is : " + String.valueOf(employeePayCheck.getSocialSecurity()));
		return employeePayCheck;
	}
}
