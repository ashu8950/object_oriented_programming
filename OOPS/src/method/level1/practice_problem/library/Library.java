package method.level1.practice_problem.library;

public class Library {
	private String title;
	private String author;
	private double price;
	private boolean isAvailable;
	private Library(String title,String author,double price) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
		this.price  = price;
		this.isAvailable = true;
		
	}
	private void borrowBook() {
		if(isAvailable) {
			isAvailable = false;
			System.out.println("You have successfully borrowed: " + title);
		}
		else {
			System.out.println("Sorry, '" + title + "' is currently not available.");
		}
	}
	
	private void display() {
		System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library("The Alchemist", "Paulo Coelho", 9.99);	
		Library library1 = new Library("Atomic Habits", "James Clear", 14.99);	
		library.display();
		library1.display();
		
		library.borrowBook();
		System.out.println();
		
		library.display();
		
	}

}
