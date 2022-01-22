
package DataBase;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DBconnect 
{
  public static Connection connect()
  {
      Connection conn = null;
      
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","root");
                 
      }
      catch (Exception e1)
      {
          System.out.println(e1);
      }
      return conn;
  }
}
