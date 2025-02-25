package method.level1.access_modifiers.library_system;

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("123-456-789", "Java Programming", "John Doe");
        book1.display(); 

        // Creating an EBook object
        EBook ebook1 = new EBook("987-654-321", "Advanced Java", "Jane Smith", "PDF");
        ebook1.displayEBook();  

        System.out.println("\nDirectly Accessing ISBN: " + ebook1.ISBN); 


        // Using getter to access author
        System.out.println("EBook Author (via Getter): " + ebook1.getAuthor());
    }
}
