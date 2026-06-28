package Exercise2;
import java.util.*;
public class Main {
  public static void main(String args[]){
    Product product1 = new Product(103, "Laptop", "Electronics");
    Product product2 = new Product(101, "Shirt", "Clothing");
    Product product3 = new Product(105, "Book", "Books");
    Product product4 = new Product(102, "Headphones", "Electronics");
    Product product5 = new Product(104, "Shoes", "Footwear");
    
    Product[] products = {product1, product2, product3, product4, product5};
    for(int i=0; i<products.length; i++){
      if(products[i].getProductId() == 104){
        System.out.println("Product ID: " + products[i].getProductId());
        System.out.println("Product Name: " + products[i].getProductName());
        System.out.println("Product Category: " + products[i].getProductCategory());
      }
    }

    Arrays.sort(products, Comparator.comparing(Product::getProductId));

    int l = 0, r = products.length - 1;
    while (l < r) {
      int mid = l + (r - l) / 2;
      if (products[mid].getProductId() == 104) {
        System.out.println("Product ID: " + products[mid].getProductId());
        System.out.println("Product Name: " + products[mid].getProductName());
        System.out.println("Product Category: " + products[mid].getProductCategory());
        break;
      } else if (products[mid].getProductId() < 104) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    if(l >= r){
      System.out.println("Product with ID 104 not found.");
    }
  }
}
