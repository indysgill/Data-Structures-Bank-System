package BankingSystem;
class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance > 0 ? initialBalance : 0;
        Bank.listOfAccounts.add(this);
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("New balance after deposit: "+this.balance);
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
        System.out.println("New balance after withdrawal: "+this.balance);
    }

    public double calculateInterest() {
        if(balance > 0) {
            return balance * 0.05 / 365; // Daily interest for simplification
        }
        return 0;
    }

    public double getBalance() {
        return balance + calculateInterest();
    }
}
