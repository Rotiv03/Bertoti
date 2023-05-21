package TipoBehavior;

public class Fogo implements TipoBehavior{
    @Override
    public int possuiVantagem(TipoBehavior tipo) {
        if (tipo instanceof Grama) {return 1;}
        if (tipo instanceof Agua) {return -1;}
        return 0;
    }
}
