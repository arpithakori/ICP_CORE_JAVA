import java.util.*;

public class T20Match extends Match {
	
		public double calculateRunRate() {
			return (runs_remaining()/((20.0-getCurrentover())));
		}
		
		public int runs_remaining()
		{
			int current_score=getCurrentscore();
			int target_required=getTarget();
			int runs=target_required-current_score;
			return runs;
		}
		
		public  int calculateBalls() {
			int ball=6*(int)getCurrentover();
			float a = getCurrentover()*10;
			int b =(int)a%10;
			return 120-(ball+b);
			
		}
		
		public void display(double reqRunrate, int balls) {
			System.out.println("Requirements:");
		   System.out.println("Needed "+runs_remaining()+" runs in "+calculateBalls()+" balls");
		   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
		}



}
