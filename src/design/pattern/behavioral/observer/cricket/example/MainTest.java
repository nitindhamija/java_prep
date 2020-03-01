package design.pattern.behavioral.observer.cricket.example;

public class MainTest {
	public static void main(String args[]) 
    { 
        // create objects for testing 
        AverageScoreDisplay averageScoreDisplay = 
                          new AverageScoreDisplay(); 
        CurrentScoreDisplay currentScoreDisplay = 
                          new CurrentScoreDisplay(); 
  
        // pass the displays to Cricket data 
        CricketData cricketData = new CricketData(); 
  
        // register display elements 
        cricketData.registerObserver(averageScoreDisplay); //adding observer does not require change in subject code 
        cricketData.registerObserver(currentScoreDisplay); 
  
        // in real app you would have some logic to 
        // call this function when data changes 
        cricketData.dataChanged(); 
  
        //remove an observer 
        cricketData.unregisterObserver(averageScoreDisplay); //removing observer does not require change in subject code , loosely coupled
  
        // now only currentScoreDisplay gets the 
        // notification 
        cricketData.dataChanged(); 
    } 
}
