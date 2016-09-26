import java.util.Scanner;
/*
 * Question
 if(age > 65) socialSecurityStatus = "eligible"; 
   else socialSecurityStatus = "ineligible";  
Rewrite this (pseudo) code using the Java ternary operator. 
 */
public class TernaryOperator {

	public static void main(String[] args) {
		// Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		String temp = sc.nextLine();
		
		// Converting user input into integer
		int age = Integer.parseInt(temp);
		// Ternary operator use
		String socialSecurityStatus = (age>65) ? "eligible" : "ineligible";
		// Displaying output
		System.out.println("You are "+socialSecurityStatus+" for Social Security Status");
	}

}
