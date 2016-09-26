public class chartectorspliter {


	public static void main(String[]arg)

	{
		print("raushan");
	}
	public static void print(String s)
	{
	
		int n=s.length();
		if(n<1)
			return;
		print(s.substring(0,n-1));
	   System.out.println(s.charAt(n-1));
		
		
		
		
		}
	}
	