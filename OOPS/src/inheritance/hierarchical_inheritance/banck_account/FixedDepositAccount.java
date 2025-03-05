package inheritance.hierarchical_inheritance.banck_account;

public class FixedDepositAccount extends BankAccount {
	private int term;

    public FixedDepositAccount(String accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Term: " + term + " months");
    }

}
