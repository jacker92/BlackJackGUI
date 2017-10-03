
package tietovarastot;

public class Tietovarastovirhe extends Exception {

  public Tietovarastovirhe(String viesti, Throwable syy) { 
    super(viesti, syy); 
  }
  public Tietovarastovirhe(Throwable syy) { 
    super(syy); 
  }

  public Tietovarastovirhe(String viesti) {
    super(viesti);
  }
}
