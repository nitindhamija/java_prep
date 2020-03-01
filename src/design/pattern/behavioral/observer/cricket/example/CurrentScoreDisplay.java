package design.pattern.behavioral.observer.cricket.example;

public class CurrentScoreDisplay implements Observer {
	
	@Override
	public void update(int run, int wickets, float overs) {
	display(run,wickets,overs);

	}
	 public void display(int run, int wickets, float overs)
	    { 
	        System.out.println("\nCurrent Score Display:\n"
	                           + "Runs: " + run + 
	                           "\nWickets:" + wickets + 
	                           "\nOvers: " + overs ); 
	    } 
}
