package Lab6;
/*
 * @Author: Roshan Chaudhary
 * @Question: Q1-Write a program to generate factorial of 100.(Hint : Use BigInteger)
 * 																(File: Fact100)
 * */
import java.math.BigInteger;

public class Fact100 {

	public static void main(String[] args){
		System.out.println("-----------Factorial of 100-------------");
		BigInteger out = factorial(100);
		System.out.println(out);
	}

	   public static BigInteger factorial(int num){
		    if (num<=1)
		        return BigInteger.ONE;
		    else
		        return factorial(num-1).multiply(BigInteger.valueOf(num));
		    }
	
}
