package BankingSystem;
import java.time.*;
class CurrentAccount implements Account {
    private double balance;
    private final LocalDateTime accountCreationDate;
    public CurrentAccount(double initialBalance) {
        this.accountCreationDate = LocalDateTime.now();
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
        LocalDateTime currentDate = LocalDateTime.now();
        Duration ageOfAccount = Duration.between(currentDate,this.accountCreationDate);
        int days = (int)ageOfAccount.toDays();
        if(balance < 0) {
            return balance * 0.3 / 365 * days; // Daily interest for simplification
        }
        return 0;
    }
    public double getBalance() {
        return balance + calculateInterest();
    }
}
