package classes_fundamental.level2.movie_ticket;

public class Movie {
	private String movieName;
	private int seatNumber;
	private double price;
	private boolean isBooked;
	
	Movie(String movieName,int seatNumber,double price){
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.price      = price;
		this.isBooked   = false;
	}
	
	//Book a ticket
	public boolean bookTicket() {
		if(!isBooked) {
			isBooked = true;
			System.out.println("Ticket booked successfully for the movie \"" + movieName + "\" and seat is \"" + seatNumber + "\".");
			return true;
		}
		else {
			 System.out.println("Seat " + seatNumber + " is already booked. Choose a different seat.");
	            return false;
		}
	}
	
	//display ticket details
	 public void displayTicketDetails() {
	        System.out.println("Movie: " + movieName);
	        System.out.println("Seat Number: " + seatNumber);
	        System.out.println("Price: $" + price);
	        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
	    }
}
