class BankAccount {

    String account_holder_name;
    double balance;
    static double interest_rate = 5.0; // static variable (same for all accounts)

    // Constructor
    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display interest earned
    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Updated Interest Rate: " + interest_rate + "%");
    }

    public static void main(String[] args) {

        // Creating bank account objects
        BankAccount acc1 = new BankAccount("Khushi", 10000);
        BankAccount acc2 = new BankAccount("Rahul", 20000);

        // Display interest for both accounts
        acc1.displayInterest();
        acc2.displayInterest();

        System.out.println();

        // Update interest rate using static method
        BankAccount.updateInterestRate(6.5);

        System.out.println();

        // Display interest again after updating rate
        acc1.displayInterest();
        acc2.displayInterest();
    }
}