/*
 @author: Roshan Chaudhary
 @Question: 1.Write program in Java to discuss different types of formatting  options(at least 10). 
 */
public class DifferentFormattingTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String heading1="Exam_Name";
		String heading2 = "Exam_Grade";
		String divider = "----------------------------------";
		
		String course1 = "Java"; String grade1 = "A";
		String course2 = "PHP"; String grade2 = "B";
		String course3 = "VB Net"; String grade3 = "C";
		
		System.out.println("");
		System.out.printf("%-15s %15s %n", heading1, heading2);
		System.out.println(divider);
		
		System.out.printf("%-15s %10s %n", course1, grade1);
		System.out.printf("%-15s %10s %n", course2, grade2);
		System.out.printf("%-15s %10s %n", course3, grade3);
		
		/*Another example*/
		System.out.printf("You owe me $%f \n", 195.50f);
		System.out.printf("You owe me $%.2f \n", 195.50f);
		System.out.printf("You owe me $%7.2f \n", 195.50f);

	}

}
