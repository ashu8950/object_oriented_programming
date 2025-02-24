package classes_fundamental.level2.atm;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank account = new Bank("John Doe", "123456789", 500.00);
        
        account.displayBalance();
        account.deposit(200.00);
        account.displayBalance();
        account.withdraw(100.00);
        account.displayBalance();
        account.withdraw(700.00);
	}

}
