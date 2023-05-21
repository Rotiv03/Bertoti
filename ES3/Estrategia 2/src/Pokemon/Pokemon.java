package Pokemon;
import java.util.ArrayList;

import Movimento.Movimento;
import TipoBehavior.TipoBehavior;
import VoarBehavior.VoarBehavior;

public class Pokemon {
    private String nome;
    private TipoBehavior tipo;
    private int vida;
    private boolean emBatalha;
    private VoarBehavior voarBehavior;
    private ArrayList<Movimento> movimentos;

    public Pokemon(String nome, TipoBehavior tipo, int vida, VoarBehavior voarBehavior) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.emBatalha = false;
        this.voarBehavior = voarBehavior;
    }

    public void setNome (String nome) {this.nome = nome;}
    public void setTipo (TipoBehavior tipo) {this.tipo = tipo;}
    public void setVida (int vida) {this.vida = vida;}
    public void setEmBatalha(boolean emBatalha) {this.emBatalha = emBatalha;}
    public void setVoarBehavior(VoarBehavior voarBehavior) {this.voarBehavior = voarBehavior;}
    public void setMovimentos(ArrayList<Movimento> movimentos) {this.movimentos = movimentos;}

    public void addMovimento(Movimento movimento) {this.movimentos.add(movimento);}

    public String getNome () {return this.nome;}
    public TipoBehavior getTipo () {return this.tipo;}
    public int getVida () {return this.vida;}
    public boolean getEmBatalha () {return this.emBatalha;}
    public VoarBehavior getVoarBehavior() {return this.voarBehavior;}
    public ArrayList<Movimento> getMovimentos() {return this.movimentos;}

    public void atacar (Pokemon pokemon, Integer ataqueIndex) {
        if(this.emBatalha) {
            System.out.println(this.nome + ": Eu ataco!");
            if (pokemon.emBatalha) {
              this.movimentos.get(ataqueIndex).aplicarDano(pokemon);
            } else {
              System.out.println(this.nome + ":Esse pokemon não está em batalha, não posso ataca-lo...");
            }
        } else {
            System.out.println(this.nome + ":Não estou em batalha...");
        }
    }

    public void retornar () {
        if (!this.emBatalha) {
            System.out.println(this.nome + ":Já retornei.");
        } else {
            this.emBatalha = false;
            System.out.println(this.nome + ":Retornando...");
        }
    }

    public void batalhar () {
        if (this.emBatalha) {
          System.out.println(this.nome + ":Já estou em batalha!");  
        } else {
            this.emBatalha = true;
            System.out.println(this.nome + ":Em batalha!");
        }
    }
}
