package variablerEkstra;
import static javax.swing.JOptionPane.*;

public class BrødKalkulator {
    public static void main(String[] args) {
        double deigPrBrød = 500; //g
        double melkPrBrød = 3; //dl

        String melG = showInputDialog("Hvor mye mel i gram skal du bruke?");  // Be brukeren om å skrive inn mengde mel i gram
        double innMelG = Double.parseDouble(melG);

        double melkDl = (innMelG/deigPrBrød) * melkPrBrød; // 3 dl melk per 500 g mel
        int antallBrød = (int)(innMelG/deigPrBrød + melkDl); // 1 brød per 500 g mel
        showConfirmDialog(null,"Du trenger " + melkDl + " dl melk" +" og med dette så kan du lage " +
                antallBrød + " brød.");
    }
}
