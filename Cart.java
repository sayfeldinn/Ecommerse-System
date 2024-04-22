public class Cart {
  private int customerId;
  private int nProducts;
  private Product[] products;

  public Cart(int customerId, int nProducts) {
    this.customerId = Math.abs(customerId);
    this.nProducts = Math.abs(nProducts);
    this.products = new Product[nProducts];
  }
  public int getCustomerId() {
    return customerId;
  }
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }
  public int getnProducts() {
    return nProducts;
  }
  public void setnProducts(int nProducts) {
    this.nProducts = nProducts;
  }
  public Product[] getProducts() {
    return products;
  }
  public void setProducts(Product[] products) {
    this.products = products;
  }
  public void addProduct(Product product,int index){
    if(index >= 0 && index < nProducts)
    {
      products[index] = product;
      System.out.println(product.getName() + " Added .");
    }
    else{
      System.out.println("Invalid Indix .");
    }
  }

  public void removeProduct(int index){
    if(index >= 0 && index > nProducts)
    {
      products[index] = null;
    }
    else{
      System.out.println("Invalid Indix .");
    }
  }
  public float calculatePrice(){
    float totalPrice = 0;
    for(int i = 0;i<nProducts;i++)
    {
      if (products[i] != null)
      {
        totalPrice += products[i].getPrice();
      }
    }
    return totalPrice;
  }
  public void placeOrder(){
    System.out.println("Order placed .");
    Order order = new Order(customerId, 1, products, calculatePrice());
    order.printOrderInfo();
  }
}
