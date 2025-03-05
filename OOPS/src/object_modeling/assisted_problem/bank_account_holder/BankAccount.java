package object_modeling.assisted_problem.bank_account_holder;

public class BankAccount {
	Bank bank;
	Customer customer;
	private double balance;
	public BankAccount(Bank bank, Customer customer,double balance) {
		this.bank = bank;
		this.customer = customer;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
}
