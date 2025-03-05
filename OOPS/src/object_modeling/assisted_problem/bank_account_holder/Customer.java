package object_modeling.assisted_problem.bank_account_holder;
import java.util.ArrayList;

public class Customer {
	String name;
	private ArrayList<BankAccount>accounts;
	
	Customer(String name){
		this.name= name;
		this.accounts = new ArrayList<>();
	}
	
	void addAccount(BankAccount account) {
		accounts.add(account);
	}
	
	void viewBalance() {
		System.out.println("\n"+name+" 's Accounts");
		for(BankAccount acc:accounts) {
			System.out.println("Bank : "+acc.bank.getName()+"Balance: $"+acc.getBalance());
		}
	}
}
