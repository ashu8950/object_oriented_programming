package inheritance.hierarchical_inheritance.banck_account;

public class BankManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000.0, 12);

        savings.displayAccountDetails();
        savings.displayAccountType();
        System.out.println();
        
        checking.displayAccountDetails();
        checking.displayAccountType();
        System.out.println();
        
        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();

	}

}
