package method.level1.access_modifiers.library_system;

public class Book {
	    public String ISBN;      
	    protected String title;  
	    private String author;   

	    // Constructor
	    public Book(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    // Setter and Getter for author (since it's private)
	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    // Display book details
	    public void display() {
	        System.out.println("ISBN: " + ISBN);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	    }
}
