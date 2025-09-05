package variabler1;
import static javax.swing.JOptionPane.*;


public class Oppgaver {
    public static void main(String[] args) {
        String forNavn, etterNavn, alder, adresse, postSted, postNr;
        forNavn = showInputDialog("Hva er fornavnet ditt?");
        etterNavn = showInputDialog("Hva er etternavnet ditt?");
        String fulltNavn = forNavn + " " + etterNavn;

        alder = showInputDialog("Hvor gammel er du?");
        int innAlder = Integer.parseInt(alder);

        adresse = showInputDialog("Hva er adressen din?");
        postSted = showInputDialog("Hva er poststedet ditt?");
        postNr = showInputDialog("Hva er postnummeret ditt?");
        int innPostNr = Integer.parseInt(postNr);

        showMessageDialog(null, fulltNavn +
                " bor i " + adresse + "\n som har postnummeret " + innPostNr
                + " i " + postSted + ". " + "\nAlderen til " + fulltNavn + " er "
                + innAlder + " år.");

//        showMessageDialog(null,
//                "Navn:" + " " + fulltNavn + "\n" +
//                        "Adresse:" + " " + adresse + "\n" +
//                        "Postnummer:" + " " + innPostNr + "\n" +
//                        "Poststed:" + " " + postSted + "\n" +
//                        "Alder:" + " " + innAlder + "år."
//                );
        /* System.out.println("Navn:" + " " + fulltNavn + "\n" +
                "Adresse:" + " " + adresse + "\n" +
                "Postnummer:" + " " + innPostNr + "\n" +
                "Poststed:" + " " + postSted + "\n" +
                "Alder:" + " " + innAlder + " " + "år.");*/
    }
}
