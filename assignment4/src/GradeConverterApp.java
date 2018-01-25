import java.util.Scanner;
import java.text.NumberFormat;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Letter Grade Converter!");
		System.out.println();
					
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			Grade grade1 = new Grade();
			System.out.println("Please enter numeric grade: ");
			int gradenumber;
			
			try {
				gradenumber = Integer.parseInt(sc.nextLine());	
			} catch (NumberFormatException e) {
				System.out.println("Error! You did not enter a number. Try again.");
				continue;
			}
			
			grade1.setGrade(gradenumber);
			String finalGrade = Converter.Convert(gradenumber);
		
			System.out.println("Your grade is " + finalGrade + ".");
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			
		}
		
		System.out.println();
		
		sc.close();
		System.out.println("Bye!");
	}
}
