
import data.Kala;

import java.util.Scanner;

public class KalaTaulu {

    public static void main(String[] args) {
        Kala[] taulu = new Kala[3];
        for (int i = 0; i < taulu.length; i++) {
            taulu[i] = new Kala();
            lueKalanTiedot(taulu[i]);
        }

        tulostaKalat(taulu);
    }

    private static void lueKalanTiedot(Kala kala) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä kalan tiedot:");

        System.out.print("ID: ");
        String id = lukija.next();
        kala.setId(id);

        lukija.nextLine(); // Clear the newline

        System.out.print("Laji: ");
        String laji = lukija.nextLine();
        kala.setLaji(laji);

        System.out.print("Paino: ");
        String paino = lukija.next();
        kala.setPaino(paino);
    }

    private static void tulostaKalat(Kala[] taulu) {
        System.out.println("Kalat:");
        for (int i = 0; i < taulu.length; i++) {
            System.out.println(taulu[i]);
        }
    }
}
