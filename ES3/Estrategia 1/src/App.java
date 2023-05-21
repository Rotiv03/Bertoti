public class App {
    public static void main(String[] args) throws Exception {
        Pokemon pikachu = new Pokemon("Pikachu", new NaoVoar());

        pikachu.batalhar();
        pikachu.atacar();
        pikachu.defender();
        pikachu.retornar();
        pikachu.voarBehavior.voar();
    }
}
