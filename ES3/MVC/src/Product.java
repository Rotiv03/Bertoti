// Produto individual
class Product implements ProductComponent {
  private double price;
  private DiscountStrategy discountStrategy;
  private String name; 

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public void setDiscountStrategy(DiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }

  public double getPrice() {
    if (discountStrategy != null) {
      double discount = discountStrategy.calculateDiscount(price);
      return price - discount;
    }
    return price;
  }

  public void display() {
    System.out.println("Produto: " + name + ", Preço: " + price);
  }
}
