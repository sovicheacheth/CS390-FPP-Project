package Lab7;

public class HolidayCabinRental extends CabinRental{

	HolidayCabinRental(int cabinNo){
		super(cabinNo);
		weeklyRentalRate += 150;
	}
}
