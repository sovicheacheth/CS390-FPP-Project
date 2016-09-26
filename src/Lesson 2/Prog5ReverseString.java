import java.util.Scanner;

/** 
 * FPP - Group 1 - Prof.Promila Bahadur
 * @author Sovichea Cheth
 * @version 1.0
 * @since Sep-08-2016
 * @description 
 * Write a program (called Prog5) that asks the user to input a String. The output is the
characters of this String in reverse order. (For example, if the input string is "Hello",
the output string would be "olleH".) (Do not use arrays and do not create a new String
object.)
 * */

public class Prog5ReverseString {

	public static void main(String[] args) {
		System.out.print("Input String: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
        char temp;
        char[] arr = inputString.toCharArray();
        int len = arr.length;
        
        for(int i=0; i<(inputString.length())/2; i++,len--){
            temp = arr[i];
            arr[i] = arr[len-1];
            arr[len-1] = temp;
        }
        
        System.out.println("Reverse String: " + String.valueOf(arr));
	}
	
	
}
