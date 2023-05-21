import java.util.ArrayList;

import Movimento.Movimento;
import Pokemon.Pokemon;
import TipoBehavior.Dragao;
import TipoBehavior.Fogo;
import TipoBehavior.Grama;
import VoarBehavior.NaoVoar;

public class App {
  public static void main(String[] args) throws Exception {
    Pokemon bulbassaur = new Pokemon("Bulbassaur", new Grama(), 100, new NaoVoar());
    Movimento bulba_mov_1 = new Movimento("Razor Leaf", new Grama(), 24);
    Movimento bulba_mov_2 = new Movimento("Vine Whip", new Grama(), 16);
    Movimento bulba_mov_3 = new Movimento("Leech Seed", new Grama(), 8);
    ArrayList<Movimento> bulba_movs = new ArrayList<Movimento>();
    bulba_movs.add(bulba_mov_1);
    bulba_movs.add(bulba_mov_2);
    bulba_movs.add(bulba_mov_3);
    bulbassaur.setMovimentos(bulba_movs);

    Pokemon charmander = new Pokemon("Charmander", new Fogo(), 124, new NaoVoar());
    Movimento char_mov_1 = new Movimento("Ember", new Fogo(), 12);
    Movimento char_mov_2 = new Movimento("Dragon Rage", new Dragao(), 24);
    Movimento char_mov_3 = new Movimento("Flamethrower", new Grama(), 36);
    ArrayList<Movimento> char_movs = new ArrayList<Movimento>();
    char_movs.add(char_mov_1);
    char_movs.add(char_mov_2);
    char_movs.add(char_mov_3);
    charmander.setMovimentos(char_movs);

    System.out.println(+charmander.getVida());
    bulbassaur.batalhar();
    charmander.batalhar();
    bulbassaur.atacar(charmander, 0);
    System.out.println(charmander.getVida());
  }
}
