package keyword.programming_practices.hospital_management;

public class HospitalManagementSystem {
	public static void main(String[] args) {
        // Creating patient objects
        Patient patient1 = new Patient(101, "Aman", 22, "Fever");
        Patient patient2 = new Patient(102, "Adarsh", 23, "Cold");

        // Displaying patient details
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

        // Displaying total patients admitted
        Patient.getTotalPatients();
    }

}
