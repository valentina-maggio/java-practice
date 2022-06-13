package shoppinglist;

import java.util.ArrayList;

public class ShoppingList {
  private ArrayList<ShoppingItem> list = new ArrayList<>();

  public void addItem(ShoppingItem item) {
    this.list.add(item);
  }

  public ArrayList<ShoppingItem> getList() {
    return this.list;
  }
}
