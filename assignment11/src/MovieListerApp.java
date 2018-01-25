import java.util.ArrayList;
import java.util.Scanner;

public class MovieListerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Movie Lister!");
		System.out.println();
		System.out.println("There are 100 movies in the list.");
		System.out.println("Movie categories are: animated, comedy, drama, horror, musical, scifi");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("What category are you interested in? ");
			String moviechoice = sc.nextLine();
	        System.out.println();
			
			ArrayList<Movie> movies = MovieDB.getMovies(moviechoice);
			for (Movie m : movies) {
		        System.out.println(m.getTitle());
		    }
	        System.out.println();
			System.out.print("Continue? (y/n): ");
	        choice = sc.nextLine();	
		}
        System.out.println();
   	 	System.out.println("Bye!");
      	sc.close();
	}
}