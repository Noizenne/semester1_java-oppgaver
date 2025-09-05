package variablerEkstra;

public class Oppgave4 {
    public static void main(String[] args) {
        int tall = 7;
        int tall2 = 5;

//        System.out.println(tall/tall2);
//        System.out.println(tall2/tall);

        double tall3 = 7;
        double tall4 = 5;
//        System.out.println(tall3/tall4);
//        System.out.println(tall4/tall3);

        // Byte sin maksimale verdi er 255 så den vil faile hvis jeg
        // gir tall5 eller tall 6 noe mer. f.eks tall = 128;
        byte tall5 = 127;
        byte tall6 = 123;
//        System.out.println(tall5 + tall6);

        // Hvor mange tall etter punktum kan man ha i en float? 7
        //Hvor mange tall etter punktim kan man ha i en double? 15 - 17

        char t = 't';
        char s = 's';

        System.out.println(t + s);

        // However, in Processing, when you perform an arithmetic operation with characters (char),
        // the characters are first converted to their corresponding ASCII values, and then these ASCII values
        // are added together.
    }


}
