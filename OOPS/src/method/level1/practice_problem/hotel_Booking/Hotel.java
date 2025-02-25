package method.level1.practice_problem.hotel_Booking;

public class Hotel {
	private String guestName;
	private String roomType;
	private int nights;
	 Hotel() {
		// TODO Auto-generated constructor stub
		this.guestName = "Ayush";
		this.roomType  = "Double sharing";
		this.nights    = 2;
	}
	 Hotel(String guestName,String roomType,int nights) {
		this.guestName = guestName;
		this.roomType  = roomType;
		this.nights    = nights;
	}
	 Hotel(Hotel previous) {
		this.guestName = previous.guestName;
		this.roomType  = previous.roomType;
		this.nights    = previous.nights;
	}
	 void display() {
		System.out.println("Name of guest is :"+guestName);
		System.out.println("Room Type of guest is :"+roomType);
		System.out.println("No. of Nights staying guest is :"+nights);
	}

}
