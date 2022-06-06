package displayprice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceDisplayTest {
  @Test
  public void PriceDisplay() {
    PriceDisplay price = new PriceDisplay();
    assertEquals("It shows £4 for a cappuccino", String.valueOf("The price for item: cappuccino is 4"),
        price.getPriceLabel("cappuccino", 4));
  }
}
