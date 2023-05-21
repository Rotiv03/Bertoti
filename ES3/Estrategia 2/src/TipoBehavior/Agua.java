package TipoBehavior;

public class Agua implements TipoBehavior{
    @Override
    public int possuiVantagem(TipoBehavior tipo) {
        if (tipo instanceof Fogo) {return 1;}
        if (tipo instanceof Grama) {return -1;}
        return 0;
    }
}
