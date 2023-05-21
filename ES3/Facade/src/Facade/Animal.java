package Facade;

public class Animal {
	String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void Comer() {
	System.out.println(nome.toString() + " foi comer");
	}
	
	public void Dormir() {
		System.out.println(nome.toString() + " foi dormir");
	}
}
