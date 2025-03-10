package encap_poly.banking;

class SavingsAccount extends BankAccount implements Loanable {
    private final double interestRate = 0.04; // 4%

    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}
