// Anu Slorah
import java.util.Scanner;

public class RoshamboApp {
	public static void main(String args[]) {
	
		String player1choice = "";
		String player2choice = "";

		System.out.println("Welcome to the game of Roshambo");
    	System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		Player1 player1 = new Player1();
		player1.setName(name);
    	System.out.println();
    
    while (choice.equalsIgnoreCase("y")) {
    	      	
    	System.out.print("Would you like to play Bart or Lisa? (b/l): ");
    	String computer = sc.nextLine();
    	Player player2;
    	if (computer.equalsIgnoreCase("b")){
    		player2 = new Bart();
    	}
  		else if (computer.equalsIgnoreCase("l")){
  			player2 = new Lisa();
  			}
		else {
   			System.out.println("You did not enter a valid choice!");
   			continue;
   		}
    	
    	System.out.println("");
   		System.out.print("Rock, paper, scissors? (r/p/s): ");
   		String rps = sc.nextLine();
   		System.out.println("");
   		if (rps.equalsIgnoreCase("r")){
   			player1.setRoshamboValue(0);
   			player1choice = "Rock";
   		}
   		else if (rps.equalsIgnoreCase("p")){
   			player1.setRoshamboValue(1);
   			player1choice = "Paper";

   		}
   		else if (rps.equalsIgnoreCase("s")){
   			player1.setRoshamboValue(2);
   			player1choice = "Scissors";

   		}
   		else {
   			System.out.println("You did not enter a valid choice, try again!");
   			continue;
   		}
   		
   		player2.RoshamboValue();
   		if (player2.RoshamboValue() == Roshambo.ROCK){
   			player2.setRoshamboValue(0);
   			player2choice = "Rock";
   		}
   		else if (player2.RoshamboValue() == Roshambo.PAPER){
   			player2.setRoshamboValue(1);
   			player2choice = "Paper";

   		}
   		else if (player2.RoshamboValue() == Roshambo.SCISSORS){
   			player2.setRoshamboValue(2);
   			player2choice = "Scissors";
   		}
   		
   		System.out.println(name + ": " + player1choice);
   		System.out.println(player2.getName() + ": " + player2choice);
   				
    	if (player1.getRoshamboValue() == player2.getRoshamboValue()){ //tie, same value
    		System.out.println("Draw!");
    	}
    	else if	(player1.getRoshamboValue() == 0 && player2.getRoshamboValue() == 2 ){ //rock vs scissors, rock wins
    		System.out.println(player1.getName() +  ": wins!");
    	}
    	else if	(player1.getRoshamboValue() == 0 && player2.getRoshamboValue() == 1 ){ //rock vs paper, paper wins
        	System.out.println(player2.getName() +  ": wins!");
    	}	
    	else if (player1.getRoshamboValue() == 1 && player2.getRoshamboValue() == 0 ){ //paper vs rock, paper wins
    		System.out.println(player1.getName() +  ": wins!");
    	}
    	else if (player1.getRoshamboValue() == 1 && player2.getRoshamboValue() == 2 ){ //paper vs scissors, scissors win
    		System.out.println(player2.getName() +  ": wins!");
    	}
    	else if (player1.getRoshamboValue() == 2 && player2.getRoshamboValue() == 0 ){ //scissors vs rock, rock wins
    		System.out.println(player2.getName() +  ": wins!");
    	}
    	else if (player1.getRoshamboValue() == 2 && player2.getRoshamboValue() == 1 ){ //scissors vs paper, scissors win
    		System.out.println(player1.getName() +  ": wins!");
    	}		
       	
    	System.out.println("");
    	System.out.print("Continue? (y/n): ");
    	choice = sc.nextLine();
    	System.out.println("");

    }//while loop
	System.out.println("Bye!");
    sc.close();
}//main
}//class