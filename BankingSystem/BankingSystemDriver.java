package BankingSystem;

public class BankingSystemDriver {
    public static void main(String[] args) {
//        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount(1000);
        CurrentAccount ca = new CurrentAccount(-500);

        System.out.println("List of accounts: "+Bank.printToString());
        // test cases for Current Account
        ca.deposit(100);
        System.out.println("Current account balance: "+ca.getBalance());
        ca.withdraw(100);
        System.out.println("Current account balance after withdrawal: "+ca.getBalance());
        System.out.println("Total Balance in Bank: " + Bank.calculateTotalBalance());
        Bank.deleteAccount(ca);
        System.out.println("After deleting account, total balance in bank: "+Bank.calculateTotalBalance());
    }
}