package encap_poly.banking;

public abstract class BankAccount {
	 private String accountNumber;
	    private String holderName;
	    private double balance;

	    // Constructor
	    public BankAccount(String accountNumber, String holderName, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = initialBalance;
	    }

	    // Getters
	    public String getAccountNumber() { return accountNumber; }
	    public String getHolderName() { return holderName; }
	    public double getBalance() { return balance; }

	    // Deposit Method
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println(holderName + " deposited: ₹" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Withdraw Method
	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println(holderName + " withdrew: ₹" + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }

	    // Protected setter for balance (internal use only)
	    protected void setBalance(double newBalance) {
	        this.balance = newBalance;
	    }

	    // Abstract method for interest calculation
	    public abstract double calculateInterest();

	    // Display Account Info
	    public void displayAccountDetails() {
	        System.out.println("Account: " + accountNumber);
	        System.out.println("Holder: " + holderName);
	        System.out.println("Balance: ₹" + balance);
	        System.out.println("Interest Earned: ₹" + calculateInterest());
	        System.out.println("-----------------------------");
	    }
}
