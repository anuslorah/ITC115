import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckingAccount ca = new CheckingAccount();
		String choice ="y";
		
		System.out.println("Welcome to the Account calculator!");
		System.out.println();
 	
		System.out.println("Starting Balance");
     	System.out.println("Checking: " + ca.getBalanceFormatted());
     	System.out.println("Would you like to begin? (y/n) ");
     	choice = sc.nextLine();
     	System.out.println();
		
     	while (choice.equalsIgnoreCase("y")) {
     	
	     	System.out.print("Withdrawal or deposit? (w/d): ");
		    String transaction = sc.nextLine();	
		    
		    
	     	if (transaction.equalsIgnoreCase("w")){
	     		System.out.println("Enter your withdrawal");
	     		System.out.print("Amount: $");
	     		double amount = Double.parseDouble(sc.nextLine());
	     		if (amount < ca.getBalance()){
	     			ca.withdraw(amount);
	     		}
	     		else {
	     			System.out.println("You do not have sufficient funds for this transaction.");
	     		}
	     	}
	     	else if (transaction.equalsIgnoreCase("d")){
	     		System.out.println("Enter your deposit");
	     		System.out.print("Amount: $");
	     		double amount = Double.parseDouble(sc.nextLine());
	     		if (amount <= 10000){
	     			ca.deposit(amount);
	     		}
	     		else {
	     			System.out.println("You can deposit up to $10 000 per transaction.");
	     		}

	     	}
	     	else{
	     		System.out.println("You did not enter a valid choice.");
	     	}
			System.out.println();
	     	System.out.print("Continue? (y/n): ");
	     	choice = sc.nextLine();
	     	System.out.println();
     }//while
    	System.out.println(ca.getMonthlyFeeFormatted());
    	System.out.println();
    	System.out.println("Final Balance");
    	System.out.println(ca.getBalanceFormatted());
    	
     	System.out.println();
    	System.out.println("Thank you for using our services!");
        sc.close();
		
	}
}
