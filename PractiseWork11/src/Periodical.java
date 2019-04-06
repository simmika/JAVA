import com.timbuchaka.AbstractProduct;

public class Periodical extends AbstractProduct implements ShoppingCartItem {

    private static final double PERIODICAL_VAT = 1.09;

    public Periodical(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat(){
        return PERIODICAL_VAT;
    }
}
