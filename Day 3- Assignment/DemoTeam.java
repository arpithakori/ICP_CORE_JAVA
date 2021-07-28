import java.util.*;
public class DemoTeam {
	public static boolean containsWords(String inputString, String[] items) {
	    boolean found = true;
	    for (String item : items) {
	        if (inputString.contains(item)) {
	            return found;
	        }
	    }
	    found = false;
	    return found;
	}
	public static void main(String args[]) throws Exception
	{  
			  String[] teams = {"Chennai Super Kings","Sun Risers Hyderabad", "Delhi Capitals", "Kings XI Punjab", "Mumbai Indians", "Rajasthan Royals", "Royal Challengers Bangalore"};
		  	  Scanner sc=new Scanner(System.in);
		      System.out.println("Enter the expected winner team of IPL Season 13 ");
		      String teamWinner=sc.nextLine();
		      if(containsWords(teamWinner,teams)) {
		    	  System.out.println("Enter the expected runner Team of IPL Season 13 ");
			      String teamRunner=sc.nextLine();
			      if(containsWords(teamRunner,teams)) {
			    	  System.out.println("Expected IPL Season 13 winner: "+teamWinner);
			    	  System.out.println("Expected IPL Season 13 runner: "+teamRunner);
			    } else {
			    	  throw new TeamNameNotFoundException();
			      }
			      
		      }
		      else {
		    	  throw new TeamNameNotFoundException();
		      }
	}	     
	
	

}
