package com.lab4.Employee;
import java.util.*;
public class Commissioned extends Employee {
	
	private double commission;
	private double baseSalary;
	private List<Order> newOrderList = new ArrayList<Order>();
	public Commissioned(double aCommission, double aBaseSalary) {
		this.commission = aCommission;
		this.baseSalary = aBaseSalary;
	}
	public void addOrder(Order newOrder) {
		newOrderList.add(newOrder);
	}
	@Override
	public double calcGrossPay() {
		double totalSalary = this.baseSalary;
		double totalSales = 0.0;
		for(Order orderEntry : newOrderList) {
			totalSales += orderEntry.getOrderAmount();
		}
		// 10% supposition
		// better do a attribute and set it
		this.commission = totalSales / 10;
		return this.baseSalary + this.commission;
	}

}
