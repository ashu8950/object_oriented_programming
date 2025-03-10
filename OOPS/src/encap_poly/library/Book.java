package encap_poly.library;

class Book extends LibraryItem implements Reservable {
    private boolean reserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 21; // 3 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

