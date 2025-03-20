// Parent class (Worker)
class Worker {
    String name;
    double salaryRate;

    // Constructor
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Method to compute pay (to be overridden)
    public double computePay(int hours) {
        return 0; // Default return (overridden in subclasses)
    }
}

// Subclass 1: Daily Worker
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Computes pay based on number of days worked (8 hours per day)
    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; // Convert hours to days
        return daysWorked * salaryRate;
    }
}

// Subclass 2: Salaried Worker
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Computes pay for a fixed 40 hours per week
    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; // Always paid for 40 hours
    }
}

// Main class
public class WorkerSalary {
    public static void main(String[] args) {
        // Creating Worker objects
        DailyWorker dailyWorker = new DailyWorker("John", 100);
        SalariedWorker salariedWorker = new SalariedWorker("Alice", 150);

        // Calculating pay
        System.out.println("John's Pay: $" + dailyWorker.computePay(32)); // Worked 32 hours (4 days)
        System.out.println("Alice's Pay: $" + salariedWorker.computePay(50)); // Worked 50 hours (but fixed pay)
    }
}