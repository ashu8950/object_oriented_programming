package method.level1.practice_problem.Book;

public class Book {
	private String title;
	private String author;
	private double price;
	
	//default constructor
	Book(){
		this.title  = "To Kill a Mockingbird";
		this.author = "Harper Lee";
		this.price  = 300.00;
		
	}
	
	//parameterized constructor
	Book(String title,String author,double price){
		this.title	= title;
		this.author = author;
		this.price	= price;
	}
	private void display() {
		System.out.println("Title of the Book is :"+title);
		System.out.println("Author of the Book is :"+author);
		System.out.println("Price of the Book is : $"+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling for non parameterized constructor
		Book book = new Book();
		book.display();
		System.out.println();
		//calling for parameterized constructor
		Book book1 = new Book("The Alchemist","Paulo Coelho",200.00);
		book1.display();
		

	}

}
