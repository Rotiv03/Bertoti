public class Roupa implements Produto {
  private String tamanho;
  private String material;
  private String nome;
  private double valor;

  public Roupa(String tamanho, String material, String nome, double valor) {
    this.material = material;
    this.tamanho = tamanho;
    this.nome = nome;
    this.valor = valor;
  }

  public String getTamanho() {
      return tamanho;
  }

  public void setTamanho(String tamanho) {
      this.tamanho = tamanho;
  }

  public String getMaterial() {
      return material;
  }

  public void setMaterial(String material) {
      this.material = material;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public double getValor() {
    return this.valor;
  }

  public void setValor(double valor){
    this.valor = valor;
  }

  @Override
  public void comprar() {
      System.out.println("Comprando roupa " + this.nome + "... total: R$" + this.valor);
  }
}
