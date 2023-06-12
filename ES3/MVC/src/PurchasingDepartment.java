// Setor de compras
class PurchasingDepartment implements LowStockObserver {
  private Inventory inventory;

  public PurchasingDepartment() {
    this.inventory = Inventory.getInstance();
  }

  @Override
  public void update() {
      System.out.println("Notificação: Produto com estoque baixo. É necessário fazer um pedido.");
      System.out.println("Produtos: "+this.inventory);
  }
}
