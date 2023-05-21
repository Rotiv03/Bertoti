import java.util.Date;

public class App {
  public static void main(String[] args) throws Exception {
    Carrinho carrinho = new Carrinho();
    Roupa bermuda = new Roupa("GG", "Jeans", "Bermuda Jeans", 49.90);
    Alimento batata = new Alimento(new Date(), 455, "Batata doce", 29.90);

    carrinho.addProduto(batata);
    carrinho.deleteProduto(bermuda);
    carrinho.addProduto(bermuda);
    carrinho.comprar();
  }
}
