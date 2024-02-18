package BankingSystem;
class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
        Bank.listOfAccounts.add(this);
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0) {
            balance -= amount;
        }
    }

    public double calculateInterest() {
        if(balance < 0) {
            return balance * 0.3 / 365; // Daily interest for simplification
        }
        return 0;
    }

    public double getBalance() {
        return balance + calculateInterest();
    }
}
