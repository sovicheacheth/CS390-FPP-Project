package innerOuter;

import java.util.Scanner;

public class Car {

	private double PI = 3.14;
	private double circumfrance1;
	private Scanner scan;

	public void toSetcircumtance() {
		scan = new Scanner(System.in);
		System.out.println("enter circumtance of tire");
		circumfrance1 = scan.nextDouble();
		
	
		
	}

	public void calculateradious( ) {
		new Tire(circumfrance1).toFindRadious();
	}
	

	private class Tire {

		Tire(double circumfrance) {
			circumfrance1 = circumfrance;
			}

		private void toFindRadious() {
			System.out.println("your car radious is " + (circumfrance1 / (2 * PI)));
			
			

		}
	}
	
	
}