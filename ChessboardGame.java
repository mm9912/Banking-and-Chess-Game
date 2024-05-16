
/**
 * 
 */
import java.util.Scanner;

/**
 * @author melfe
 * Name: Melchizedek Meneses
 * Date: 04/02/23
 * Student #: 219555408
 * Description: Java program that runs a queen chessboard style game.
 *
 */
public class ChessboardGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare scanner
		Scanner scan = new Scanner(System.in);

		// Declare 2-d array
		// [] (first) = rows & [] (second) = columns
		String[][] Queen = { { "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" }, };

		// Declare integers for user input
		int a = 0;
		int b = 0;

		// Use user input to add queen to a column
		while (a < 10) {
			System.out.println("Please enter columns to put queen");
			b = scan.nextInt();
			Queen[a][b] = "Q";
			a++;
		}

		// Reset row counter, then print new results
		a = 0;
		while (a < 10) {
			System.out.println(Queen[a][0] + " " + Queen[a][1] + " " + Queen[a][2] + " " + Queen[a][3] + " "
					+ Queen[a][4] + " " + Queen[a][5] + " " + Queen[a][6] + " " + Queen[a][7] + " " + Queen[a][8] + " "
					+ Queen[a][9] + " ");
			a++;
		}
	}
}