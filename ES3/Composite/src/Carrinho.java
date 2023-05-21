import java.util.ArrayList;
import java.util.List;

public class Carrinho implements Produto {
  private List<Produto> produtos;
  private double valor;

  public Carrinho() {
    this.produtos = new ArrayList<>();
    this.valor = 0.00;
  }

  @Override
  public void comprar() {
    // Implementação da compra no carrinho
    System.out.println("Comprando produtos... total R$"+this.valor);
  }

  @Override
  public double getValor(){
    return this.valor;
  }

  public void addProduto(Produto produto) {
    produtos.add(produto);
    this.valor += produto.getValor();
  }

  public void deleteProduto(Produto produto) {
    boolean removido = produtos.remove(produto);
    if (removido) {
      this.valor -= produto.getValor();
    } else {
      System.out.println("Produto não encontrado");
    }
  }

  public List<Produto> getProdutos() {
    return produtos;
  }
}
