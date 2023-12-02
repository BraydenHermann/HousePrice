/*
 * Student Name: Brayden Hermann
 * Lab Professor: Fedor Ilitchev
 * Due Date: 4/4/2023
 * Description: Lab Exam 03 Section 302
 */

/*
 * this class represents a House 
 */
public class House {
	private double totalSquareFeet; // square feet of house
	private double pricePerSquareFeet; // price per square feet
	
	/*
	 * no argument constructor, sets fields to zero
	 */
	public House() {
		totalSquareFeet = 0.0;
		pricePerSquareFeet = 0.0;
	}

	/*
	 * accessor for totalSquareFeet 
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	/*
	 * mutator for totalSquareFeet 
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	/*
	 * accessor for pricePerSquareFeet
	 */
	public double getPricePerSquareFeet() {
		return pricePerSquareFeet;
	}

	/*
	 * mutator for pricePerSquareFeet
	 */
	public void setPricePerSquareFeet(double pricePerSquareFeet) {
		this.pricePerSquareFeet = pricePerSquareFeet;
	}

	/*
	 * This worker method calculates the total
	 * amount of the house's asking price
	 * using the totalSquareFeet and pricePerSquareFeet fields
	 * plus the real estate commission of 1.25
	 */
	public double calculateAskingPrice() {
		double askingPrice = this.totalSquareFeet * this.pricePerSquareFeet * 1.25;
		return askingPrice;
	}
	
    public String checkAskingPrice(){
        String report = "";

        // a value less than zero reports "You entered an Invalid Measurement or Price"
        if (this.calculateAskingPrice() < 0) {
        	report = "You entered an Invalid Measurement or Price";
        }
        
        // a value zero (inclusive) to to 555000.0 (inclusive) reports "Asking Price is below market range"
        else if (this.calculateAskingPrice() <= 555000.0) {
        	report = "Asking Price is below market range";
        }
        
        // a value 555000.00 (exclusive) 755000.00 (inclusive) reports "Asking Price within market range"
        else if (this.calculateAskingPrice() > 555000.0 && this.calculateAskingPrice() <= 755000.00) {
        	report = "Asking Price within market range";
        }
        
        // a value more than 755000.00 reports "Asking Price too high for this market" 
        else if (this.calculateAskingPrice() > 755000.00) {
        	report = "Asking Price too high for this market";
        }
        return report; // return the actual report
	}
}
