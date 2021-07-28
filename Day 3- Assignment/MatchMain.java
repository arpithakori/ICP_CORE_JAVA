import java.util.*;

public class MatchMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ODIMatch odimatch;
		T20Match ttmatch;
		TestMatch testmatch;
		int input;
		do {
		System.out.println("\nEnter the match format\n\n1. ODI\n2. T20\n3. Test");
		input=scan.nextInt();
		switch(input) {
		case 1:odimatch=new ODIMatch();
			   System.out.println("Enter the Current score");
			   odimatch.setCurrentscore(scan.nextInt());
			   System.out.println("Enter the Current Over");
			   odimatch.setCurrentover(scan.nextFloat());
			   System.out.println("Enter Target Score");
			   odimatch.setTarget(scan.nextInt());
			   double req=odimatch.calculateRunRate();
			   int balls=odimatch.calculateBalls();
			   odimatch.display(req, balls);
			   break;
		case 2:ttmatch=new T20Match();
			   System.out.println("Enter the Current score");
			   ttmatch.setCurrentscore(scan.nextInt());
			   System.out.println("Enter the Current Over");
			   ttmatch.setCurrentover(scan.nextFloat());
			   System.out.println("Enter Target Score");
			   ttmatch.setTarget(scan.nextInt());
			   double reqrun=ttmatch.calculateRunRate();
			   int balls_s=ttmatch.calculateBalls();
			   ttmatch.display(reqrun, balls_s);
			   break;
		case 3:testmatch=new TestMatch();
			   System.out.println("Enter the Current score");
			   testmatch.setCurrentscore(scan.nextInt());
			   System.out.println("Enter the Current Over");
			   testmatch.setCurrentover(scan.nextFloat());
			   System.out.println("Enter Target Score");
			   testmatch.setTarget(scan.nextInt());
			   double reqrunrate=testmatch.calculateRunRate();
			   int b=testmatch.calculateBalls();
			   testmatch.display(reqrunrate, b);
		       break;	   
		
		
		}
		}while(input==1||input==2||input==3);
	}

}