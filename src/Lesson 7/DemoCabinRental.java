package Lab7;

import java.util.Scanner;

public class DemoCabinRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Cabin Number for Rates: ");
		int input = sc.nextInt();
		
		HolidayCabinRental hcr = new HolidayCabinRental(input);
		System.out.println("Cabin Number : "+hcr.getCabinNum());
		System.out.println("Cost = "+hcr.getRentalRate());
		
		System.out.println("------------------------");
		
		CabinRental cr = new CabinRental(input);
		System.out.println("Cabin Number : "+cr.getCabinNum());
		System.out.println("Cost = "+cr.getRentalRate());		
	}

}
