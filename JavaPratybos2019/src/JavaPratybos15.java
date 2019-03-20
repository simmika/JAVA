public class JavaPratybos15 {
    public static void main(String[] args) {

        int previousNumber = 0;
        int nextNumber = 1;

        int currentNumber = 0;

        while (currentNumber < 1000) {
            System.out.print(currentNumber + " ");
            currentNumber = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = currentNumber;
        }

//        int number = 0;
//        while (fibonaci(number) < 1000) {
//            System.out.println(fibonaci(number));
//            number++;
//        }

//        System.out.println(fibonaci(4));
//        int number;
//        for (int i = 0; i <= 16; i++) {
//            System.out.print(previousNumber + " ");
//            number = previousNumber + nextNumber;
//            previousNumber = nextNumber;
//            nextNumber = number;
//        }
    }

//    static int fibonaci(int number) {
//        if (number <= 1) {
//            return 1;
//        }
//        return fibonaci(number - 1) + fibonaci(number - 2);
//    }
}
