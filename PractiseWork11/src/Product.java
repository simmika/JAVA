import com.timbuchaka.AbstractProduct;

public class Product extends AbstractProduct implements ShoppingCartItem {
    private static final double VAT = 1.21;

    public Product(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat(){
        return VAT;
    }
}
