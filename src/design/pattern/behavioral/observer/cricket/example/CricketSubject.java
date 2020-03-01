package design.pattern.behavioral.observer.cricket.example;

public interface CricketSubject {
	 
    public void registerObserver(Observer o); 
    public void unregisterObserver(Observer o); 
    public void notifyObservers(); 
}
