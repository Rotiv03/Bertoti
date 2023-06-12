import java.util.ArrayList;
import java.util.List;

// Singleton
class Inventory {
  private static Inventory instance;
  private List<ProductComponent> products;

  private Inventory() {
      products = new ArrayList<>();
  }

  public static synchronized Inventory getInstance() {
      if (instance == null) {
          instance = new Inventory();
      }
      return instance;
  }

  public void addProduct(ProductComponent productComponent) {
      products.add(productComponent);
  }

  public List<ProductComponent> getProducts() {
      return products;
  }
}