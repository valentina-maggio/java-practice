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
}
