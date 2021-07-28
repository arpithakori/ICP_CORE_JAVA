import java.util.*;
public class CustomMain {

	public static void main(String[] args) throws Exception {
	
		String playerName;
		int playerAge;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the player name:");
		playerName = scan.next();
		System.out.println("Enter the player age :");
		playerAge = scan.nextInt();
		if(playerAge < 19) {
			throw new CustomException();
		}
		else {
			System.out.println("Player name : "+playerName);
			System.out.println("Player age : "+playerAge);
		}
	}
}
