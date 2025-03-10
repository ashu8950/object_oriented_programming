package encap_poly.hospital_management;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; // sensitive data

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Encapsulation: Diagnosis access
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMaskedDiagnosis() {
        return diagnosis != null ? "Diagnosis: Confidential" : "No diagnosis available";
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println(getMaskedDiagnosis());
        System.out.println("Total Bill: ₹" + calculateBill());
        System.out.println("-----------------------------");
    }
}