class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public double computePay(int hours) {
        return 0;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; 
        return daysWorked * salaryRate;
    }
}
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    @Override
    public double computePay(int hours) {
        return 40 * salaryRate;
    }
}
public class WorkerSalary {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("John", 100);
        SalariedWorker salariedWorker = new SalariedWorker("Alice", 150);

    
        System.out.println("John's Pay: $" + dailyWorker.computePay(32));
        System.out.println("Alice's Pay: $" + salariedWorker.computePay(50)); 
    }
}

