
package question;

import java.util.ArrayList;
import java.util.Scanner;

public class StringHandle {

	private String storeWord;
	public StringBuilder str;
	Scanner scan;
	ArrayList <String> list=new ArrayList<>();
	/**
	 * @ this function is used for to make substring.this function is void
	 * return type with no argument
	 * 
	 * 
	 * 
	 *
	 */
	public void toSeparateString() {

		int nextcharacter = 1;
		String temp;
		for (int x = 0; x < this.storeWord.length(); x++) {

			
			System.out.println("Substrings of length : " +(x+1));

			
			for (int firstindex = 0; firstindex < this.storeWord.length(); firstindex++)

			{
				if ((nextcharacter + firstindex) <= this.storeWord.length()){
					temp=this.storeWord.substring(firstindex, nextcharacter + firstindex);
				
				toCheckDouble(temp);
				}
			}

			for(String print:list)
			{
				System.out.println(print);
			}
			list.clear();
			nextcharacter++;
			System.out.println("*************************************");
		}
	}

	/**
	 * @ this function is used for input the string in class
	 * 
	 */

	public void toInputWord()

	{
		scan = new Scanner(System.in);
		this.storeWord = scan.nextLine();
	StringBuilder str=new StringBuilder(this.storeWord);
		System.out.println(str.reverse());
	}
	
	public void toCheckDouble(String temp)

	{
		if(!(list.contains(temp)))
		{
			list.add(temp);
		}
		
	}
}


