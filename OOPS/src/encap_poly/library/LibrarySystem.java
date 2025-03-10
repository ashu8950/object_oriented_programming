package encap_poly.library;

public class LibrarySystem {
	public static void main(String[]args) {
		LibraryItem[] items = new LibraryItem[] {
	            new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald"),
	            new Magazine("M202", "National Geographic", "Editorial Team"),
	            new DVD("D303", "Inception", "Christopher Nolan")
	        };

	        System.out.println("=== Library Item Summary ===");
	        for (LibraryItem item : items) {
	            item.getItemDetails();

	            if (item instanceof Reservable) {
	                Reservable r = (Reservable) item;
	                if (r.checkAvailability()) {
	                    r.reserveItem("JohnDoe");
	                }
	                System.out.println("Available: " + r.checkAvailability());
	                System.out.println("-----------------------------");
	            }
	        }

	        System.out.println("=== After Reservation ===");
	        for (LibraryItem item : items) {
	            item.getItemDetails();
	        }
	}
}
