package employeesort;

/** 
 * @author Sovichea Cheth 985421
 * @version 1.0
 * @since Sep-22-2016
 * @description Programming Assignment 8.3: Create a SalaryComparator class whose compareTo method orders
Employee objects in increasing order of salary.
 * */

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		double salary1 = o1.getSalary();
		double salary2 = o2.getSalary();
		Double s1 = new Double(salary1);
		Double s2 = new Double(salary2);
		return s1.compareTo(s2);
		
	}

}
