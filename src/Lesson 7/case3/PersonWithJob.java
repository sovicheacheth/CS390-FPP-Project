package Lab7.case3;

import java.util.GregorianCalendar;

public class PersonWithJob{
	private double salary;
	private Person p;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		p = new Person(name,dob);
		this.salary = salary;
	}
	public String getName(){
		return p.getName();
	}
	public GregorianCalendar getDateOfBirth(){
		return p.getDateOfBirth();
	}
	public double getSalary() {
		return salary;
	}
	public boolean equals(Object ob){
		if(ob==null)return false;
		if(ob.getClass() != this.getClass())return false;
		PersonWithJob pwj = (PersonWithJob)ob;
		boolean reply = getSalary()==pwj.getSalary() && getName().equals(pwj.getName()) && getDateOfBirth().equals(pwj.getDateOfBirth());
		return reply;
	}
	public static void main(String args[]){
		
		Person p = new Person("Roshan",new GregorianCalendar(1987, 07, 10));
		Person p1 = new Person("Roshan",new GregorianCalendar(1987, 07, 10));
		
		PersonWithJob pwj = new PersonWithJob("Roshan", new GregorianCalendar(1987, 07, 10), 10000);
		PersonWithJob pwj2 = new PersonWithJob("Roshan", new GregorianCalendar(1987, 07, 10), 12000);
		
		System.out.println(p.equals(p1));//true
		System.out.println(p1.equals(p));//true
		
		System.out.println(pwj.equals(pwj2));//false
		System.out.println(pwj2.equals(pwj));//false	
		
	}	
}
