package Lab7.case1;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Roshan",new GregorianCalendar(1987, 07, 10));
		Person p1 = new Person("Roshan",new GregorianCalendar(1987, 07, 10));
		
		PersonWithJob pwj = new PersonWithJob("Roshan", new GregorianCalendar(1987, 07, 10), 10000);
		PersonWithJob pwj2 = new PersonWithJob("Roshan", new GregorianCalendar(1987, 07, 10), 12000);
		
		System.out.println(p.equals(p1));
		System.out.println(p1.equals(p));
		
		System.out.println(pwj.equals(pwj2));
		System.out.println(pwj2.equals(pwj));
		
		//System.out.println("p Hast "+p.hashCode());
		//System.out.println("p1 Hast "+p.hashCode());
	}	
}
