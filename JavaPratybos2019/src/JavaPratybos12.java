public class JavaPratybos12 {

    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        String c = args[2];

        double numberA = Double.parseDouble(a);
        double numberB = Double.parseDouble(b);
        double numberC = Double.parseDouble(c);

        function(numberA, numberB, numberC);
    }

    public static int function(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Invalid value: a should be not equal to zero");
        } else {

            double x0 = -(b / 2 * a);
            double y0 = ((Math.pow((-b), 2) + 4 * a * c) / (4 * a));
            System.out.println("x0 = " + x0 + " y0 = " + y0);
        }
        return 0;
    }
}
