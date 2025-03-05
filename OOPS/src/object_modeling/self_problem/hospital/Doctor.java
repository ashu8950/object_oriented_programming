package object_modeling.self_problem.hospital;
import java.util.ArrayList;
public class Doctor {
	 private String doctorName;
	 private ArrayList<Patient>patients;
	 Doctor(String doctorName){
		 this.doctorName = doctorName;
		 this.patients = new ArrayList<>();
	 }
	 
	 //add patient 
	 
	 public void addPatient(Patient patient) {
		 if(!patients.contains(patient)) {
			 patients.add(patient);
			 patient.addDoctor(this);
		 }
	 }
	 //consult
	 public void consult(Patient patient) {
		 if(patients.contains(patient)) {
			 System.out.println("Dr. " + doctorName + " is consulting " + patient.getName());
		 }
		 else {
			 System.out.println("Dr. " + doctorName + " has no appointment with " + patient.getName());
		 }
	 }
	 
	 public ArrayList<String> showPatient(){
		 ArrayList<String>p = new ArrayList<>();
		 for(Patient patient:patients) {
			 p.add(patient.getName());
		 }
		 return p;
	 }
	 
	 //get the name of doctor
	 
	  String getName() {
		  return doctorName;
	  }
}
