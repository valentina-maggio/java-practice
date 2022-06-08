package shoppinglist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingItemTest {
  @Test
  public void testReturnsTheItemDetails() {
    ShoppingItem item = new ShoppingItem("salad", 3.55);

    assertEquals("Returns the added item", "salad £3.55", item.getDetails());
  }
}
