/**
 * 
 */
package Group1;

import java.util.Scanner;

/**
 * @author 985484
 *
 */
public class Gravity {

	private static Scanner scan;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double finalPosition=0.0;
		double initialPosition=0.0;
		double initialvelocity=0.0;
		double FallingTime=10.0;
		double gravity=-9.81;
		double X=0.0;
		
		System.out.print("Enter Time : ");
		scan = new Scanner(System.in);
		double time= scan.nextDouble();
		
		finalPosition= 0.5 * gravity * FallingTime * FallingTime;
		
		X= 0.5 *gravity * Math.pow(time, 2) + initialvelocity * time + initialPosition;  
		
		System.out.print("At given time the position of object is : ");
		System.out.println(X);
		
		System.out.print("Final position of object is : ");
		System.out.println(finalPosition);

	}

}
