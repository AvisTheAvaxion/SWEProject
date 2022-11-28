
import java.util.*;

public class OrderData {
    public static class OrderDBManager{
     String filePath;

     /* public static void SaveOrder(Order){}
        public static Order LoadOrder(OrderID) {}
        public static Order[] SearchOrders(customerID) {}
        public static Order CreateOrder(customerID) {} */
    }
    private class Order{
        int OrderID;
        LinkedList<Item> Order;
        int customerID;
        String subTotal;
        String tax;
        String status;

    }
    abstract class Item{
        String name;
        int price;

    }
    private class Pizza extends Item{
        String[] Toppings;
        String crust;
        int pizzaSize;

    }
    private class Side extends Item{

    }

    private class Drink extends Item{
        boolean NoIce;
        String drinkSize;
    }

}
