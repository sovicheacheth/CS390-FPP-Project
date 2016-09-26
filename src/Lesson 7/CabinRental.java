package Lab7;

public class CabinRental {

	int cabinNum;
	double weeklyRentalRate;
	
	CabinRental(int cabinNo){
		this.cabinNum = cabinNo;
		if(cabinNo == 1 || cabinNo == 2 || cabinNo == 3){
			this.weeklyRentalRate = 950;
		}
		else{
			this.weeklyRentalRate = 1100;
		}
	}
	
	int getCabinNum(){
		return cabinNum;
	}
	double getRentalRate(){
		return weeklyRentalRate;
	}
	
}
