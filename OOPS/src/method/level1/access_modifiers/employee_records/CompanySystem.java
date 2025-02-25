package method.level1.access_modifiers.employee_records;


public class CompanySystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "IT", 60000.0);
        emp1.display();
        emp1.setSalary(65000.0);
        System.out.println("Updated Salary: $" + emp1.getSalary());

        System.out.println("\n=====================");

        Manager mgr1 = new Manager(201, "HR", 80000.0, "Recruitment");
        mgr1.displayManager();
    }
}
