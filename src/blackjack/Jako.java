package blackjack;

import blackjack.PelaajanKasi;
import java.util.ArrayList;
import java.util.List;

public class Jako {
    
 public List <PelaajanKasi> lista= new ArrayList<PelaajanKasi>();
 String pelaajankasi;
 String vastustajankasi;
 String voittaja;
 

 
 public Jako (String pelaajankasi, String vastustajankasi, String voittaja) {
     this.pelaajankasi = pelaajankasi;
     this.vastustajankasi = vastustajankasi;
     this.voittaja = voittaja;
 }
 
 public String toString() {
     String mjono = "";
     mjono = "Pelaaja:  " + pelaajankasi + "  Jakaja:  " + vastustajankasi + "  Voittaja:  " + voittaja;
     return mjono;
 }
}
