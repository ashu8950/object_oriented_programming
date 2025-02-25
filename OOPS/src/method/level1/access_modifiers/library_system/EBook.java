package method.level1.access_modifiers.library_system;

public class EBook extends Book {
    private String fileFormat; 

    // Constructor
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Display EBook details
    public void displayEBook() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);   
        System.out.println("Title: " + title); 
        System.out.println("File Format: " + fileFormat);
    }
}
