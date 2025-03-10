package encap_poly.library;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower; // sensitive data

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
    }

    // Encapsulation: Getter
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // Encapsulated Access to Borrower Info
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrowerMasked() {
        return borrower != null ? "Borrowed by: ***" + borrower.charAt(borrower.length() - 1) : "Available";
    }

    // Abstract Method
    public abstract int getLoanDuration(); // in days

    // Concrete Method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Status: " + getBorrowerMasked());
        System.out.println("-----------------------------");
    }
}
