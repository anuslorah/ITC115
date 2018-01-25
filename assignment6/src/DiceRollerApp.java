//Anu Slorah
import java.util.Scanner;

public class DiceRollerApp {
	public static void main(String[] args) {
		
		int counter = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to dice roller!");
		System.out.println();
		String choice = "y";

		System.out.println("Roll the dice? (y/n): ");
		choice = sc.nextLine();

		
		while (choice.equalsIgnoreCase("y")){

			PairOfDice dp = new PairOfDice();
			dp.roll();
		
			System.out.println("Roll "+ counter + ": ");
			System.out.println(dp.getValue1());
			System.out.println(dp.getValue2());
			int sum = dp.getSum(dp.getValue1(), dp.getValue2());
			if (sum == 7){
				System.out.println("Craps!");
			}
			else if (sum == 2){
				System.out.println("Snake eyes!");
			}
			else if (sum == 12){
				System.out.println("Box cars!");
			}

			System.out.println();
			System.out.println("Roll the dice? (y/n): ");
			counter++;
			choice = sc.nextLine();
			continue;

		}
		System.out.println("Bye!");
		sc.close();
	}
}	