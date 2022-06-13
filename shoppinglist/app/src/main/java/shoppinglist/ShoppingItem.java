package shoppinglist;

public class ShoppingItem {
  private String name;
  private Double price;

  public ShoppingItem(String itemName, Double itemPrice) {
    this.name = itemName;
    this.price = itemPrice;
  }

  public String getDetails() {
    return this.name + " £" + this.price;
  }
}