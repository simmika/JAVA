
import java.text.DecimalFormat;

public class PractiseWork7 {
    public static void main(String[] args) {

        if (args.length == 2) {
            String func = args[0];
            String number = args[1];

            DecimalFormat df = new DecimalFormat("0.0000");
            double one = Double.parseDouble(number);

            double result = 0;

            if (func.equals("sin")) {
                result = Math.sin(one);
            }
            if (func.equals("cos")) {
                result = Math.cos(one);
            }
            if (func.equals("tan")) {
                result = Math.tan(one);
            }
            if (func.equals("ctan")) {
                result = Math.atan(one);
            }
            if (func.equals("sqrt")) {
                result = Math.sqrt(one);
            }
            if (func.equals("pow")) {
                result = Math.pow(one, 2);
            }
            System.out.println(func + " " + number + " = " + df.format(result));
        }

        if (args.length == 3) {
            String numberOne = args[0];
            String operation = args[1];
            String numberTwo = args[2];

            DecimalFormat df = new DecimalFormat("0.0000");
            double one = Double.parseDouble(numberOne);
            double two = Double.parseDouble(numberTwo);

            double result = 0;

            if (operation.equals("-")) {
                result = one - two;
            }
            if (operation.equals("+")) {
                result = one + two;
            }
            if (operation.equals("/")) {
                result = one / two;
            }
            if (operation.equals("*")) {
                result = one * two;
            }
            if (operation.equals("pow")) {
                result = Math.pow(one, two);
            }
            if (operation.equals("%")) {
                result = one / 100 * two;
            }
            if (operation.equals("mod")) {
                result = one % two;
            }

            System.out.println(numberOne + " " + operation + " " + numberTwo + " = " + df.format(result));
        }
    }
}
