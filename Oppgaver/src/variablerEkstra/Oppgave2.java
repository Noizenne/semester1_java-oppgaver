package variablerEkstra;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main(String[] args) {
        double voksenBillet = 150;
        double barneBilett = 150/1.10;

        System.out.println(barneBilett);
        String antallVoksne = showInputDialog("Hvor mange voksne skal ha billet?");
        String antallBarn = showInputDialog("Hvor mange barn skal ha billet?");

        double innVoksne, innBarn;

        try {
            innVoksne = Double.parseDouble(antallVoksne) * voksenBillet;
            innBarn = Double.parseDouble(antallBarn) * barneBilett;
        } catch (Exception e) {
            innVoksne = 0;
            innBarn = 0;
            System.out.println("Vennligst skriv inn tall.");
        }

        double sum = innVoksne + innBarn;

        showMessageDialog(null, "Det blir til sammen: " + sum + " kr.");
    }
}
