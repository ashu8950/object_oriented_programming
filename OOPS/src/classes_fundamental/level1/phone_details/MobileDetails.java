package classes_fundamental.level1.phone_details;

public class MobileDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile phone1 = new Mobile("Apple", "iPhone 13", 999.99);
		Mobile phone2 = new Mobile("Samsung", "Galaxy S21", 799.99);
		

        phone1.displayDetails();
        System.out.println();  
        phone2.displayDetails();

	}

}
