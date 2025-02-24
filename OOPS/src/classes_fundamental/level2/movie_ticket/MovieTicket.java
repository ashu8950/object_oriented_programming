package classes_fundamental.level2.movie_ticket;

public class MovieTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie ticket1 = new Movie("Inception", "A12", 12.50);
        Movie ticket2 = new Movie("Interstellar", "B7", 15.00);

        ticket1.displayDetails();
        ticket1.bookTicket(14.00);
        ticket1.displayDetails();

        System.out.println(); 

        ticket2.displayDetails();
        ticket2.bookTicket(16.50);
        ticket2.displayDetails();

	}

}
