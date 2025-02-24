package classes_fundamental.level2.movie_ticket;

public class Movie {
	private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    public Movie(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket(double newPrice) {
        if (!isBooked) {
            isBooked = true;
            this.price = newPrice;
            System.out.println("Ticket booked successfully for " + movieName + " at seat " + seatNumber + " with updated price: $" + String.format("%.2f", price));
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }
}
