package encap_poly.banking;

class CurrentAccount extends BankAccount {
    private final double interestRate = 0.02; // 2%

    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}
