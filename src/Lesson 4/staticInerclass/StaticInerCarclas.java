package staticInerclass;

import java.util.Scanner;

public class StaticInerCarclas {

	private static double PI = 3.14;
	private static double circumfrance1;
	private Scanner scan;
	private int a=0;

	public static class StaticInnertier {
	
		public static void formula() {
			System.out.println("your car radious is " + (circumfrance1 / (2 * PI)));
			
		}
	}

	public void calculateradious() {
		StaticInnertier.formula();
	}

	public void toSetcircumtance() {
		scan = new Scanner(System.in);
		System.out.println("enter circumtance of tire");
		circumfrance1 = scan.nextDouble();
	}

}
