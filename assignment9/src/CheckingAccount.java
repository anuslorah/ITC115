import java.text.NumberFormat;

public class CheckingAccount extends Account{
	private double monthlyFee = 1;
	
	
	public double getMonthlyFee(){
		return monthlyFee;	
	}
	
	public void setMonthlyFee(){
		this.monthlyFee = monthlyFee;
	}
	public double subtractMonthlyFee(){
		balance = balance-monthlyFee;
		return balance;
	}
	
	public String getMonthlyFeeFormatted(){
		subtractMonthlyFee();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return "Monthly Fees" + "\n" 
				+ "Checking fee: " + formatter.format(monthlyFee);
	}
	
}
