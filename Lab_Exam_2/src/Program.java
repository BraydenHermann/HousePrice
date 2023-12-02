import java.util.Scanner;

/*
 * Student Name: Brayden Hermann
 * Lab Professor: Teddy Yap
 * Due Date: 4/4/2023
 * Modified: 4/4/2023
 * Description: Lab Exam 2 - Main Program
 */
public class Program {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // initialize scanner for user input
		House house = new House(); // create a new House object
		String answer = "Yes";
		
		while(answer.toUpperCase().contains("Y")) {
			System.out.print("Please enter the house's total square feet: "); // prompt the user to enter the total square feet
			house.setTotalSquareFeet(input.nextDouble()); // set the house's total square feet to the user's input
			
			System.out.print("Please enter the house's price per square feet: "); // prompt the user to enter the price per square feet
			house.setPricePerSquareFeet(input.nextDouble()); // set the house's price per square feet to the user's input
			
			// output the house's total square feet, price per square feet and asking price (to 2 decimal places)
			//System.out.printf("Total Square Feet: %.2f,Price Per Square Feet: $%.2f, Asking Price: $%.2f", house.getTotalSquareFeet(), house.getPricePerSquareFeet(), house.calculateAskingPrice());
			//System.out.println(house.calculateAskingPrice());
			
			// output if the asking price is within market range
			System.out.println(house.checkAskingPrice());
			
			// check if the user wants to enter more values
			System.out.print("\nWould you like to enter more values? (Y/N) ");
			answer = input.next();
		}
		
		System.out.println("\nProgram by Brayden Hermann");
	}
}
