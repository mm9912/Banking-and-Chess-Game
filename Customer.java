/**
 * 
 */

/**
 * @author melfe
 * Name: Melchizedek Meneses
 * Date: 04/02/23
 * Student #: 219555408
 * Description: Constructor for banking class
 *
 */
public class Customer {
	// Declare variables
	private String Name;
	private double Balance;

	// Set up the parameters
	Customer(String Name, double Balance){
		this.Name=Name;
		this.Balance=Balance;
	}

	// Returns name and balance
	public String toString() {
		String clients = new String(Name + " has \t $"+ Balance);
		return clients;
	}

	// Calculate balance with percentage value
	public void addPercentage () {
		Balance = Balance+(0.15*Balance);
	}

	// Declare getters and setters
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return Balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		Balance = balance;
	}
}