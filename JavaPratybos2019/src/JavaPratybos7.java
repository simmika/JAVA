public class JavaPratybos7 {

        public static void main(String[] args) {
            String str = "A\240b3&4\040";
            System.out.println("char: " + str);
            char[] charts = str.toCharArray();
            System.out.print("char:\t\t\t");
            for (char z : charts) {
                System.out.println("\t\t\t" + z);
            }
            System.out.println();
            System.out.println("char code: " + str);
            System.out.print("char:\t\t");
            for (char z : charts) {
                System.out.print("\t\t" + (int) z);
            }
            System.out.println();
            System.out.println("isDigit: " + str);
            System.out.print("char:\t\t");
            for (char z : charts) {
                System.out.print("\t\t" + Character.isDigit(z));
            }
            System.out.println();
            System.out.println("isLetter: " + str);
            System.out.print("char:\t\t");
            for (char z : charts) {
                System.out.print("\t\t" + Character.isLetter(z));
            }
            System.out.println();
            System.out.println("isLetterOrDigital: " + str);
            System.out.print("char:\t\t");
            for (char z : charts) {
                System.out.print("\t\t" + Character.isLetterOrDigit(z));
            }
            System.out.println();
            System.out.println("isSpaceChar: " + str);
            System.out.print("char:\t\t");
            for (char z : charts) {
                System.out.print("\t\t" + Character.isSpaceChar(z));
            }
            System.out.println();
            System.out.println("isUpperCase: " + str);
            System.out.print("char:\t\t");
            for (char z : charts) {
                System.out.print("\t\t" + Character.isUpperCase(z));
            }
            System.out.println();
            System.out.println("isWhiteSpace: " + str);
            System.out.print("char:\t\t");
            for (char z : charts) {
                System.out.print("\t\t" + Character.isWhitespace(z));
            }
            System.out.println();

        }
    }