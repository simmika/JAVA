public class Main {
    public static void main(String[] args) {

        Medicine panadol = new Medicine("Panadol", 2.15);
        Periodical newspaper = new Periodical("Lietuvos rytas", 3.00);
        Product juice = new Product("Sun365", 2.79);
        ShoppingCart myCart = new ShoppingCart();

        myCart.add(panadol);
        myCart.add(newspaper);
        myCart.add(juice);

        System.out.println(myCart.getTotalPriceWithVat());
    }
}
