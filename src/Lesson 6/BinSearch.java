public class BinSearch {

	


	public static void main(String[]arg){
	System.out.println("given charctar  is?      "+search("abcd",'b'));
	
	
	}
	public static boolean search(String s, char ch) {
	
		if (s.length() < 1)
			return false;

		int lastindex = s.length();
		int firstIndex = 0;
		int midIndex = (lastindex + firstIndex) / 2;
		
		if (s.charAt(midIndex) == ch) {
			return true;
		}

		else if (s.charAt(midIndex) > ch) {
			return search(s.substring(0, midIndex), ch);
		} else {
			return search(s.substring(midIndex), ch);
		}
	}

}
