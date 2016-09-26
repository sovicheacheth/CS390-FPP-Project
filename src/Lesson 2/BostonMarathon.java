/*
 * @author: Roshan Chaudhary
 * @Ver: 1.0
 * @info: This program calculates the first and second position in marathon
 */
public class BostonMarathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] time = {8.00,7.12,6.19,10.21,5.34};//time of performer in seconds
		double first = time[0] , second = time[0];//initialization
		
		for(int i =1;i<time.length;i++){
			if(time[i]<first){
				second = first;//if less time value come across, first gives
								//its value to second and takes new value itself
				first = time[i];	
			}
		}
		System.out.println("Best Performer "+first+" Second Best Performer "+second);//displaying the output
	}

}
