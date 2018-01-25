import java.text.NumberFormat;

public class Account implements Depositable, Withdrawable, Balanceable {
	public double balance;
	public double amount;
	
	public Account() {
		this.balance = 1000;
        this.amount = 0;
        }

	String getBalanceFormatted(){
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String balanceFormatted = formatter.format(balance);
		return balanceFormatted;	
	}

	public double getBalance() {
		return balance;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}

	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
}
