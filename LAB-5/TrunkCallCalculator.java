import java.util.Scanner;

abstract class TrunkCall {
    protected int duration; 

    public TrunkCall(int duration) {
        this.duration = duration;
    }

    public abstract double calculateCharge();
}
class OrdinaryCall extends TrunkCall {
    private static final double RATE = 1.0;

    public OrdinaryCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * RATE;
    }
}
class UrgentCall extends TrunkCall {
    private static final double RATE = 2.0;

    public UrgentCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * RATE;
    }
}
class LightningCall extends TrunkCall {
    private static final double RATE = 3.0;

    public LightningCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * RATE;
    }
}

public class TrunkCallCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter call duration (in minutes): ");
        int duration = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter call type (Ordinary/Urgent/Lightning): ");
        String type = scanner.nextLine().trim().toLowerCase();

        TrunkCall call = null;

        switch (type) {
            case "ordinary":
                call = new OrdinaryCall(duration);
                break;
            case "urgent":
                call = new UrgentCall(duration);
                break;
            case "lightning":
                call = new LightningCall(duration);
                break;
            default:
                System.out.println("Invalid call type entered.");
                scanner.close();
                return;
        }

        System.out.println("Total charge: $" + call.calculateCharge());
        scanner.close();
    }
}