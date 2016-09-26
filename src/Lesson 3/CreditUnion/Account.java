/**
 * 
 */
package CreditUnion;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Raushan Kumar Mahaseth vesrion 1.1 since 9/12/2016
 *
 */


public class Account {
	
	public enum AccounType {
		CHECKING, SAVINGS, RETIREMENT
	};

	
	public AccounType accounType;
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	private Employee employee;

	Account(Employee emp, AccounType acctType, double balance) {
		employee = emp;
		this.accounType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccounType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	
	
	public String toString() {
		return "type = " + accounType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		

		this.balance = this.balance + deposit;

	}

   public void makeDeposit(double deposit , AccounType a ) {
		

		this.balance = this.balance + deposit;
		this.accounType=a;

	}

	
	
	public boolean makeWithdrawal(double amount) {
		

		if (this.balance < amount) {
			return false;

		}

		balance= balance-amount;
		return true;
	}

}
