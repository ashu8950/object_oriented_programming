package inheritance.single_inheritance.library_manage;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Author book = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald",
        		"American novelist famous for depicting the Jazz Age.");
        
        // Display book and author details
        book.displayInfo();
	}

}
