public class JavaPratybos17 {
    public static void main(String[] args) {
        String sqr = args[0];
        int number = Integer.parseInt(sqr);
        kvadratas(number);

    }

    public static void kvadratas(int number) {
        int result = 0;
        for (int i = 0; i <= number - 1; i++) {
            result += number;
        }
        System.out.println(result);
    }
}
