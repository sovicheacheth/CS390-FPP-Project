
/** 
 * @author Sovichea Cheth
 * @version 1.0
 * @since 09/16/2016
 * @description 7-6Clone Write a program in java to create deep copy of employee
 * */

import java.util.Date;
import java.util.GregorianCalendar;

class Employee implements Cloneable{
	
	private String name;
	private double salary;
	private Date dateOfJoin;
	String jobDescription;
	
	public Employee(String name, double salary, String jd, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		jd = jobDescription;
		GregorianCalendar cal = new GregorianCalendar(year, month -1 , day);
		this.dateOfJoin = cal.getTime();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee)super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName() + "[" + this.name + ", "
				+ this.salary + ", " + this.jobDescription + ", " + this.dateOfJoin + "]";
	}
	
}

class Manager implements Cloneable{
	double bonus;
	Employee emp;
	
	public Manager(double name, Employee e){
		this.bonus = name;
		emp = e;
	}
	
	public String toString(){
		return emp + ", Bonus: " + bonus;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Manager managercopy = (Manager) super.clone();
		managercopy.emp = (Employee) emp.clone();
		return managercopy;
	}
}

public class CloneDeep {
	
	public static void main(String[] args) {
		Employee emp = new Employee("John Smith", 5000.00, "Engineer", 2016, 8, 25);
		Manager mgr = new Manager(300.00, emp);
		
		try {
			Manager m = (Manager) mgr.clone();
			System.out.println(m);
			m.emp.jobDescription = "Manager";
			System.out.println(mgr);
			System.out.println(m);
		} catch (CloneNotSupportedException e) {
		}
		
	}
	
	
}
