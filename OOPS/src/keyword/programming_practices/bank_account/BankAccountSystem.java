package keyword.programming_practices.bank_account;

public class BankAccountSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    BankAccount acc1 = new BankAccount(101, "Aman", 500000);
	        BankAccount acc2 = new BankAccount(102, "Adarsh", 300000);

	        acc1.displayAccountDetails();
	        acc2.displayAccountDetails();
	        BankAccount.getTotalAccounts();

	}

}
