package shoppinglist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingListTest {
  @Test
  public void testAddsTwoItemsToTheList() {
    ShoppingItem item1 = new ShoppingItem("banana", 0.55);
    ShoppingItem item2 = new ShoppingItem("avocado", 1.75);

    ShoppingList list = new ShoppingList();
    list.addItem(item1);
    list.addItem(item2);

    assertEquals("Add milk to shopping list", 2, list.getList().size());
  }

  @Test
  public void ttestAddsThreeItemsToTheList() {
    ShoppingItem item1 = new ShoppingItem("banana", 0.55);
    ShoppingItem item2 = new ShoppingItem("avocado", 1.75);
    ShoppingItem item3 = new ShoppingItem("salad", 1.10);

    ShoppingList list = new ShoppingList();
    list.addItem(item1);
    list.addItem(item2);
    list.addItem(item3);

    assertEquals("Returns the items in the list", 3, list.getList().size());
  }
}
