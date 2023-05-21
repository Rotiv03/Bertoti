package Singleton;

public class Main {
	
	public static void main(String[] args) {
		Singleton fazenda = Singleton.getInstance("galinha");
		Singleton fazenda2 = Singleton.getInstance("vaca");
		
		System.out.println(fazenda.animais);
		System.out.println(fazenda2.animais);
		
		fazenda.addAnimal("vaca");
		
		System.out.println(fazenda.animais);
	}
	
}
