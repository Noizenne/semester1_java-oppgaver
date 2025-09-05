package variabler2;
import static javax.swing.JOptionPane.*;
public class Oppgave1 {
    public static void main(String[] args){
        /*
        Lag et program som leser inn alderen din (et heltall).
        Vis så denne i en meldingsbox sammen med en tekst f.eks som ”Min alder er 19 år.”
         */
        String alder = showInputDialog("Hva er alderen din?");
        int alderTall = Integer.parseInt(alder);

        showMessageDialog(null,"Min alder er " + alderTall);
    }
}
