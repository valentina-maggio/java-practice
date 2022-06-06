package displayprice;

public class PriceDisplay {
  public String getPriceLabel(String x, Integer y) {
    String str = String.format("The price for item: %s is %o", x, y);
    return str;
  }
}
