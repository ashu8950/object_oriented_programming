package encap_poly.banking;

public interface Loanable {
	void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
