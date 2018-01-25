// Anu Slorah
import java.util.Scanner;

public class PersonApp {
	public static void main(String args[]) {
		
		System.out.println("Welcome to the Person Tester Application");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	      	
        	System.out.print("Create customer or employee? (c/e): ");
        	System.out.println();
        	String ce = sc.nextLine();
        		if (ce.equalsIgnoreCase("e")){
        			Employee e = new Employee();
        			System.out.print("Enter first name: ");
        			String firstname = sc.nextLine();
        			e.setFirstName(firstname);
        			
        			System.out.print("Enter last name: ");
        			String lastname = sc.nextLine();
        			e.setLastName(lastname);
        			
        			System.out.print("Enter email address: ");
        			String email = sc.nextLine();
        			e.setEmail(email);
        			
        			System.out.print("Enter social security number: ");
        			String ssn = sc.nextLine();
        			e.setSsn(ssn);
        			
        			System.out.print(e.getDisplayTextE());
        		}
        		else if (ce.equalsIgnoreCase("c")){
        			Customer c = new Customer();
        			System.out.print("Enter first name: ");
        			String firstname = sc.nextLine();
        			c.setFirstName(firstname);
        			
        			System.out.print("Enter last name: ");
        			String lastname = sc.nextLine();
        			c.setLastName(lastname);
        			
        			System.out.print("Enter email address: ");
        			String email = sc.nextLine();
        			c.setEmail(email);
        			
        			System.out.print("Enter customer number: ");
        			String customernumber = sc.nextLine();
        			c.setCustomerNumber(customernumber);
        			
        			System.out.print(c.getDisplayText());
        			
        		}
        		else {
        			System.out.println("You did not enter a valid choice!");
        		}
        System.out.println("");
        System.out.println("");
        System.out.print("Continue? (y/n): ");
        choice = sc.nextLine();	
        System.out.println();
        }
       sc.close();
		
	}

}
