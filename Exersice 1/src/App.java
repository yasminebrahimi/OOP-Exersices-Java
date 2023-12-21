import data.Tiskikone;

public class App {
    public static void main(String[] args) throws Exception {

        Tiskikone tiskikone1 = new Tiskikone(); 
        Tiskikone tiskikone2 = new Tiskikone(); 


        tiskikone1.setId(1);
        tiskikone1.setMalli("a");
        tiskikone1.setMerkki("b");
        tiskikone1.setPersuohjelma("c");

        tiskikone2.setId(2);
        tiskikone2.setMalli("z");
        tiskikone2.setMerkki("y");;
        tiskikone2.setPersuohjelma("x");

       
        tulosta(tiskikone1); 
        tulosta(tiskikone2); 
    }
        public static void  tulosta (Tiskikone tiskikone){
            System.out.println(tiskikone.getId()); 
            System.out.println(tiskikone.getMalli()); 
            System.out.println(tiskikone.getMerkki()); 
            System.out.println(tiskikone.getPersuohjelma());  

 
    }
   }

