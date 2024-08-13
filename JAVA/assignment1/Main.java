package assignment;

import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class Bank {
    private List<Account> accounts;

    // Constructor
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // Add an account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account);
    }

    // Remove an account
    public void removeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account removed: " + account);
                return;
            }
        }
        System.out.println("Account with number " + accountNumber + " not found.");
    }

    // Display all accounts
    public void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create some account instances
        Account account1 = new Account("123456", "Alice Johnson", 5000.00);
        Account account2 = new Account("789012", "Bob Smith", 3000.00);
        Account account3 = new Account("345678", "Carol Williams", 1000.00);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Display all accounts
        System.out.println("\nAll accounts in the bank:");
        bank.displayAccounts();

        // Deposit money into an account
        System.out.println("\nDepositing 2000.00 into account 123456:");
        account1.deposit(2000.00);

        // Withdraw money from an account
        System.out.println("\nWithdrawing 1500.00 from account 789012:");
        account2.withdraw(1500.00);

        // Remove an account
        System.out.println("\nRemoving account with number 345678:");
        bank.removeAccount("345678");

        // Display all accounts after operations
        System.out.println("\nAll accounts in the bank after operations:");
        bank.displayAccounts();
    }
}
