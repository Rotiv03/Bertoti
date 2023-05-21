package Observer;

import java.util.LinkedList;

public class Publisher {
	
	LinkedList<Observer> subscribers = new LinkedList<Observer>();
	
	String mainState = "Almoçando";
	
	public void setMainState(String state) {
		this.mainState = state;
		notifySubscriber();
	}
	
	public void subscribe(Observer observer) {
		subscribers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		subscribers.remove(observer);
	}
	
	public void notifySubscriber(){
		subscribers.forEach(observer-> observer.update(mainState));
	}
	
}
