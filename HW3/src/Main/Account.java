package Main;
import java.util.Date;

public class Account {
	private int id ;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date();
	public Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		java.util.Date dateCreated = new java.util.Date();
			}
	public Account(int acc_id, double initial_balance, double annualInterestRate2){
		id=acc_id;
		balance=initial_balance;
		annualInterestRate=annualInterestRate2;
		java.util.Date dateCreated = new java.util.Date();
	}
	public double get_balance(){
		return balance;
	}
	public int get_id(){
		return id;
	}
	public double get_annualInterestRate(){
		return annualInterestRate;
	}
	public Date get_dateCreated(){
		return dateCreated;
	}
	public void set_id(int new_id){
		id=new_id;
	}
	public void set_balance(double new_balance){
		balance=new_balance;
	}
	public void set_annualInterestRate(double new_annualInterestRate){
		annualInterestRate=new_annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		return (((annualInterestRate/100)/12)*100);
	}
	public void withdraw(double amount)throws InsufficientFundsException{
		if(amount<=balance){
			balance-=(amount);
		}
		else
		{
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	}
	public void deposit(double amount){
		balance+=(amount);
	}
	
}
