package object_modeling.assisted_problem.bank_account_holder;

public class Bank {
	String bankName;
	Bank(String name){
		this.bankName = name;
	}
	public String getName() {
		return bankName;
	}
	 public BankAccount openAccount(Customer customer, double initialBalance) {
	        BankAccount account = new BankAccount(this, customer, initialBalance);
	        customer.addAccount(account); // Associating account with the customer
	        System.out.println("Account opened for " + customer.name + " at " + bankName);
	        return account;
	 }
}
