package Group1;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("Enter the radius of Circle: ");
		
		double radius=scan.nextDouble();
		
		double Area = Math.PI* Math.pow(radius, 2);
		
		System.out.println("Area of Circle = "+ Area);
		
		

	}

}
