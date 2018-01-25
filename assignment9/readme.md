Calculate a monthly balance

Console
Welcome to the Account Calculator

Starting Balance
Checking: $1,000.00

Enter the transactions for the month

Withdrawal or deposit? (w/d): w
Amount: 500

Continue? (y/n): y

Withdrawal or deposit? (w/d): d
Amount: 200

Continue? (y/n): n

Monthly Fees
Checking fee:              $1.00

Final Balance
Checking: $699.00


Operation
The application begins by displaying the starting balance for a checking account.
The application prompts the user to enter the amount for a withdrawal or deposit.
When the user finishes entering deposits and withdrawals, the application displays 
the fees for the month followed by the final balances for the month.

Specifications
Create interfaces named Depositable, Withdrawable, and Balanceable that 
specify the methods that can be used to work with accounts. The Depositable 
interface should include this method:

void deposit(double amount)

The Withdrawable interface should include this method:

void withdraw(double amount)

And the Balanceable interface should include these methods:

double getBalance()
void setBalance(double amount)

Create a class named Account that implements all three of these interfaces. 
In addition, it should supply a method like the following method that returns a 
balance that has been formatted as currency:

String getBalanceFormatted()

Create a class named CheckingAccount that inherits the Account class. 
This class should include an instance variable for the monthly fee and these methods:

void subtractMonthlyFee()
void setMonthlyFee(double monthlyFee)
double getMonthlyFee()
String getMonthlyFeeFormatted()

By default, the monthly fee for a checking account should be $1.
Create a class named Transactions that contains the following static methods 
for depositing and withdrawing funds from either type of account:

public static void deposit(Depositable account, double amount) {
    account.deposit(amount);
}

public static void withdraw(Withdrawable account, double amount) {
    account.withdraw(amount);
}

Create a class named AccountApp that prompts the user for a transaction, 
posts the transaction, and displays the information shown in the console output. 
Create the necessary objects for each transaction, and post the transaction 
using the appropriate method of the Transactions class.

Use the Console class presented in chapter 8 or a variation of it to get entries from the user.

This application should not allow the user to withdraw more than the current account balance.

This application should not allow the user to deposit more than $10,000 per transaction.
