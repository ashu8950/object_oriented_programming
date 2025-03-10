package encap_poly.library;

public interface Reservable {
	void reserveItem(String borrowerName);
    boolean checkAvailability();
}
