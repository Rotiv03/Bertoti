import java.util.Date;

public class Alimento implements Produto {
  private Date dataVal;
  private Integer calorias;
  private String nome;
  private double valor;

  public Alimento(Date dataVal, Integer calorias, String nome, double valor){
    this.dataVal = dataVal;
    this.calorias = calorias;
    this.nome = nome;
    this.valor = valor;
  }

  public Date getDataVal() {
    return dataVal;
  }

  public void setDataVal(Date dataVal) {
    this.dataVal = dataVal;
  }

  public Integer getCalorias() {
    return calorias;
  }

  public void setCalorias(Integer calorias) {
    this.calorias = calorias;
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
    System.out.println("Comprando alimento " + this.nome + "... total: R$" + this.valor);
  }
}
