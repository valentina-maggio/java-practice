package shoppinglist;

import java.util.ArrayList;

public class ShoppingList {
  private ArrayList<String> list = new ArrayList<>();

  public void addItem(String item) {
    list.add(item);
  }

  public ArrayList<String> getList() {
    return this.list;
  }
}
