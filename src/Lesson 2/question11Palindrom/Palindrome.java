package question11Palindrom;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.print("Enter the string You wants to Check: ");
		
		Scanner scan =new Scanner(System.in);
		
		
		String word=scan.nextLine();
		boolean indicator=true;
		
		
		int mid =word.length()/2;
		char arr[]= new char[word.length()];
		
		int j=0;
	
		
		for(int i=0; i<word.length();i++)
		{
			if(Character.isAlphabetic(word.charAt(i) ))
					{
				      arr[j]= word.charAt(i);
				      j++;
					}
			
		}
		
		for(int i=0, k=j-1; i< j/2; i++, k--)
		{
			if(arr[i]!=arr[k])
			{
				indicator=false;
				break;
			}
			
		}
		
		if(indicator)
		{
			System.out.println("Its a palandrome");
		
		}
		
		else
		{
			System.out.println("Its not a palandrome");

		}
		
	}

}
