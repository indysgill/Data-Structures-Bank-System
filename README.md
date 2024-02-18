# Data-Structures-Bank-System
Group assignment for CSC 220
Write a Java program to create a banking system with three classes and one interface - Bank, Account, SavingsAccount, and CurrentAccount. 

Bank Class 
The bank should have a list of accounts. 
The bank should have methods to, add accounts, delete accounts & calculate the total balance of all accounts
 
Account Interface
Account should be an interface with methods to deposit, withdraw, calculate interest, and view balances. 

CurrentAccount Class and SavingsAccount Class
SavingsAccount and CurrentAccount should implement the Account interface and have their unique methods. 

If the balance in the CurrentAccount is less than 0, then an interest of 30% per year is charged. If the balance in the CurrentAccount is more than 0, then no interest is paid to the customer. Balance should update daily. 

For a SavingsAccount the balance cannot be less than zero. If the balance is more than zero then an interest of 5% per year is paid to the customer. Balance should update daily.

java.time package can be used to handle dates and time. 

Clearly state any other assumptions you made. Make sure to test your code if all constraints are met.
