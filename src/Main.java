class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    // Setters
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Amount: " + amount);
    }

    // Withdraw Method
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Create Bank Account
        BankAccount acc = new BankAccount("Dhruv", 1001, 6000);

        // Deposit and Withdraw
        acc.deposit(2000);
        acc.withdraw(1000);

        // Get Balance
        int currentBalance = acc.getBalance();

        System.out.println("Current Balance: " + currentBalance);

        // Ternary Operator
        String status = (currentBalance >= 5000)
                ? "Minimum Balance Maintained"
                : "Minimum Balance not Maintained";

        // Display Status
        System.out.println("Status: " + status);
    }
}