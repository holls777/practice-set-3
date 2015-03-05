package Main;

import static org.junit.Assert.*;

import org.junit.Test;


public class Account_test {
	public static void main(String [] args){
		Account acc = new Account(1122,20000,4.5);
		try
		{
		acc.withdraw(2500);
		acc.deposit(3000);
		
		
		System.out.println("Your monthly interest rate is " + acc.getMonthlyInterestRate());
		System.out.println("Your balance is  "+ acc.get_balance());
		System.out.println( "The account was created on "+ acc.get_dateCreated());
	}catch(InsufficientFundsException e)
		{
        System.out.println("Sorry, but you are short $"+ e.getAmount());
        e.printStackTrace();//doesn't work without this, don't remove
}
	
	}
}
