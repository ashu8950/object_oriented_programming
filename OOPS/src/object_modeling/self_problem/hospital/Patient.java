package object_modeling.self_problem.hospital;
import java.util.ArrayList;

public class Patient {
	private String patientName;
	private ArrayList<Doctor>doctors;
	
	Patient(String patientName){
		this.patientName = patientName;
		this.doctors = new ArrayList<>();
	}
	
    public void addDoctor(Doctor doctor) {
    	if(!doctors.contains(doctor)) {
    		doctors.add(doctor);
    		doctor.addPatient(this);
    	}
    }
    
    String getName() {
    	return patientName;
    }
    
    public ArrayList<String> showDoctors(){
    	ArrayList<String>doc = new ArrayList<>();
    	for(Doctor doctor : doctors) {
    		doc.add(doctor.getName());
    	}
    	return doc;
    }
	
}
