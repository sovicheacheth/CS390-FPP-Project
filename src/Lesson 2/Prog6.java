import java.util.ArrayList;

/** 
 * FPP - Group 1 - Prof.Promila Bahadur
 * @author Sovichea Cheth
 * @version 1.0
 * @since Sep-08-2016
 * @description 
 * Write a program (called Prog6) that accepts String arguments (stored in args) from the
main method, removes all duplicates, and outputs these arguments (without duplicates) in
a comma-separated format. For example, if the input into the main method is
["horse", "dog", "cat", "horse","dog"]
then the output would be
"horse","dog","cat"
Typical output:
Original list: [ horse dog cat horse dog horse cat horse ]
List without duplicates: [ horse dog cat ]
 * */

public class Prog6 {
    public static void main(String[] args) {
        String[] argss = new String[]{"horse", "dog", "cat", "horse","dog"};

        ArrayList<String> withoutDuplicates = new ArrayList<String>();
        int len = argss.length;
        for(int i=0; i<len; i++) {
            if (!withoutDuplicates.contains(argss[i])){
                    withoutDuplicates.add(argss[i]);
                }
        }
		System.out.println("List without duplicates: " + withoutDuplicates.toString());
    }	
}
