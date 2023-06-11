// Setor de compras
class PurchasingDepartment implements LowStockObserver {
  @Override
  public void update() {
      System.out.println("Notificação: Produto com estoque baixo. É necessário fazer um pedido.");
  }
}
