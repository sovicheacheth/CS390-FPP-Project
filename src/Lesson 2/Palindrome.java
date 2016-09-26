import java.util.Scanner;

/** 
 * FPP - Group 1 - Prof.Promila Bahadur
 * @author Sovichea Cheth
 * @version 1.0
 * @since Sep-08-2016
 * @description 
 * Write an application that determines if an input word is a palindrome. 
 * A palindrome is a string that reads the same forward and backward, for example, 
 * noon and madam. Ignore the case of the letter.
 * */

public class Palindrome {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input word: ");
		String word = in.nextLine();
		int wordLength = word.length();
		boolean palindrome = true;
		for(int i=0; i<wordLength/2; i++) {
			if(word.charAt(i) != word.charAt(wordLength-i-1)) {
				System.out.println("Not Palindrome");
				palindrome = false;
				break;
			}
		}
		if(palindrome) {
			System.out.println("Palindrome");
		}
	}
}
