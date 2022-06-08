package shoppinglist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingListTest {
  @Test
  public void testAddsAnItemToTheList() {
    ShoppingList list = new ShoppingList();

    assertEquals("It adds milk to the shopping list", String.valueOf("milk was added to the list"),
        list.addItem("milk"));
  }
}
