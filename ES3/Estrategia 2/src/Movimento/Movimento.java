package Movimento;

import Pokemon.Pokemon;
import TipoBehavior.TipoBehavior;

public class Movimento {
    private String nome;
    private TipoBehavior tipo;
    private int dano;

    public Movimento(String nome, TipoBehavior tipo, int dano) {
        this.nome = nome;
        this.tipo = tipo;
        this.dano = dano;
    }

    public void setTipo (TipoBehavior tipo) {this.tipo = tipo;}
    public void setNome (String nome) {this.nome = nome;}
    public void setDano (int dano) {this.dano = dano;}

    public String getNome () {return this.nome;}
    public TipoBehavior getTipo () {return this.tipo;}
    public int getDano () {return this.dano;}

    public void aplicarDano(Pokemon pokemon) {
        int vantagem = this.tipo.possuiVantagem(pokemon.getTipo());
        int dano = this.dano;
        if (vantagem == 1) {
            System.out.println("Foi muito efetivo!");
            dano = dano * 2;
        } else if (vantagem == -1) {
            System.out.println("Foi pouco efetivo... ");
            dano = dano / 2;
        }
        System.out.println(pokemon.getNome() + " sofreu " + (this.dano) + " de dano.");
        pokemon.setVida(pokemon.getVida() - dano);
    }
}
