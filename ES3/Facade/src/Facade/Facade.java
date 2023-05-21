package Facade;

import java.util.LinkedList;

public class Facade {
	public void amanhecer(LinkedList<Animal> animais, Porteira porteira) {
		porteira.abrirPorteira();
		animais.forEach(animal -> animal.Comer());
	}
	
	public void anoitecer(LinkedList<Animal> animais, Porteira porteira) {
		porteira.fecharPorteira();
		animais.forEach(animal -> animal.Dormir());
	}
}
