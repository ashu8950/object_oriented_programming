package classes_fundamental.level2.movie_ticket;

public class MovieTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Movie ticket1 = new Movie("Inception", 12, 15.50);
		    
		    //ticket1.displayTicketDetails(); // Should show "Available"
		    
    	    boolean firstBooking = ticket1.bookTicket(); // Should be successful
		    System.out.println("First booking successful? " + firstBooking);
		    
		    boolean secondBooking = ticket1.bookTicket(); // Should be denied		    
		    System.out.println("Second booking successful? " + secondBooking);	    	    
		    //ticket1.displayTicketDetails(); // Should show "Booked"
	     
	    
	    
	     
	}

}
