/** 
 * @author Sovichea Cheth
 * @version 1.0
 * @since 09/13/2016
 * @description Programming Assignment 4-3: create a recursive search routine that behaves as follows: Given a String s and a character c, 
 * it returns true if c occurs in s, false otherwise.
 * */

public class BinSearch {
	
	private int len;

	//recursive search method
	private boolean search(String s, char c){
		char ch = s.charAt(len/2);
		if(ch == c)
			return true;
		else if(c < ch)
			return search(s.substring(0, len/2), c);
		else if(c > ch)
			return search(s.substring((len/2)+1), c);
		else
			return false;
			
	}
	
	public static void main(String[] args) {
		String str = "hello";
		BinSearch value = new BinSearch();
		boolean result = value.search(str, 'h');
		System.out.println(result);
	}
}
