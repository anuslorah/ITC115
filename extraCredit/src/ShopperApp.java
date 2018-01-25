import java.util.Scanner;

public class ShopperApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the bakery!");
		System.out.println();

		BakedGoods yum = new BakedGoods();     	
		System.out.print("Our specials today are:" + "\n"
     			+ "Cake: " + "$" + yum.getCakePrice() + " per piece" + "\n"
     			+ "Cookies: " + "$" + yum.getCookiePrice() + " each" + "\n"
     			+ "Pie: " + "$" + yum.getPiePrice() + " per slice" + "\n");
     	System.out.println();
		
     	System.out.print("Would you like to shop? y/n: ");
		String choice = sc.nextLine();	
     	
     while (choice.equalsIgnoreCase("y")) {
     	
     	System.out.print("How many pieces of cake would you like? ");
     	int cakeQuantity = Integer.parseInt(sc.nextLine());
     	yum.setCakeQuantity(cakeQuantity);
     	System.out.println();
     	
     	System.out.print("How many cookies would you like? ");
     	int cookieQuantity = Integer.parseInt(sc.nextLine());
     	yum.setCookieQuantity(cookieQuantity);
       	System.out.println();
  
       	System.out.print("How many slices of pie would you like? ");
     	int pieQuantity = Integer.parseInt(sc.nextLine());
     	yum.setPieQuantity(pieQuantity); 	
       	System.out.println();
       	
        System.out.println(yum.Order());
        System.out.print("Please enter a whole dollar amount greater than the order total ");
        Change newchange = new Change();
        int moneyIn = Integer.parseInt(sc.nextLine());
       	System.out.println();
        int change = moneyIn - yum.Total();
        
        if (moneyIn > yum.Total()){
			newchange.setChange(change);
			String finalChange = ChangeCalculator.Convert(change);
			System.out.println(finalChange);
			System.out.println("Thank you for shopping!");
        }
        else {
			System.out.println("You did not enter a valid dollar amount. Please start again.");
		}        
        System.out.print("Continue? (y/n): ");
        choice = sc.nextLine();	
     }//while
    	 System.out.println();
    	 System.out.println("Thank you for stopping by!");
         sc.close();
	}//main
}//class