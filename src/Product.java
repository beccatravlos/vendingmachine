

/**
 * An object of this class represents a type of product
 * sold by a vending machine.
 */
public class Product {

	//****** OBJECT VARIABLES/FIELDS ******//
	
	private String name;
	private double price;
	private int quan;
	//****** CONSTRUCTOR METHOD ******//
	
	/**
	 * Constructor method - used to create a new Product object.
	 * It initializes the object's data.
	 * @param n name of product
	 * @param p unit price of product
	 */
	public Product(String n, double p) {
		name = n;
		price = p;
		quan = 0;
	}
	
	//****** GET/ACCESSOR METHODS ******//
	
	/**
	 * Returns the product name.
	 * @return product name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the product's unit price.
	 * @return unit price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Returns the number of units in stock.
	 * @return number of units in stock
	 */
	public int getQty() {
		return quan;
	}
	
	//****** SET/MUTATOR METHODS ******//
	
	/**
	 * Sets the product's price to the given value.
	 * @param p product's new unit price
	 */
	public void setPrice(double p) {
		price=p;
	}
	
	/**
	 * Determines whether an item can be dispensed by the vending machine.
	 * Reduces the quantity by one, assuming an item is dispensed. 
	 * The quantity can never be negative.
	 * Returns true if the vending machine can dispense an item.
	 * @return true if item can be dispensed
	 */
	public boolean dispenseItem() {
		if(quan>0) {
			quan-=1;
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Adds units to the vending machine.
	 * Increases the quantity by the given amount.
	 * @param numItems number of units to stock
	 */
	public void stockMachine(int numItems) {
		quan+=numItems;
	}
	
	//****** SPECIAL METHOD ******//
	
	/**
	 * Returns this objects data formatted as a string.
	 */
	public String toString() {
		return name + " Quantity: "+quan + "\t$" + String.format("%.2f", price);
	}
	
}
