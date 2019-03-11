
class HelloAnybody {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("hello");
        sb.append(" ");
        sb.append(args[0]);

        System.out.println(sb.toString());
    }
}