package aritmetikk;
import static javax.swing.JOptionPane.*;

public class fraPP {
    public static void main(String[] args) {
        String innHeltall = showInputDialog("Skriv inn et heltall.");
        String innDesimaltall = showInputDialog("Skriv inn et desimaltall");

        int heltall = Integer.parseInt(innHeltall);
        double desimaltall = Double.parseDouble(innDesimaltall);

        int sum = heltall + (int)desimaltall; // Gjør om desimaltall til heltall

        String ask = showInputDialog("Do you think your sum is bigger than 111.5?");


        if (ask != "no" && sum >= 111.5 || ask != "yes" && sum <= 111.5) {
            showMessageDialog(null, "Your sum was "+ sum + " so you were right!");
        } else {
            showMessageDialog(null, "Your sum was " + sum +" so you were wrong.");
        }

    }
}
