import java.util.Scanner;
public class Overs
{
    public static void main(String[] args) 
    {
        try {
        	int numberOfOvers, overNumber, i;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of overs:");
            numberOfOvers = scan.nextInt();
            int cricket[] = new int[numberOfOvers];
            System.out.println("Enter the number of runs for each over:");
            for(i = 0; i < numberOfOvers; i++)
            {
                cricket[i] = scan.nextInt();
            }
        	 System.out.print("Enter the over number:");
             overNumber = scan.nextInt();
             System.out.println(cricket[overNumber-1]);

        }catch(ArrayIndexOutOfBoundsException | NegativeArraySizeException exception) {
        	System.out.println(exception);   	
        }
}
}