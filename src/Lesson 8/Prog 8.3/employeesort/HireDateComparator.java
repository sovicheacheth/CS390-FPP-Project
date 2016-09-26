package employeesort;

/** 
 * @author Sovichea Cheth 985421
 * @version 1.0
 * @since Sep-22-2016
 * @description Programming Assignment 8.3: Create a HireDateComparator class whose compareTo method orders
Employee objects in increasing date of hire.
 * */

import java.sql.Date;
import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Date d1 = (Date) o1.getHireDate();
		Date d2 = (Date) o2.getHireDate();
		return d1.compareTo(d2);
	}

}
