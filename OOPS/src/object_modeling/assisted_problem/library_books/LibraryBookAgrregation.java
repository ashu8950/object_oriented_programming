package object_modeling.assisted_problem.library_books;

public class LibraryBookAgrregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create independent books
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        // Create Libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Add books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        library2.addBook(book1); // Same book can exist in multiple libraries

        // Display books in each library
        library1.showBook();
        library2.showBook();

	}

}
