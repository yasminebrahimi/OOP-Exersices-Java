import java.util.Scanner;

import data.Tiskikone;

public class App {
    public static void main(String[] args) throws Exception {
        


        Tiskikone tiskikone1 = new Tiskikone(); 
        Tiskikone tiskikone2 = new Tiskikone(); 

        lue(tiskikone1); 
        lue(tiskikone2); 


        Tulosta(tiskikone1);
        Tulosta(tiskikone2);
        
    }


    public static void lue (Tiskikone tiskikone){
        Scanner lukija = new Scanner(System.in); 

        System.out.println("Syötä tiskikoneen tiedot:");
        System.out.print("ID: ");
        int id = lukija.nextInt();
        tiskikone.setId(id); 

        lukija.nextLine(); // Tyhjentää rivinvaihdon, joka jää näppäinkomennoista

        System.out.print("Merkki: ");
        String merkki = lukija.nextLine();
        tiskikone.setMerkki(merkki);

        System.out.print("Malli: ");
        String malli = lukija.nextLine();
        tiskikone.setMalli(malli);

        System.out.print("Pesuohjelma: ");
        String pesuohjelma = lukija.nextLine();
        tiskikone.setPesuohjelma(pesuohjelma);

    }


    public static void Tulosta (Tiskikone tiskikone){
        System.out.println(tiskikone.getId()); 
        System.out.println(tiskikone.getMalli()); 
        System.out.println(tiskikone.getMerkki()); 
        System.out.println(tiskikone.getPesuohjelma()); 
        System.out.println();
    }


}
