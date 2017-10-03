package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Korttipakka {
    
    public List<Kortti> pakka = new ArrayList<Kortti>();
    
public Korttipakka (int pakkojenMaara) {
    
    // Lisätään pakkaan kaikki
    
    for (int i = 0; i < pakkojenMaara; i++) {     
    for (int j = 1; j < 14; j++) {    
        
     pakka.add(new Kortti("hertta", j, "C:\\Users\\s1700306\\Documents\\NetBeansProjects\\Blackjack\\pelikortit\\hertta"  + j + ".png"));
     pakka.add(new Kortti("pata", j, "C:\\Users\\s1700306\\Documents\\NetBeansProjects\\Blackjack\\pelikortit\\pata"  + j + ".png"));
     pakka.add(new Kortti("ruutu", j, "C:\\Users\\s1700306\\Documents\\NetBeansProjects\\Blackjack\\pelikortit\\ruutu"  + j + ".png"));
     pakka.add(new Kortti("risti", j, "C:\\Users\\s1700306\\Documents\\NetBeansProjects\\Blackjack\\pelikortit\\risti"  + j + ".png"));
   
    } 
    }
    
}

public void sekoita() {
    Collections.shuffle(pakka);
}

public void lisaaPakka() {
    
     for (int j = 1; j < 14; j++) {   
         
     pakka.add(new Kortti("hertta", j, "C:\\Users\\s1700306\\Documents\\NetBeansProjects\\Blackjack\\pelikortit\\hertta"  + j + ".png"));
     pakka.add(new Kortti("pata", j, "C:\\Users\\s1700306\\Documents\\NetBeansProjects\\Blackjack\\pelikortit\\pata"  + j + ".png"));
     pakka.add(new Kortti("ruutu", j, "C:\\Users\\s1700306\\Documents\\NetBeansProjects\\Blackjack\\pelikortit\\ruutu"  + j + ".png"));
     pakka.add(new Kortti("risti", j, "C:\\Users\\s1700306\\Documents\\NetBeansProjects\\Blackjack\\pelikortit\\risti"  + j + ".png"));
   
    } 
}

public Kortti jaaKortti() {
    
   Kortti apukortti = pakka.get(0);
   pakka.remove(0);
   return pakka.get(0);
}
}
