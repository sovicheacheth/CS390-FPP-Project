package emlpyeedetail;

public class Employee implements Cloneable {

	private String employee_Name;
	private double salary;
	private String date_Of_Joining;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setDate_Of_Joining("9_19_2016");
		emp1.setEmployee_Name("Raushan");
		emp1.setSalary(5000000);
		System.out.println("first refrance of Employee emp1" + emp1 + '\n');
		System.out.println("Second referance of Employee emp2" + emp2 + '\n');

		emp2 = emp1;

		emp1.setDate_Of_Joining("10_19_2016");
		emp1.setEmployee_Name("Raushan Kumar Mahaset");
		emp1.setSalary(100000);
		System.out.println("first refrance of Employee emp1 After changing"
				+ emp1 + '\n');
		System.out.println("Second referance of Employee emp2 After changing"
				+ emp2);

		Employee emp3 = new Employee();

		try {

			emp3 = (Employee) emp2.clone();

		} catch (CloneNotSupportedException c) {
		}

		
		emp3.setDate_Of_Joining("12/12/2016");
		emp3.setEmployee_Name("Raushan KUmar Mahaset");
		emp3.setSalary(000);
		System.out.println(emp3);
		
		System.out.println("Result After of clone"+'\n');
		System.out.println(emp2);
		
	}

	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDate_Of_Joining(String date_Of_Joining) {
		this.date_Of_Joining = date_Of_Joining;
	}

	@Override
	public String toString() {
		return "Employee [date_Of_Joining=" + date_Of_Joining
				+ ", employee_Name=" + employee_Name + ", salary=" + salary
				+ "]";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}
