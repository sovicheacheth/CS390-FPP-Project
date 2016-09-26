package CreditUnion2;

import java.util.Date;
import java.util.GregorianCalendar;
import CreditUnion.Account.AccounType;
import CreditUnion.*;

public class Employee {
		
		
		Account account;
		private double cheking;
		private double retirment;
		private double Saving;
		private String name;
		private Date hireDate;
		public Employee(String name, int yearOfHire,int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
		}
		public void createNewChecking(double startAmount) {
		
			//account.makeDeposit(startAmount, AccounType.CHECKING);
			cheking= startAmount;
			//account.makeDeposit(startAmount, Account.AccounType.CHECKING);
		}
		public void createNewSavings(double startAmount) {
	
			//account.makeDeposit(startAmount, AccounType.SAVINGS);

		    Saving=startAmount;
		    //account.makeDeposit(startAmount, Account.AccounType.SAVINGS);
		
		}
		public void createNewRetirement(double startAmount) {
		
			//account.makeDeposit(startAmount, Account.AccounType.RETIREMENT);

			retirment=startAmount;
		}
		public void deposit(Account.AccounType acctType, double amt){
		
			
			account.makeDeposit(amt, acctType);
		}
		public boolean withdraw(Account.AccounType acctType, double amt){
			
			if (acctType==AccounType.CHECKING && amt > cheking)
			{
				cheking = cheking -amt;
				
				return true;
			}
			
			else if (acctType==AccounType.RETIREMENT && amt > retirment)
			{
				retirment= retirment -amt;
				
				return true;
			}
			
			else if (acctType==AccounType.SAVINGS && amt > Saving)
			{
				Saving = Saving -amt;
				
				return true;
			}
			
			else
			{
				return false;
			}
		}
		
		
		public String getFormattedAcctInfo() {
		
			return "Name: " + name+ "\n Cheking account: "+ cheking + "\n Retiremnt  account: " + retirment + "\n Saving Account : "+ Saving;
		
		}
}
