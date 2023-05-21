package TipoBehavior;

public class Grama implements TipoBehavior{
    @Override
    public int possuiVantagem(TipoBehavior tipo) {
        if (tipo instanceof Agua) {return 1;}
        if (tipo instanceof Fogo) {return -1;}
        return 0;
    }
}
