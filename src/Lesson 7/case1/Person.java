package Lab7.case1;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object p){
		if(p==null)
			return false;
		if(!(p instanceof Person))
			return false;
		Person pHere = (Person)p;
		boolean reply = this.name.equals(pHere.name) && this.dateOfBirth.equals(pHere.dateOfBirth);
		return reply;	
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}


}
