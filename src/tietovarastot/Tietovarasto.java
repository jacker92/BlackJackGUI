//IH 2009
//koodaus UTF-8

package tietovarastot;

import blackjack.Kortti;
import yhteydenhallinta.YhteydenHallinta;
import blackjack.PelaajanKasi;
import java.sql.*;
import java.util.*;
import blackjack.Jako;

/**
 *
 * @author IH
 */
public class Tietovarasto {
  //näitä ei normaalisti pidä kovakoodata tänne!
  private String ajuri="org.apache.derby.jdbc.EmbeddedDriver";
  private String url="jdbc:derby://localhost:1527/blackjack";
  private String kayttaja="saku";
  private String salasana="salainen";
  //sql-lauseet 

  private String sqlHaeKaikkiJaot="select pelaajankasi,vastustajankasi, voittaja from blackjack";
  private String sqlHaeVoittaja = "select voittaja from blackjack";


  private String sqlAddRound="insert into blackjack (pelaajankasi, vastustajankasi, voittaja) values (?,?,?)";
 
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