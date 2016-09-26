package Lab6;
/*
 * @Author: Roshan Chaudhary
 * @Question: Programming Assignment 4-1
 * */
public class Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans = Character.isDigit('a');
		System.out.println(ans);
		
		int ff = 2;
		System.out.println(ff);
		
		Exponential ex = new Exponential();				
		double output = ex.power(2,10);
		System.out.println(output);
	}

	double power(double x,int n){
		double output = 1;
		
		if(n==1){
			output = output * x;
			return output;
		}
		output = x * power(x,n-1);

		return output;
	}
}
