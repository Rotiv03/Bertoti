class SaleDiscountStrategy implements DiscountStrategy {
  @Override
  public double calculateDiscount(double price) {
    // Implementação do cálculo de desconto para produtos em promoção
    return price * 0.2; // Desconto de 20%
  }
}
