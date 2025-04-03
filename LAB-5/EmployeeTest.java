class Employee {
    protected String name;
    protected int empId;
    protected double salary;

    public Employee() {
        this.name = "Unknown";
        this.empId = 0;
        this.salary = 0.0;
    }
    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("Invalid percentage increase.");
        }
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary); 
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, 50000);
        System.out.println("Before salary increase:");
        emp1.display();

        emp1.increaseSalary(10);
        System.out.println("\nAfter 10% salary increase:");
        emp1.display();

        Manager mgr1 = new Manager("Alice Smith", 102, 70000, "IT");
        System.out.println("\nManager Details:");
        mgr1.display();
    }
}
