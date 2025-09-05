package variabler2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {
    public static void main(String[] args) {
        /*
        Endre på programmet i oppgave 3 slik at du sikrer at det
        skrives inn tall og ikke vanlig tekst i input-boksene.
        Bruk try og catch for å få dette til. Dersom det ikke skrives
        inn tall sett input til 0.
         */
        String innTall = showInputDialog("Skriv inn tall");
        String innTall2 = showInputDialog("Skriv inn et tall til");
        String innTall3 = showInputDialog("Og et tall til");

        double tall, tall2, tall3;

        try {
            tall = Double.parseDouble(innTall);
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);
        } catch (Exception e) {
            tall = 0;
            tall2 = 0;
            tall3 = 0;
            System.out.println("En feil har skjedd, vennligst skriv inn tall.");
        }

        double sum = tall + tall2 + tall3;
        double gjennomsnitt = sum/3; //Deler på 3 fordi det er 3 innlesninger

        System.out.println("Gjennomsnittet er: " + gjennomsnitt);
        showMessageDialog(null, "Gjennomsnittet er: " + gjennomsnitt);
    }
}
