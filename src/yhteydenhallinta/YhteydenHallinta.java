//IH 2009
//koodaus UTF-8

package yhteydenhallinta;
import java.sql.*;

public class YhteydenHallinta {

  
    public static Connection avaaYhteys(String ajuri, String url, String kayttajatunnus, String salasana) throws Exception {
      try {
        Class.forName(ajuri).newInstance();
        return DriverManager.getConnection(url, kayttajatunnus, salasana);
      }
      catch (SQLException sqle) {
        throw new Exception("Yhteyden avaaminen ei onnistunut", sqle);
      }
      catch (ClassNotFoundException e) {
        throw new Exception("Ajuria ei löytynyt", e);
      }
    }

    
    public static boolean suljeYhteys(Connection yhteys) {
      if (yhteys!=null) {
        try {
          yhteys.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      else {
        return false;
      }
    }

    
    public static boolean suljeLause(Statement suljettavaLause) {
      if (suljettavaLause!=null) {
        try {
          suljettavaLause.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      return false;
    }
    
    
    public static boolean suljeTulosjoukko(ResultSet suljettavaTulosjoukko) {
      if (suljettavaTulosjoukko!=null) {
        try {
          suljettavaTulosjoukko.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      return false;
    }
}
