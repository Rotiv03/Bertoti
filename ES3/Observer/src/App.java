public class App {
  public static void main(String[] args) throws Exception {
    Publisher publisher = new Publisher();

    User joao = new User("João");
    User maria = new User("Maria");

    publisher.subscribe(joao);
    publisher.subscribe(maria);

    publisher.publish("Novo artigo publicado!");

    publisher.unsubscribe(joao);

    publisher.publish("Promoção especial!");
  }
}
