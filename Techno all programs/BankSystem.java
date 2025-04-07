import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private final Lock lock = new ReentrantLock(); // To ensure thread safety

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        lock.lock();
        try {
            if (amount > 0) {
                balance += amount;
                System.out.println(Thread.currentThread().getName() + " deposited: $" + amount + ", New Balance: $" + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " Invalid deposit amount: $" + amount);
            }
        } finally {
            lock.unlock();
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        lock.lock();
        try {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew: $" + amount + ", New Balance: $" + balance);
            } else if (amount > balance) {
                System.out.println(Thread.currentThread().getName() + " Insufficient funds to withdraw: $" + amount + ", Current Balance: $" + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " Invalid withdrawal amount: $" + amount);
            }
        } finally {
            lock.unlock();
        }
    }

    // Method to check the current balance
    public double getBalance() {
        return balance;
    }
}

class Transaction implements Runnable {
    private final BankSystem account;
    private final String transactionType;
    private final double amount;

    public Transaction(BankSystem account, String transactionType, double amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (transactionType.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (transactionType.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " Invalid transaction type: " + transactionType);
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankSystem account = new BankSystem(1000.00);  // Initial balance of $1000

        // Creating multiple threads for transactions
        Thread t1 = new Thread(new Transaction(account, "deposit", 500.00), "User1");
        Thread t2 = new Thread(new Transaction(account, "withdraw", 200.00), "User2");
        Thread t3 = new Thread(new Transaction(account, "withdraw", 1000.00), "User3");
        Thread t4 = new Thread(new Transaction(account, "deposit", -50.00), "User4");  // Invalid deposit
        Thread t5 = new Thread(new Transaction(account, "withdraw", 1500.00), "User5"); // Insufficient funds

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Ensure all transactions are completed before displaying final balance
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final account balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
