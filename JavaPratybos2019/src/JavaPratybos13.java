public class JavaPratybos13 {
    public static void main(String[] args) {
        String name = args[0];
        String lastNameChar = name.substring(name.length() - 1);

        if (lastNameChar.equals("e") || lastNameChar.equals("a")) {
            System.out.println(name + " is a woman");
        } else {
            System.out.println(name + " is a man");
        }
    }
}


