package Singleton;

import java.util.LinkedList;

public final class Singleton {
	
	private static Singleton fazenda;
	
	public LinkedList<String> animais = new LinkedList<>();
	
	private Singleton(String value) {
		animais.add(value);
	}
	public static Singleton getInstance(String animal) {
		if (fazenda == null) {
			fazenda = new Singleton(animal);
		}
		return fazenda;
	}
	public void addAnimal(String animal) {
		animais.add(animal);
	}
}
