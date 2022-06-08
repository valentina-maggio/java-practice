package shoppinglist;

public class ShoppingItem {
  private String name;
  private Double price;

  public ShoppingItem(String itemName, Double itemPrice) {
    name = itemName;
    price = itemPrice;
  }

  public String getDetails() {
    return name + " £" + price;
  }
}