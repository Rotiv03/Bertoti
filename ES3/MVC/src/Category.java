import java.util.ArrayList;
import java.util.List;

// Categoria de produtos
class Category implements ProductComponent {
  private List<ProductComponent> products;
  private String name;

  public Category(String name) {
    this.name = name;
    products = new ArrayList<>();
  }

  public void add(ProductComponent productComponent) {
    products.add(productComponent);
  }

  public void remove(ProductComponent productComponent) {
    products.remove(productComponent);
  }

  public void display() {
    System.out.println("Categoria: " + name);
    for (ProductComponent product : products) {
      product.display();
    }
  }
}
