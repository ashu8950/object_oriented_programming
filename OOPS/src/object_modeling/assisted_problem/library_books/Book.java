package object_modeling.assisted_problem.library_books;

public class Book {
	private String title;
	private String author;
	Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	void display() {
		System.out.println("Title : "+title+"\nAuthor : "+author);
	}

}
