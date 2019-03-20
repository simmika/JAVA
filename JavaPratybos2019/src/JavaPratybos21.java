public class JavaPratybos21 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int random = (int) (Math.random() * 100);
            System.out.println(random);
            sum += random;
        }
        System.out.println(sum);
    }
}
