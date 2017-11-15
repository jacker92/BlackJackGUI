package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Korttipakka {
    
    public List<Kortti> pakka = new ArrayList<Kortti>();
    
public Korttipakka (int pakkojenMaara) {
    
    for (int i = 0; i < pakkojenMaara; i++) { 
        lisaaPakka();
    }    
}

public void sekoita() {
    Collections.shuffle(pakka);
}

public void lisaaPakka() {
    
     for (int j = 1; j < 14; j++) {   
         
     pakka.add(new Kortti("hertta", j, "pelikortit\\hertta"  + j + ".png"));
     pakka.add(new Kortti("pata", j, "pelikortit\\pata"  + j + ".png"));
     pakka.add(new Kortti("ruutu", j, "pelikortit\\ruutu"  + j + ".png"));
     pakka.add(new Kortti("risti", j, "pelikortit\\risti"  + j + ".png"));
   
    } 
}

public Kortti jaaKortti() {
   return pakka.remove(0);
}
}
