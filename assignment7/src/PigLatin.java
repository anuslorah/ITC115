//Anu Slorah
import java.util.Scanner;

public class PigLatin {
		public static void main(String[] args) {
		
		System.out.println("Welcome to Pig Latin translator!");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
			
		while (choice.equalsIgnoreCase("y")){

			//user input
			System.out.println("Please enter a phrase to be translated: ");
			
			//converting input to lower case
			String input = sc.nextLine().toLowerCase();
			
			//check if user entered anything
			if (!input.trim().isEmpty()){
	
				//split string into array
				String[] outputSplit = input.split(" ");
			
				for (int j = 0; j <= outputSplit.length; j++) {
					
				//print out the translation
					for (String word: outputSplit){
						System.out.print(pigWord(word) + " ");
						}
					
					break;
					}
				
				System.out.println();
				System.out.println("Continue? y/n: ");
				choice = sc.nextLine();
				}
			//if string was empty, prompt the user to reenter a phrase
			else {
				System.out.println("The string was empty. Please try again.");
				input = sc.nextLine();
			}
		}//end of if string empty
			
		System.out.println("Bye!");
		sc.close();

}//end of main
//word translator		
public static String pigWord(String word) {

    char startLetter = word.charAt(0);
    if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
       || word.charAt(0) == 'u') {
        word = word.concat("way");
    } 
    else {
        String startconso = "";
        
        if (word.charAt(1) == 'a' || word.charAt(1) == 'e' || word.charAt(1) == 'i' || word.charAt(1) == 'o'
        	       || word.charAt(1) == 'u' || word.charAt(1) == 'y') {
            startconso = word.substring(0, 1);
            word = word.concat(startconso).concat("ay");
            word = word.substring(1);
            } 
     else if (word.charAt(2) == 'a' || word.charAt(2) == 'e' || word.charAt(2) == 'i' || word.charAt(2) == 'o'
       	       || word.charAt(2) == 'u' || word.charAt(2) == 'y') {
            startconso = word.substring(0, 2);
            word = word.concat(startconso).concat("ay");
            word = word.substring(2);
             } 
     else
     {
    	 startconso = word.substring(0, 3);
         word = word.concat(startconso).concat("ay");
         word = word.substring(3);
     }
     }
        
	return word;
	}//end of pigWord
}//end of class
		 	
