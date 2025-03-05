package object_modeling.self_problem.hospital;
import java.util.ArrayList;

public class Hospital {
	private String hospitalName;
	private ArrayList<Patient>patients;
	private ArrayList<Doctor>doctors;
	
	Hospital(String hospitalName){
		this.hospitalName = hospitalName;
		this.patients = new ArrayList<>();
		this.doctors = new ArrayList<>();
	}
	
	public void addDoctor(Doctor doctor) {
		if(!doctors.contains(doctor)) {
			doctors.add(doctor);
		}
	}
	
	public void addPatient(Patient patient) {
		if(!patients.contains(patient)) {
			patients.add(patient);
		}
	}
	
	public ArrayList<String> showDoctor(){
		ArrayList<String>doctorName = new ArrayList<>();
		for(Doctor doctor:doctors) {
			doctorName.add(doctor.getName());
		}
		return doctorName;
	}
	
	public ArrayList<String> showPatient(){
		ArrayList<String>patientName = new ArrayList<>();
		for(Patient patient : patients) {
			patientName.add(patient.getName());
		}
		return patientName;
	}
	
	//get the name of hospital
	
	String getName() {
		return hospitalName;
	}
	
}
