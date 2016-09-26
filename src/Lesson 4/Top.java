/** 
 * @author Sovichea Cheth
 * @version 1.0
 * @since Sep-11-2016
 * @description Programming Assignment 6-2: implement the method and perform all initialization of the inner classes
 * */

public class Top {
	
	int x;	
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	
	//returns the value in the instance vble of Bottom
	int readBottom() {
		//implement		
		Middle middle = new Middle();
		Middle.Bottom bottom = middle.new Bottom();
		x = bottom.b;		
		return x;
	}
	
	class Middle {
		int m = 2;
		//returns sum of instance vble in Top and
		//instance vble in Bottom
		int addTopAndBottom() {
			//implement			
			Bottom bottom = new Bottom();
			int sum = bottom.b + t;			
			return sum;
		}
		
		class Bottom {
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement				
				int product = t * m * b;				
				return product;
			}
		}
	}
	
	public static void main(String[] args){
		Top top = new Top();
		Middle mid = top.new Middle();
		Middle.Bottom midbot = mid.new Bottom();

		System.out.println(top.readBottom());
		System.out.println(mid.addTopAndBottom());
		System.out.println(midbot.multiplyAllThree());
		
	}

}