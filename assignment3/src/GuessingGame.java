import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the Number Guessing Game!" + "\n");
		System.out.print("Please enter the upper limit of the number: ");
		
		Scanner sc = new Scanner(System.in);
		
		int randomUpper = Integer.parseInt(sc.next());
		Random randomNumber = new Random();
		int randomnumber = randomNumber.nextInt(randomUpper);
		
		//next line to see what the number is to check for logic errors
		//System.out.println("The random number is: " + randomnumber);
		
		System.out.println("Please enter your guess: ");
		int guess = Integer.parseInt(sc.next());
		
		while (randomnumber != guess){
			
			if (guess < randomnumber){
				System.out.println("Your guess is too low.");
				System.out.println("Please enter your guess: ");
				guess = Integer.parseInt(sc.next());
			}
			else if (guess > randomnumber){
				System.out.println("Your guess is too high.");
				System.out.println("Please enter your guess: ");
				guess = Integer.parseInt(sc.next());
			}
		}
	
		if (guess == randomnumber){
			System.out.println("Your guess is correct!" + "\n" + "Bye!");
		}
		
}
}
