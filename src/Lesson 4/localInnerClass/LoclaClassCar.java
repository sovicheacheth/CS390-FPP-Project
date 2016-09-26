package localInnerClass;

import java.util.Scanner;

public class LoclaClassCar {

	private double PI = 3.14;
	private double circumfrance1;
	private Scanner scan;

	public void toSetcircumtance() {
		scan = new Scanner(System.in);
		System.out.println("enter circumtance of tire");
		double temp = scan.nextDouble();
		class Tire {
			Tire(double temp) {

				circumfrance1 = temp;
			}
		}
		new Tire(temp);
	}

	public void calculateradious() {
		

		System.out.println("your car radious is " + (circumfrance1 / (2 * PI)));
	}
}
