package method.level1.practice_problem.hotel_Booking;

public class HotelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default constructor
		Hotel hotel = new Hotel();
		hotel.display();
		System.out.println();
		//parameterized constructor
		Hotel hotel1 = new Hotel("Ashu","triple sharing",3);
		hotel1.display();
		System.out.println();
		//copy constructor
		Hotel hotel2 = new Hotel(hotel1);
		hotel2.display();

	}

}
