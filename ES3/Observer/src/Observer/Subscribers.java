package Observer;

public class Subscribers implements Observer{
	
	String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void update(String context) {
		System.out.println(nome + " está " + context);
	}

	
}
