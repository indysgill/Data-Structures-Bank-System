package BankingSystem;
import java.util.ArrayList;
class Bank {
    static ArrayList<Account> listOfAccounts = new ArrayList<>();

    public static void addAccount(Account account) {
        listOfAccounts.add(account);
    }

    public static void deleteAccount(Account account) {
        listOfAccounts.remove(account);
    }

    public static double calculateTotalBalance() {
        double total = 0;
        for(Account account : listOfAccounts) {
            total += account.getBalance();
        }
        return total;
    }

    public static String printToString() { // Chris will fix
        return "Bank{}" + listOfAccounts.toString();
    }
}