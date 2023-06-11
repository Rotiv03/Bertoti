public class App {
  public static void main(String[] args) throws Exception {
    // Criando as estratégias de desconto
    System.out.println("Criando tipos de desconto (Com strategy)...");
    DiscountStrategy regularDiscount = new RegularDiscountStrategy();
    DiscountStrategy saleDiscount = new SaleDiscountStrategy();
    System.out.println(regularDiscount);
    System.out.println(saleDiscount);

    // Criando os produtos
    System.out.println("Criando produtos...");
    Product product1 = new Product("Produto 1", 100.0);
    Product product2 = new Product("Produto 2", 50.0);
    
    // Definindo as estratégias de desconto para os produtos
    product1.setDiscountStrategy(regularDiscount);
    product2.setDiscountStrategy(saleDiscount);

    product1.display();
    product2.display();

    // Criando categorias
    System.out.println("Criando categorias...");
    Category category1 = new Category("Categoria 1");
    Category category2 = new Category("Categoria 2");
    System.out.println(category1);
    System.out.println(category2);

    // Adicionando produtos às categorias
    category1.add(product1);
    category2.add(product2);

    System.out.println("Categoria 1");
    category1.display();

    System.out.println("Categoria 2");
    category2.display();

    // Criando o estoque
    InventoryFacade inventoryFacade = new InventoryFacade();

    // Adicionando produtos ao estoque
    inventoryFacade.addProduct(category1);
    inventoryFacade.addProduct(category2);

    // Exibindo o estoque
    inventoryFacade.displayInventory();

    // Simulando uma notificação de estoque baixo
    LowStockObserver observer = new PurchasingDepartment();
    observer.update();
  }
}
