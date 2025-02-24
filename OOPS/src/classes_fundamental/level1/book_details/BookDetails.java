package classes_fundamental.level1.book_details;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
	     Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 7.99);

	     book1.displayDetails();
	     System.out.println();  
	     book2.displayDetails();

	}

}
