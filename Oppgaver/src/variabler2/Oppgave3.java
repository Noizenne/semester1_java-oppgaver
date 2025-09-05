package variabler2;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String[] args) {
        /*
        Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn.
        Vis så dette resultatet via 1) Meldingsboks og 2) System.out.
         */
        String innTall = showInputDialog("Skriv inn tall");
        String innTall2 = showInputDialog("Skriv inn et tall til");
        String innTall3 = showInputDialog("Og et tall til");

        double tall = Double.parseDouble(innTall);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double sum = tall + tall2 + tall3;
        double gjennomsnitt = sum/3; //Deler på 3 fordi det er 3 innlesninger

        System.out.println("Gjennomsnittet er: " + gjennomsnitt);
        showMessageDialog(null, "Gjennomsnittet er: " + gjennomsnitt);

    }
}
