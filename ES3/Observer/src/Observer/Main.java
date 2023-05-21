package Observer;

public class Main {

	public static void main(String[] args) {
		Subscribers vaca = new Subscribers();
		vaca.setNome("Mimosa");
		
		Subscribers galinha = new Subscribers();
		galinha.setNome("Augusto");
		
		Publisher publisher = new Publisher();
		
		publisher.subscribe(vaca);
		publisher.subscribe(galinha);
		
		publisher.setMainState("Descansando");
		
		publisher.unsubscribe(vaca);
		
		publisher.setMainState("Comendo");
		
		
	}
	
}
