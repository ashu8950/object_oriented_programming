package encap_poly.hospital_management;
import java.util.List;
public class HospitalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Patient[] patients = new Patient[] {
		            new InPatient("IP001", "Alice", 30, 4, 2500),
		            new OutPatient("OP002", "Bob", 45, 600),
		            new InPatient("IP003", "Charlie", 50, 2, 3000)
		        };

		        // Set Diagnoses and Medical Records
		        for (Patient p : patients) {
		            p.setDiagnosis("General Checkup");

		            if (p instanceof MedicalRecord) {
		                MedicalRecord record = (MedicalRecord) p;
		                record.addRecord("Initial consultation completed.");
		                record.addRecord("Vitals stable.");
		            }
		        }

		        // Display Patient Info with Polymorphism
		        System.out.println("=== Patient Billing Summary ===");
		        for (Patient p : patients) {
		            p.getPatientDetails();

		            if (p instanceof MedicalRecord) {
		                System.out.println("Medical Records:");
		                List<String> records = ((MedicalRecord) p).viewRecords();
		                for (String rec : records) {
		                    System.out.println("• " + rec);
		                }
		                System.out.println("-----------------------------");
		            }
		        }
	}

}
