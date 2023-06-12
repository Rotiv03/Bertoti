class RegularDiscountStrategy implements DiscountStrategy {
  @Override
  public double calculateDiscount(double price) {
    // Implementação do cálculo de desconto para produtos normais
    return price * 0.1; // Desconto de 10%
  }
}
