public class PractiseWork6 {

    public static void main(String[] args) {


        //apibrėžia įvairių tipų kintamuosius: byte, short, int, long, float, double, boolean, char

        byte myByte = 2;
        short myShort = 12;
        int myInt = 10;
        long myLong = 345345L;
        float myFloat = 0.2f;
        double myDouble = 0.1d;
        boolean myBoolean = true;
        char myChar = 'a';

        //atspausdina komandinėje eilutėjė apibrėžtus kintamuosius (jų reikšmes)
        System.out.println("myByte = " + myByte + " \n" + "myShort = " + myShort + "\n" + "myInt = " + myInt + "\n"
                + "myLong = " + myLong + "\n" + "myFloat = " + myFloat + "\n" + "myDouble = " + myDouble + "\n" +
                "myBoolean = " + myBoolean + "\n" + "myChar = " + myChar);


        // įvykdo veiksmus su kintamaisiais ir atspausdina veiksmų rezultatus: +, -, /, *
        int byteValue = myByte;
        int amount = byteValue + myInt;
        System.out.println("amount = " + amount);

        long longValue = myInt;
        long subtraction = myLong - myInt;
        System.out.println("Subtraction = " + subtraction);

        double doubleFromFloat = myFloat;
        double division = doubleFromFloat / myDouble;
        System.out.println("Division = " + division);

        int intCharValue = myChar;
        System.out.println("intCharValue = " + intCharValue);
        int multiplication = intCharValue * myInt;
        System.out.println("multiplication = " + multiplication);


        //panaudoti objekto, statinius ir vietinius kintamuosius
        MyClass manoKlase = new MyClass();

        // objekto kintamasis
        System.out.println("Objekto kintamasis =" + manoKlase.pirmas);
        // statinis
        System.out.println("Statinis kintamasis =" + MyClass.trecias);
        // vietinis
        System.out.println("Vietinis kintamasis =" + longValue);


        //panaudoja specialius simbolius String kinamajame
        String myString = "This is my \"practise work 6\" ";
        System.out.println("myString = " + myString);

        String myString2 = "Hello World ! \n This is my Java homework";
        System.out.println("myString2 = " + myString2);


        //pademonstruoja įvairių tipų (ne tik matematinių) operatorių eiliškumo veikimą
        int doublePlus = ++myInt;
        System.out.println("doublePlus = " + doublePlus);

        int int1 = 0;
        int int2 = 2;
        int int3 = -8;
        int int4 = 5;
        int1 += int2;
        System.out.println("int1 += int2 = " +int1);
        int4 %= int2;
        System.out.println("int4 %= int2 = " + int4);
        int3--;
        System.out.println("int3-- = " + int3);

        int int6 = 1, int7 = 2, int8 = 0;
        int int5 = int6 * int7 + (--int8);
        System.out.println(int5);


        //pademonstruoja kaip kelių tipų kintamieji gali būti panaudoti viename reiškinyje

        short x1 = 1;
        int x2 = 2;
        long x3 = 3;

        long y = x1 + x2 + x3; // skirtingi tipu kintamieji vienam reiskinyje
        System.out.println(y);

        String myString3 = "b";
        char  charValue = 'b';
        boolean lygus = myString3.equals(charValue); // skirtingu tipu kintamieji viename reiskinyje
        System.out.println(lygus);
    }
}

class MyClass {
    public int pirmas = 0;
    public static int trecias = 2;
}
