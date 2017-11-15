
package tietovarastot;

import yhteydenhallinta.YhteydenHallinta;
import java.sql.*;
import java.util.*;
import blackjack.Jako;
import java.io.IOException;
import java.io.InputStream;

public class Tietovarasto {
    
  private String ajuri;
  private String url;
  private String kayttaja;
  private String salasana;
  
  //sql-lauseet 
  private String sqlHaeKaikkiJaot="select pelaajankasi,vastustajankasi, voittaja from blackjack";
  private String sqlHaeVoittaja = "select voittaja from blackjack";
  private String sqlAddRound="insert into blackjack (pelaajankasi, vastustajankasi, voittaja) values (?,?,?)";
  
   public Tietovarasto() {
        getProperties(); 
    }

    private void getProperties() {
        Properties prop = new Properties();
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("yhteydenhallinta/connectionInfo.properties");
            prop.load(input);
            
            ajuri = prop.getProperty("ajuri");
            url = prop.getProperty("url");
            kayttaja = prop.getProperty("kayttaja");
            salasana = prop.getProperty("salasana");
 
        } catch (IOException e) {
            System.out.println("exception");
        }
    }
 
  public void lisaaJako(String pelaaja, String jakaja, String voittaja) throws Tietovarastovirhe {
       Connection yhteys=null;
       try {
        yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
      }
      catch (Exception e) {
        throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
      }
      PreparedStatement jaonlisays=null;
      try {
        jaonlisays=yhteys.prepareStatement(sqlAddRound);
        jaonlisays.setString(1, pelaaja);
        jaonlisays.setString(2, jakaja);
        jaonlisays.setString(3, voittaja);
        jaonlisays.executeUpdate();
      }
      catch (SQLException sqle) {
        sqle.printStackTrace();
        throw new Tietovarastovirhe("Jaon lisäys ei onnistunut", sqle);
      }
      finally {
        YhteydenHallinta.suljeLause(jaonlisays);
        YhteydenHallinta.suljeYhteys(yhteys);
      }
  }
  
  public List<Jako> haeKaikkiJaot() throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement haeKaikkiJaot=
            null;
    ResultSet tulos=
            null;
    try {
      List<Jako> apulista=new ArrayList<Jako>();
      haeKaikkiJaot=yhteys.prepareStatement(sqlHaeKaikkiJaot);
      tulos=haeKaikkiJaot.executeQuery();
      while (tulos.next()) {
        apulista.add(new Jako(tulos.getString(1),   
                              tulos.getString(2),
                              tulos.getString(3)));
      }
     
      return apulista;
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Henkilon haku epäonnistui", sqle);
    }
    finally {
      YhteydenHallinta.suljeTulosjoukko(tulos);
      YhteydenHallinta.suljeLause(haeKaikkiJaot);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }
  
    public List<String> haeVoittaja() throws Tietovarastovirhe {
    Connection yhteys=null;
    try {
      yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, kayttaja, salasana);
    }
    catch (Exception e) {
      throw new Tietovarastovirhe("Tietovarasto ei ole auki", e);
    }
    PreparedStatement haeKaikkiJaot=
            null;
    ResultSet tulos=
            null;
    try {
      List<String> apulista=new ArrayList<String>();
      haeKaikkiJaot=yhteys.prepareStatement(sqlHaeKaikkiJaot);
      tulos=haeKaikkiJaot.executeQuery();
      while (tulos.next()) {
        apulista.add(tulos.getString(3));
      }
     
      return apulista;
    }
    catch (SQLException sqle) {
      throw new Tietovarastovirhe("Voittajan haku epäonnistui", sqle);
    }
    finally {
      YhteydenHallinta.suljeTulosjoukko(tulos);
      YhteydenHallinta.suljeLause(haeKaikkiJaot);
      YhteydenHallinta.suljeYhteys(yhteys);
    }
  }


}