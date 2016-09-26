/** 
 * @author Sovichea Cheth
 * @version 1.0
 * @since 09/13/2016
 * @description Programming Assignment 4-4: use the recursive merge procedure discussed in the slides as
part of a recursive procedure DivideSort, which sorts the characters in an input String,
and returns the sorted String.
 * */

public class DivideSort {
	
	static String divideSort(String s){
		Merge m = new Merge();
		
		int len = s.length();
		if(len <= 1)
			return s;
		
		int mid = len / 2;
		
		String sleft = divideSort(s.substring(0, mid));
		String sright = divideSort(s.substring(mid));
		String result = m.merge(sleft, sright);
		return result;
	}
	
	public static void main(String[] args) {
		String s="pizzzzzahooootdddooooooogssss";
		System.out.println(divideSort(s));
	}
	


}
