public class Pokemon {
    public String nome;
    public VoarBehavior voarBehavior;
    public boolean emBatalha;

    public Pokemon(String nome, VoarBehavior voarBehavior) {
        this.emBatalha = false;
        this.nome = nome;
        this.voarBehavior = voarBehavior;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setVoarBehavior(VoarBehavior voarBehavior) {
        this.voarBehavior = voarBehavior;
    }

    public void setEmBatalha(boolean emBatalha) {
        this.emBatalha = emBatalha;
    }

    public String getNome () {
        return this.nome;
    }

    public VoarBehavior getVoarBehavior() {
        return voarBehavior;
    }

    public boolean getEmBatalha () {
        return emBatalha;
    }

    public void atacar () {
        System.out.println("Eu ataco!");
    }

    public void defender () {
        System.out.println("Eu defendo!");
    }

    public void retornar () {
        this.emBatalha = false;
        System.out.println("Retornando...");
    }

    public void batalhar () {
        this.emBatalha = true;
        System.out.println("Em batalha!");
    }
}
