package blackjack;

public class Kortti {
    
    String maa;
    int arvo;
    String kuvapolku;
    
    public Kortti (String maa, int arvo, String kuvapolku) {
        this.maa = maa;
        this.arvo = arvo;
        this.kuvapolku = kuvapolku;
    }
    
    public void setMaa(String maa) {
        this.maa = maa;
    }
    
    public void setArvo() {
        this.arvo = arvo;
    }
    
    public String getKuvaPolku() {
        return kuvapolku;
    }
    
    public String getMaa() {
        return maa;
    }
    
    public int getArvo() {
        return arvo;
    }
    
    public String toString() {
        String tulostettavaArvo = "";
        
        if (arvo == 11) {
            tulostettavaArvo = "j";
        }   else if (arvo == 12) {
            tulostettavaArvo = "q";
        }   else if (arvo == 13) {
            tulostettavaArvo = "k";
        }   else if (arvo == 1) {
            tulostettavaArvo = "1";
        }   else    {
            tulostettavaArvo = arvo + "";
        }
        return maa + tulostettavaArvo;
    }
    

}
