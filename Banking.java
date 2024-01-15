import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author melfe
 * Name: Melchizedek Meneses
 * Date: 04/02/22
 * Student #: 219555408
 * Description: Java program that collects user data related to banking.
 *
 */
public class Banking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables, as well as functions and array
		Scanner scan = new Scanner(System.in);
		String Name;
		double Balance, average, total = 0;
		int r = 0;
		ArrayList<Customer> arrList = new ArrayList<Customer>();

		// Declare and set the arrays
		Customer[] arr;
		arr = new Customer[6];
		arr[0] = new Customer("empty", 0);
		arr[1] = new Customer("empty", 0);
		arr[2] = new Customer("empty", 0);
		arr[3] = new Customer("empty", 0);
		arr[4] = new Customer("empty", 0);
		arr[5] = new Customer("empty", 0);

		// Ask customers to input their information
		System.out.println("For 6 customers, enter the name and in the next line and balance.");
		while (r < 6) {
			Name = scan.next();
			Balance = scan.nextDouble();
			arr[r] = new Customer(Name, Balance);
			r++;
		}

		// Searches users within array input with less than $150
		r = 0;
		System.out.println("Search for all customers who have less then $150");
		while (r < 6) {
			if (arr[r].getBalance() < 150) {
				System.out.println(arr[r].getName());
			}
			r++;
		}

		// Calculate the average balance within array data and display results
		r = 0;
		while (r < 6) {
			total += arr[r].getBalance();
			r++;
		}
		average = total / 6;
		System.out.println("\nThe Average Balance is: " + average);

		//Find the highest and lowest balance in array data
		r = 0;
		String N1 = arr[0].getName(), N2 = arr[0].getName();
		double B1 = arr[0].getBalance(), B2 = arr[0].getBalance();
		while (r < 6) {
			if (arr[r].getBalance() > B1) {
				N1 = arr[r].getName();
				B1 = arr[r].getBalance();
			}
			r++;
		}
		r = 0;
		
		// Find the lowest balance within the array
		while (r < 6) {
			if (arr[r].getBalance() < B2) {
				N2 = arr[r].getName();
				B2 = arr[r].getBalance();
			}
			r++;
		}

		//Display the results
		System.out.println("\nThe customer with the highest balance is: " + N1);
		System.out.println("\nThe customer with the lowest balance is: " + N2);

		// Calculate the percent increase for all users in array then display results
		r = 0;
		System.out.println("\nShow all acounts after a 15% balance increase");
		while (r < 6) {
			arr[r].addPercentage();
			System.out.println(arr[r].toString());
			r++;
		}
	}
}