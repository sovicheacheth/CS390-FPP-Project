package Group1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		
		System.out.print("Enter the Length of Triangle: ");
		
		double length = scan.nextDouble();
		
		System.out.print("Enter the Width of Triangle: ");
		
		double width = scan.nextDouble();
		
		double diag = Math.sqrt(Math.pow(length, 2)+ Math.pow(width,2));
		
		System.out.print("Diagonal of Triangle = " + diag);
		
	}

}
