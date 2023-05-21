package TipoBehavior;

public class Dragao implements TipoBehavior{
    @Override
    public int possuiVantagem(TipoBehavior tipo) {
        if (tipo instanceof Dragao) {return 1;}
        return 0;
    }
}
