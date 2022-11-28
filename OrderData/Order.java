import java.util.LinkedList;


public class Order {
  public int orderId;
  public LinkedList<Item> order = new LinkedList<Item>();
  public int customerId;
  public String subtotal;
  public String tax;
  public String status;
}