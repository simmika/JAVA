public class JavaPratybos4 {

    public static void main(String[] args) {

        char[] data = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
        String dataString = String.valueOf(data);
        System.out.println(dataString);

        String reverse = new StringBuffer(dataString).reverse().toString();
        System.out.println(reverse);

    }
}
