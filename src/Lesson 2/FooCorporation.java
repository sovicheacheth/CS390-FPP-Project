/*
 * @author: Roshan Chaudhary
 * @Ver: 1.0
 * @info: This program calculates the total amount to pay to the employee of FOO Company
 */
import java.util.Scanner;//importing scanner class to take input from users

public class FooCorporation {

	public static void main(String[] args) {
		// Initializing variables
		int hours;
		double basePay = 8.0;
		double baseExtPay = 1.5*basePay;
		double payment = 0;
		
		// Asking users to input number of hours
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter Number of Hours Worked: ");
		hours = Integer.parseInt(in.nextLine());

		//if number of hours in less than or equals to 40
		if(hours<=40){
			payment = hours * basePay;
		}
		//if more then
		else{
			payment = 40*basePay;
			hours -=40;
			payment = payment + hours*baseExtPay;
		}
		//displaying the payment to give
		System.out.println("Payment to give: "+payment);
	}

}
