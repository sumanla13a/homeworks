package com.lab4.Paycheck;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	public void print(String message) {
		//print something from here
		System.out.println(message);
	}
	
	public double getNetPay() {
		double totalGrossPay = this.grossPay - this.grossPay * (this.fica + this.state + this.local + this.medicare + this.socialSecurity)/100;
		print("Total you recieve is : " + String.valueOf(totalGrossPay));
		return totalGrossPay;
	}
	
	public double getFica() {
		return this.fica;
	}
	public double getState() {
		return this.state;
	}
	public double getLocal() {
		return this.local;
	}
	public double getMedicare() {
		return this.medicare;
	}
	public double getSocialSecurity() {
		return this.socialSecurity;
	}
	
	public Paycheck(double aGrossPay, double aFica, double aState, double aLocal, double aMedicare, double aSocialSecurity) {
		this.grossPay = aGrossPay;
		this.fica = aFica;
		this.state = aState;
		this.local = aLocal;
		this.medicare = aMedicare;
		this.socialSecurity = aSocialSecurity;
	}
}
