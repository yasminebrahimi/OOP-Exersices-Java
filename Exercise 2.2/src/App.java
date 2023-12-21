import data.Tuomari;

public class App {
    public static void main(String[] args) throws Exception {
        



        Tuomari tuomari1 = new Tuomari(1, "Matti Meikäläinen", "Suomi"); 
        Tuomari tuomari2 = new Tuomari(); 


        tuomari2.setId(2);
        tuomari2.setMaa("Ruotsi");
        tuomari2.setNimi("Adam");


        tulosta(tuomari1); 
        tulosta(tuomari2);

    }

    public static void tulosta (Tuomari tuomari){
        System.out.println(tuomari.getId());
        System.out.println(tuomari.getMaa());
        System.out.println(tuomari.getNimi());
        System.out.println();
    }
}
