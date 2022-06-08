package shoppinglist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingListTest {
  @Test
  public void testAddsAnItemToTheList() {
    ShoppingList list = new ShoppingList();
    list.addItem("milk");

    assertEquals("Add milk to shopping list", 1, list.getList().size());
  }

  @Test
  public void testReturnsTheItemsInTheList() {
    ShoppingList list = new ShoppingList();
    list.addItem("milk");
    list.addItem("bread");
    list.addItem("honey");

    assertEquals("Returns the items in the list", "milk, bread, honey", list.getItems());
  }
}
