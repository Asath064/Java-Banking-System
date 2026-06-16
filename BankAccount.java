public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful!");
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Funds!");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void displayAccountDetails() {

        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}
