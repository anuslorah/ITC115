public class ChangeConvert {

	static String Convert(int change) {
		
		int Quarters = 0;
		int Dimes = 0;
		int Nickels = 0;
		int Pennies = 0;
		String totalChange;
		
		Quarters = change / 25;
		change = change % 25;
		Dimes = change / 10;
		change = change % 10;
		Nickels = change / 5;
		change = change % 5;
		Pennies = change;
		
		totalChange = "Quarters: " + Quarters + "\n" + 
				"Dimes: " + Dimes + "\n" +
				"Nickels: " + Nickels + "\n" +
				"Pennies: " + Pennies + "\n";
		
		return totalChange;
	}
}
