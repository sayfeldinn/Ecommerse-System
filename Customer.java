public class Customer {
  private int customerId;
  private String name;
  private String adress;
  
  public Customer(int customerId, String name, String adress) {
    this.customerId = Math.abs(customerId);
    this.name = name;
    this.adress = adress;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }
}