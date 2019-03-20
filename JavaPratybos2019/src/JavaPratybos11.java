// komandineje eiluteje pvz.: java JavaPratybos11 S 2

public class JavaPratybos11 {

    public static void main(String[] args) {
        if (args.length == 2) {
            String function = args[0]; // p, s
            String number = args[1]; // skaicius

            double one = Double.parseDouble(number);
            double result = 0;

            if (function.equals("S")) {
                result = Math.pow(one, 2);
            }
            if (function.equals("P")) {
                result = one * 4;
            }
            System.out.println(function + "  " + number + " = " + result);
        }
    }
}
