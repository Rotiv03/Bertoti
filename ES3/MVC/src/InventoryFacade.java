// Facade
class InventoryFacade {
  private Inventory inventory;

  public InventoryFacade() {
    inventory = Inventory.getInstance();
  }

  public void addProduct(ProductComponent productComponent) {
    inventory.addProduct(productComponent);
  }

  public void displayInventory() {
    for (ProductComponent product : this.inventory.getProducts()) {
      product.display();
    }
  }
}