import java.util.*;

public class TestMatch extends Match {

	
	public double calculateRunRate() {
		return (runs_remaining()/((90.0-getCurrentover())));
	}
	
	public int runs_remaining()
	{
		int current_score=getCurrentscore();
		int target_required=getTarget();
		int runs_needed=target_required-current_score;
		return runs_needed;
	}
	
	public  int calculateBalls() {
		int ball=6*(int)getCurrentover();
		float a = getCurrentover()*10;
		int b =(int)a%10;
		return 540-(ball+b);
		
	}
	
	public void display(double reqRunrate, int balls) {
	   System.out.println("Requirements:");
	   System.out.println("Needed "+runs_remaining()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}

}
