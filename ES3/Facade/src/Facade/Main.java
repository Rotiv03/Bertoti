package Facade;

import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList<Animal> animais = new LinkedList<>();
		Porteira porteira = new Porteira();
		
		Animal galinha = new Animal();
		
		galinha.setNome("porronco");
		
		animais.add(galinha);
		
		Facade facade = new Facade();
		
		facade.amanhecer(animais, porteira);
		
		facade.anoitecer(animais, porteira);
	}
}
