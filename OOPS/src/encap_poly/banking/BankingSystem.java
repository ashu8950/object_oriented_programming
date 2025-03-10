package encap_poly.banking;

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount[] accounts = new BankAccount[] {
		            new SavingsAccount("SAV001", "Alice", 12000),
		            new CurrentAccount("CUR002", "Bob", 8000),
		            new SavingsAccount("SAV003", "Charlie", 4000)
		        };

		        System.out.println("=== Account Summaries ===");
		        for (BankAccount account : accounts) {
		            account.deposit(1000);
		            account.withdraw(500);
		            account.displayAccountDetails();

		            // Polymorphic check for loanable accounts
		            if (account instanceof Loanable) {
		                Loanable loanable = (Loanable) account;
		                loanable.applyForLoan(10000);
		                System.out.println("Eligible for loan: " + loanable.calculateLoanEligibility());
		                System.out.println("-----------------------------");
		            }
		        }
	}

}
