// Merk at dette er to forskjelige kodesegmenter som ikke henger sammen. De vil ikke fungere sammen. 

//- skrive kode som lager nye objekter

public class Lagernyeklasser
{
    private klasseduplisering state1; 
    private klasseduplisering state2;
                                                // Denne koden lager nye objekter fra klassen "Lagernyeklasser"
public Lagernyeklasser()                        // Den utfører constructoren i klassen 
{
    state1 = new klasseduplisering(1);
    state2 = new klasseduplisering(2);

// Kode som henter inn eksterne og interne metoder
// kode insipirert av Code Academy - Object Oriented Java Course. 
    public class butikk {
 
        String produktType;
        
       //Dette er constructoren
        public butikk(String produkt) {
          produktType = produkt;
        }
        
        public void reklamere() {
              System.out.println("Selger " + produktType);
          System.out.println("Kom å kjøp");
        }
        
        public static void main(String[] args) {
          butikk bananButikk = new butikk("Banan Butikk");
        bananButikk.reklamere(); // henter inn eksterne metoder
        bananButikk.reklamere();
        }
      }