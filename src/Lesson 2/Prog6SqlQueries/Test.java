package Prog6SqlQueries;

import java.util.Scanner;

public class Test {

	private String tableName;
	private int numberOfCollum = 0;
	private String[] collumName;
	private Scanner scan;
	private double salaryValue;

	/**
	 * @Raushan Kumar mahaseth
	 * @version 1.0
	 * @date 09/08/2016
	 *
	 */
	public void toInsertTableData()
	{
		
		scan = new Scanner(System.in);
		
		System.out.println("Enter Table Name");
		this.tableName= scan.next();
		
		System.out.println("Enter Number of column");
		this.numberOfCollum = scan.nextInt();
		
	    String[] temp = new String[this.numberOfCollum];
        System.out.println("enter name of columm one by one");
        for (int i = 0; i < this.numberOfCollum; i++) {
			temp[i] = scan.next();
		}
       System.out.println("enter salary value");
       salaryValue=scan.nextDouble();
        
        this.collumName = temp;
	}

	public void toshowCollumnName() {
	String temp="";
	for(int i=0;i<this.numberOfCollum;i++)
	
	{
		temp=temp+this.collumName[i];
		if((this.numberOfCollum-1)-i != 0)
			temp=temp+",";
	}
		System.out.println("SELECT "+ temp +" From "+this.tableName+" Where "+" salary "+">"+ salaryValue);

		

	}

}


