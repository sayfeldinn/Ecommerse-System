public class Order {
  private int customerId;
  private int orderId;
  private Product[] products;
  private float totalPrice;
  
  public Order(int customerId, int orderId, Product[] products, float totalPrice) {
    this.customerId = customerId;
    this.orderId = orderId;
    this.products = products;
    this.totalPrice = totalPrice;
  }

  public void printOrderInfo() {
    System.out.println("####################################");
    System.out.println("Here is your order summary :");
    System.out.println("####################################");
    System.out.println("Order ID: " + orderId);
    System.out.println("Customer ID: " + customerId);
    System.out.println("Products:");

    for (Product product : products) {
        if (product != null) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    System.out.println("Total Price : $" + totalPrice);
}

}
