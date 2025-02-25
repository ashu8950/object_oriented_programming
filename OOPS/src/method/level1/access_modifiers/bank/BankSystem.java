package method.level1.access_modifiers.bank;

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "John Doe", 5000.0);
        account1.display();
        account1.deposit(1000);
        account1.withdraw(2000);
        System.out.println("Updated Balance: $" + account1.getBalance());

        System.out.println("\n=====================");

        SavingAccount savings1 = new SavingAccount("987654", "Jane Smith", 7000.0, 5.0);
        savings1.displaySavingsAccount();  
        savings1.applyInterest();
        System.out.println("Updated Balance (after interest): $" + savings1.getBalance());
    }
}
