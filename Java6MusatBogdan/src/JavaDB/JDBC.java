/*
 JavaDB Class
 */
package JavaDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bogdan
 */
public class JDBC {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
 String user = "Bogdan";
 String password = "dinamo";
 //String url = "jdbc:derby://localhost:1527/seconddb;create=true";
 String url = "jdbc:derby://localhost:1527/FIRSTDB;create=true";
 String driver = "org.apache.derby.jdbc.ClientDriver";
 Connection connection = null;
 Statement statement = null;
 ResultSet resultSet = null;
 
   try
 {
 Class driverClass = Class.forName(driver);
 connection = DriverManager.getConnection(url, user, password);
 statement = (Statement) connection.createStatement();
 //statement.execute("CREATE TABLE FIRSTTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))");
 //statement.execute("INSERT INTO FIRSTTABLE VALUES (10,'TEN'),(20,'TWENTY'),(30,'THIRTY')");
 resultSet = statement.executeQuery("SELECT * FROM FIRSTTABLE");

 String currentID = "";
 String currentName = "";
 System.out.println("ID NAME");
 System.out.println("==========");
 while(resultSet.next()){
 currentID = resultSet.getString(1);
 currentName = resultSet.getString(2);
 System.out.println(currentID +""+currentName);
 }
 }
  catch (Exception ex){
  ex.printStackTrace();
  }
   
 
   }

}




    