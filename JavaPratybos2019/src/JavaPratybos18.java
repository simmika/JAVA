public class JavaPratybos18 {
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = new StringBuffer(str1).reverse().toString();
        if (str1.equals(str2)) {
            System.out.println("Zodis yra polindromas");
        } else {
            System.out.println("Zodis nera polindromas");
        }
    }
}
