/*
 * Student Name: Brayden Hermann
 * Lab Professor: Teddy Yap
 * Due Date: 2/14/2023
 * Modified: 2/14/2023
 * Description: Lab Exam 1 - House Class
 */
public class House {
	// initialize variables
	private double totalSquareFeet, pricePerSquareFeet;
	
	// getters and setters
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public double getPricePerSquareFeet() {
		return pricePerSquareFeet;
	}

	public void setPricePerSquareFeet(double pricePerSquareFeet) {
		this.pricePerSquareFeet = pricePerSquareFeet;
	}

	
	// constructors
	public House(double totalSquareFeet, double pricePerSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
		this.pricePerSquareFeet = pricePerSquareFeet;
	}
	
	public House() {
		this.totalSquareFeet = 0.0;
		this.pricePerSquareFeet = 0.0;
	}
	
	// calculate the asking price for the House
	public double calculateAskingPrice() {
		// the House's asking price is calculated by total square feet * price per square feet * 1.25
		return this.totalSquareFeet * this.pricePerSquareFeet * 1.25;
	}
}
