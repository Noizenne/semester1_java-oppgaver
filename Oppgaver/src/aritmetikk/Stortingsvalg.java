package aritmetikk;
import static javax.swing.JOptionPane.*;

public class Stortingsvalg {
    public static void main(String[] args) {
        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);

//        String[] options = {"Yes", "No"};
//        var erStatsborger = showOptionDialog(null, "Er du en norsk statsborger?", "Statsborgerskap",
//                0, 2, null, options, options[0]);
        String innStatsborger = showInputDialog(null, "Er du norsk statsborger? ja eller nei");
        boolean erStatsborger = innStatsborger.equals("ja");

        if (alder >= 18 && erStatsborger) {
            System.out.println("Du kan stemme!");
        } else {
            System.out.println("Du kan ikke stemme!");
        }
    }
}
