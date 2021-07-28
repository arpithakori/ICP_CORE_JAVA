import java.util.*;
public class BufferedReader {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalRuns, totalOvers;
		float runRate;
		try {
		System.out.println("Enter the total runs scored: ");
		totalRuns = scan.nextInt();
		System.out.println("Enter the total overs faced: ");
		totalOvers = scan.nextInt();
		runRate = totalRuns/totalOvers;
		System.out.println("Current Run Rate :"+runRate);
		}catch(ArithmeticException | NumberFormatException | InputMismatchException e ){
			System.out.println(e);
		}
	}

}