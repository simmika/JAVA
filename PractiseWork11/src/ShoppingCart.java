import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<ShoppingCartItem> Items = new ArrayList<>();

    public void add(ShoppingCartItem item) {
        Items.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (ShoppingCartItem item : Items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }


    public double getTotalPriceWithVat() {
        double totalPriceWithVat = 0;
        for (ShoppingCartItem item : Items) {
            totalPriceWithVat += item.getPriceWithVat();
        }
        return totalPriceWithVat;
    }
}
