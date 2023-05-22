import java.util.ArrayList;
import java.util.List;

class Publisher {
  private List<Observer> subscribers = new ArrayList<>();

  public void subscribe(Observer observer) {
    subscribers.add(observer);
  }

  public void unsubscribe(Observer observer) {
    subscribers.remove(observer);
  }

  public void publish(String message) {
    System.out.println("Publicando mensagem: " + message);
    notifySubscribers(message);
  }

  private void notifySubscribers(String message) {
    for (Observer subscriber : subscribers) {
      subscriber.update(message);
    }
  }
}