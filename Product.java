public class Product {
  private int productId;
  private String name;
  private Float price;
  
  public Product(int productId, String name, Float price) {
    this.productId = Math.abs(productId);
    this.name = name;
    this.price = Math.abs(price);
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

}

class ElectronicProduct extends Product{
  private String brand;
  private int warrantyPeriod;
  public ElectronicProduct(int productId, String name, float price, String brand, int warrantyPeriod) {
    super(productId, name, price);
    this.brand = brand;
    this.warrantyPeriod = Math.abs(warrantyPeriod);
  }
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public int getWarrantyPeriod() {
    return warrantyPeriod;
  }
  public void setWarrantyPeriod(int warrantyPeriod) {
    this.warrantyPeriod = warrantyPeriod;
  }
  
}

class ClothingProduct extends Product {
  private String size;
  private String fabric;
  public ClothingProduct(int productId, String name, Float price, String size, String fabric) {
    super(productId, name, price);
    this.size = size;
    this.fabric = fabric;
  }
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }
  public String getFabric() {
    return fabric;
  }
  public void setFabric(String fabric) {
    this.fabric = fabric;
  }
}

class BookProduct extends Product{
  private String author;
  private String publisher;
  
  public BookProduct(int productId, String name, Float price, String author, String publisher) {
    super(productId, name, price);
    this.author = author;
    this.publisher = publisher;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  
}