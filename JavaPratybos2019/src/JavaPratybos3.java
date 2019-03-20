public class JavaPratybos3 {

    public static void main(String[] args) {

        char[] data = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
        String dataString = String.valueOf(data);
        String upperCase = dataString.toUpperCase();
        System.out.println(upperCase);
        dataString = dataString.substring(0,1).toUpperCase() + dataString.substring(1).toLowerCase();
        System.out.println(dataString);

    }
}
