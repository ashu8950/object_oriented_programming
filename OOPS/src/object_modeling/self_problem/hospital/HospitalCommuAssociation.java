package object_modeling.self_problem.hospital;

public class HospitalCommuAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Hospital hospital = new Hospital("City Hospital");
	        Doctor doctor1 = new Doctor("Dr. Adams");
	        Doctor doctor2 = new Doctor("Dr. Brown");
	        Patient patient1 = new Patient("Alice");
	        Patient patient2 = new Patient("Bob");

	        // Adding doctors and patients to the hospital
	        hospital.addDoctor(doctor1);
	        hospital.addDoctor(doctor2);
	        hospital.addPatient(patient1);
	        hospital.addPatient(patient2);

	        // Establish doctor-patient relationships
	        doctor1.addPatient(patient1);
	        doctor1.addPatient(patient2);
	        doctor2.addPatient(patient1);

	        // Demonstrate consultations
	        doctor1.consult(patient1); // Dr. Adams is consulting Alice
	        doctor2.consult(patient2); // Dr. Brown has no appointment with Bob

	        // Show all doctors in the hospital
	        System.out.println("Doctors in " + hospital.getName() + ": " + hospital.showDoctor());
	        
	        // Show all patients in the hospital
	        System.out.println("Patients in " + hospital.getName() + ": " + hospital.showPatient());

	}

}
