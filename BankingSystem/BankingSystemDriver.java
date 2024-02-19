package BankingSystem;

public class BankingSystemDriver {
    public static void main(String[] args) {
//        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount(1000);
        CurrentAccount ca = new CurrentAccount(-500);

        //System.out.println("List of accounts: "+ Bank.printToString());
        // test cases for Current Account
        ca.deposit(100);
        System.out.printf("%s%.2f%s", "Current account balance: ", ca.getBalance(), "\n");
        ca.withdraw(100);
        System.out.printf("%s%.2f%s", "Savings account balance: ", sa.getBalance(),"\n");
        System.out.printf("%s%.2f%s","Current account balance after withdrawal: ",
                ca.getBalance(),"\n");
        //System.out.println("Total Balance in Bank: " + Bank.calculateTotalBalance());
        //Bank.deleteAccount(ca);
        //System.out.println("After deleting account, total balance in bank: "+Bank.calculateTotalBalance());
    }
}