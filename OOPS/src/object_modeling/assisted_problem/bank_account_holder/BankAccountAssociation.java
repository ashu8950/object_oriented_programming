package object_modeling.assisted_problem.bank_account_holder;

public class BankAccountAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create Bank objects
        Bank bank1 = new Bank("Bank of America");
        Bank bank2 = new Bank("Chase Bank");

        // Create Customer objects
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts for customers
        bank1.openAccount(customer1, 5000);
        bank1.openAccount(customer1, 3000);
        bank2.openAccount(customer2, 7000);

        // Customers check their account balances
        customer1.viewBalance();
        customer2.viewBalance();
    

	}

}
