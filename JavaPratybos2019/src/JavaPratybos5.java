public class JavaPratybos5 {
    public static void main(String[] args) {
        String text = ").cte ,iP yrrebpsaR ,xuniL ,caM ,swodniW( smroftalp tnereffid no skrow avaJ";
        String revere = new StringBuffer(text).reverse().toString();
        System.out.println(revere);


        String data = ").cte ,iP yrrebpsaR ,xuniL ,caM ,swodniW( smroftalp tnereffid no skrow avaJ";
        System.out.print("Revers character ");
        System.out.println(data);
        char[] charData = data.toCharArray();
        for (int i = 0, j = charData.length - 1; i < j; i++, --j) {
            char tmp = charData[1];
            charData[i] = charData[j];
            charData[j] = tmp;
        }
        data = new String(charData);
        System.out.print("Normal character string = ");
        System.out.println(data);
    }


}

