public class ChangeCalculator {

	static String Convert(int change) {
		
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int total = 0;
		String totalChange;
		
		twenties = change / 20;
		change = change % 20;
		tens = change / 10;
		change = change % 10;
		fives = change / 5;
		change = change % 5;
		ones = change;
		total = twenties*20 + tens*10 + fives*5 + ones;
		
		totalChange = "Your change is: " + "$" + total + "\n"
				+ "Twenties: " + twenties + "\n"
				+ "Tens: " + tens + "\n" 
				+ "Fives: " + fives + "\n" 
				+ "Ones: " + ones + "\n";
		
		return totalChange;
	}
}
