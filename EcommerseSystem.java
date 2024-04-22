import java.util.Scanner;
public class EcommerseSystem {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    // Create products
    ElectronicProduct p1 = new ElectronicProduct(1, "Iphone", 599.9f, "Apple", 1);
    ClothingProduct p2 = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
    BookProduct p3 = new BookProduct(3, "OOP", 39.99f, "Mark", "FCDS");

    // Create customer
    System.out.println("Enter your customer ID:");
    int customerId = scanner.nextInt();
    scanner.nextLine(); // Consume newline
    System.out.println("Enter your name:");
    String name = scanner.nextLine();
    System.out.println("Enter your address:");
    String address = scanner.nextLine();
    
    Customer customer = new Customer(customerId, name, address);

    // Create Cart
    System.out.println("How many products you want to add to your cart?");
    int numProducts = scanner.nextInt();
    Cart cart = new Cart(customerId, numProducts);

    // Add products to cart
    for (int i = 0; i < numProducts; i++){
      System.out.println("To add "+p1.getName() + " Enter 1 ,");
      System.out.println("To add "+p2.getName() + " Enter 2 ,");
      System.out.println("To add "+p3.getName() + " Enter 3 ,");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          cart.addProduct(p1,i);
          break;
        case 2:
          cart.addProduct(p2,i);
          break;
        case 3:
          cart.addProduct(p3,i);
          break;
        
        default:
          System.out.println("Invalid product .");
          break;
    }
    }

    // Confirmation
    System.out.println("your total is : "+cart.calculatePrice());
    System.out.println("Would you like to place the order ?  1-yes  2-no ");
    int confirm = scanner.nextInt();
    if (confirm == 1){cart.placeOrder();}
  }
}
