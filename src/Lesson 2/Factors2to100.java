/*
 * @author: Roshan Chaudhary
 * @Ver: 1.0
 * @info: This program calculates factors of numbers from 2 to 100
 */
public class Factors2to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=100;i++){//from two to hundred
			System.out.println("Factors of "+i+": ");
			for(int j=2;j<i;j++){//calculating factors
				if(i%j==0)
					System.out.print(j+" ");
			}
			System.out.println("");//to go to next line
		}
	}

}
