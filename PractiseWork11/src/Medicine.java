import com.timbuchaka.AbstractProduct;

public class Medicine extends AbstractProduct implements ShoppingCartItem {
    // static final = constant
    private static final double MEDICINE_VAT = 1.05;

    public Medicine(String name, double price){
        super(name, price);
    }

    @Override
    public double getVat(){
        return MEDICINE_VAT;
    }
}
