public class JavaPratybos6 {

    public static void main(String[] args) {

        String tittle = "XOR truth table:";
        System.out.println(tittle);

        boolean[] boo = {false, true};
        System.out.println("XOR truth table");
        System.out.println("a\t\tb\t\ta^b");
        for (boolean a: boo) {
            for (boolean b : boo) {
                System.out.println(a + "\t" + b + "\t" + (a ^ b));
            }
        }
        System.out.println();
    }
}

