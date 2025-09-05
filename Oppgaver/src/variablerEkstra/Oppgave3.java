package variablerEkstra;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String[] args) {
        String innÅr = showInputDialog("Hvor mange år er du?");
        int år;

        try {
            år = Integer.parseInt(innÅr);
        } catch (Exception e) {
            år = 0;
            System.out.println("Vennligst skriv inn tall.");
        }

        int res = år * 365;

        System.out.println("Du har levd i omtrent " + res + " dager.");
    }
}
