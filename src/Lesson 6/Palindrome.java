package Lab6;
/*
 * @Author: Roshan Chaudhary
 * @Question: Q-2. A palindrome (File: Fact100)
 * */
public class Palindrome {
	static String output = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean output = palinCheck("otto");
		System.out.println("Text is palindrom: "+output);
	}

	private static boolean palinCheck(String s) {
		// TODO Auto-generated method stub
		String palinout = recurStr(s);
		if(s.equals(palinout))
			return true;
		else
			return false;
	}

	private static String recurStr(String s) {
		// TODO Auto-generated method stub
		if(s.length()==1){
			return output = output+s;
		}
		output = output + s.charAt(s.length()-1);
		recurStr(s.substring(0,s.length()-1));
		
		return output;
	}

}
