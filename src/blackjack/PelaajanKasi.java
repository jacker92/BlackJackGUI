package blackjack;


import java.util.ArrayList;
import java.util.List;

public class PelaajanKasi {
    
    public List<Kortti> kortit = new ArrayList<Kortti>();
    
    
    public void otaKortti(Kortti kortti) {
        kortit.add(kortti);
    }
    
    public Kortti getKortti (int index) {
       return kortit.get(index);
    }
    
    public void PoistaKortit () {
        kortit.clear();
        }
    
    public int selvitaSumma() {
        int summa = 0;
        int aces = 0;
        for (int i = 0; i < kortit.size(); i++) {
            if (kortit.get(i).getArvo() == 11 || kortit.get(i).getArvo() == 12 || kortit.get(i).getArvo() == 13) {
                summa += 10;
            }   else if (kortit.get(i).getArvo() == 1) {
                summa += 11;
                aces++;
            }   else    {
                summa += kortit.get(i).getArvo();
        }
        
    }
        for (int i = 0; i < kortit.size(); i++) {
            if (aces > 0) {
                if (summa > 21) {
                    summa -= 10;
                    aces--;
                }
            }
        }
        
        return summa;
    }
    
    public boolean isBlackJack() {
       if (kortit.size() == 2) {
           if (PelaajanKasi.this.selvitaSumma() == 21) {
               return true;
           } 
       } 
       return false;
}
    
    
    
}
