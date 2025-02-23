class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Protected method to withdraw funds
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Default access method to check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        
        // Accessing public method
        account.deposit(500);
        
        // Accessing default method
        account.checkBalance();
        
        // Accessing protected method (Only within the same package or subclass)
        account.withdraw(300);
        account.checkBalance();
        
        // Attempt to access private variable (Not possible outside the class)
        // System.out.println(account.balance); // This will cause an error
    }
}
