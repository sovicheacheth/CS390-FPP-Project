package anonymous;

import java.util.Scanner;

public class AnonymousMainClas {

	public static void main(String[] args) {
		AnonymousCar car = new AnonymousCar() {
			public void toSetcircumtance() {
				scan = new Scanner(System.in);
				System.out.println("enter circumtance of tire");
				circumfrance1 = scan.nextDouble();
			}
		};

		car.toSetcircumtance();
		car.toFindRadious();

	}
}
