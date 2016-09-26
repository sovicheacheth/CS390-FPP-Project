package CreditUnion;

import java.util.Date;
import java.util.GregorianCalendar;




class Employee {
	
	private String name;
	private double salary;
	private Date hireDay;
	
	//constructor
	Employee(String aName,double aSalary,int aYear,int aMonth,int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear,aMonth-1,aDay);
		hireDay = cal.getTime();
	}

	//instance methods
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDay() {
	
		return hireDay;
		
	}
		
	public String toString() {
		return "Name of Employee = " + getName() + ", Salary of Employee = " + getSalary() + ", Hire date of Employee : "+ getHireDay();
	}

	public void raiseSalary(double byPercent) {
	
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}  // end of class