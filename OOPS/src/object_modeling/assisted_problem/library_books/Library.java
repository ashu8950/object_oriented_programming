package object_modeling.assisted_problem.library_books;
import java.util.ArrayList;

public class Library {
	private String name;
    private ArrayList<Book>books;
    Library(String name){
    	this.name = name;
    	this.books = new ArrayList<>();
    }
    void addBook(Book book) {
    	books.add(book);
    }
    void showBook() {
    	System.out.println("\nLibraray :"+name);
    	for(Book book : books) {
    		book.display();
    	}
    }
}
