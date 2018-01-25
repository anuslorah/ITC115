package assignment1;

import java.util.Scanner;

/*
Write a program to calculate the area and perimeter of a rectangle
1.	Add a statement that declares a double variable for width and initialize it to a value of 4.25.
2.	Add a statement that declares a double variable for length and initialize it to a value of 8.5.
3.	Calculate the perimeter of a rectangle that has the width and length set in the previous two steps. 
To do that, you can use this formula: perimeter = 2 * width + 2 * length
4.	Print the values for the width, length, and perimeter to the console like this:
Width:     4.25
Length:    8.5
Perimeter: 25.5
Print the values for the area as well. 
 */
public class Assignment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double width = 4.25;
		double length = 8.5;
		double perimeter = 2 * width + 2 * length;
		double area = width * length;
		
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
		System.out.println("");
		
		// for additional practice, same calculation with user's numbers
		
		System.out.print("Lets try this with some other numbers" + "\n" + "Please enter width: ");
		width = sc.nextDouble();
		System.out.print("Please enter length: ");
		length = sc.nextDouble();
		
		perimeter = 2 * width + 2 * length;
		area = width * length;
		
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
		
	}

}
