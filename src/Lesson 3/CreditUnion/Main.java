package CreditUnion;

import CreditUnion.Account.AccounType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp= new Employee("saif",20000, 1991, 10, 14);
		
		
		Account SavAccount = new Account(emp,AccounType.SAVINGS,300);
		Account RetAccount = new Account(emp,AccounType.RETIREMENT,300);
		Account ChkAccount = new Account(emp,AccounType.CHECKING,300);
		
		System.out.println(SavAccount);
		System.out.println(RetAccount);
		System.out.println(ChkAccount);

		System.out.println(emp);

	}

}
