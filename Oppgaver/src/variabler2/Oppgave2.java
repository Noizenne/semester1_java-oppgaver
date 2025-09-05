package variabler2;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main(String[] args) {
        /*
        Lag et program som leser inn tre desimaltall.
        Programmet skal så summere disse tallene og vise summen i System.out.
         */
        String innTall = showInputDialog("Skriv inn tall");
        String innTall2 = showInputDialog("Skriv inn et tall til");
        String innTall3 = showInputDialog("Og et tall til");

        double tall = Double.parseDouble(innTall);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double sum = tall + tall2 + tall3;

        System.out.println("Summen er: " + sum);
    }
}
