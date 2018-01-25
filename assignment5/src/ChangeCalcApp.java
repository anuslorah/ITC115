import java.util.Scanner;
import java.text.NumberFormat;

public class ChangeCalcApp {
	
	

		public static void main(String[] args) {
			System.out.println("Welcome to Change Calculator!");
			System.out.println();
						
			Scanner sc = new Scanner(System.in);
			String choice = "y";
			
			while (choice.equalsIgnoreCase("y")){
				Change newchange = new Change();
				System.out.print("Please enter the amount of cents 0-99: ");
				int cents;
				
				try {
					cents = Integer.parseInt(sc.nextLine());	
				} catch (NumberFormatException e) {
					System.out.println("Error! You did not enter a number. Try again.");
					continue;
				}
				if (cents >= 0 & cents < 100){
					newchange.setChange(cents);
					String finalChange = ChangeConvert.Convert(cents);
				
					System.out.println("Your change is: " + "\n" + finalChange);
					
				}
				else {
					System.out.println("You did not enter a valid amount of change.");
				}
				
				System.out.print("Continue? (y/n): ");
				choice = sc.nextLine();
				
			}
			
			System.out.println();
			
			sc.close();
			System.out.println("Bye!");
		}
	}
