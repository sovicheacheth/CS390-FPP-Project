/** 
 * @author Sovichea Cheth
 * @version 1.0
 * @since 09/16/2016
 * @description 7-6Clone Write a program in java to create shallow copy of employee
 * */

import java.util.Date;
import java.util.GregorianCalendar;

class Employee2 implements Cloneable{
	
	private String name;
	private double salary;
	private Date dateOfJoin;
	String jobDescription;
	
	public Employee2(String name, double salary, String jd, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		jd = jobDescription;
		GregorianCalendar cal = new GregorianCalendar(year, month -1 , day);
		this.dateOfJoin = cal.getTime();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee2)super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName() + "[" + this.name + ", "
				+ this.salary + ", " + this.jobDescription + ", " + this.dateOfJoin + "]";
	}
	
}

class Manager2 implements Cloneable{
	double bonus;
	Employee2 emp;
	
	public Manager2(double name, Employee2 e){
		this.bonus = name;
		emp = e;
	}
	
	public String toString(){
		return emp + ", Bonus: " + bonus;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Manager2 mgrcopy = (Manager2) super.clone();
		return mgrcopy;
	}
}

public class CloneShallow {
	
	public static void main(String[] args) {
		Employee2 emp = new Employee2("John Smith", 5000.00, "Engineer", 2016, 8, 25);
		Manager2 mgr = new Manager2(300.00, emp);
		
		try {
			Manager2 m = (Manager2) mgr.clone();
			System.out.println(m);
			m. emp.jobDescription = "Manager";
			System.out.println(mgr);
			System.out.println(m);
		} catch (CloneNotSupportedException e) {
		}
		
	}
	
	
}

