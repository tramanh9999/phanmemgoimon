package DButil;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//
///**
// *
// * @author dell
// */
//public class DbManager {
//
//    public static Connection connection = null;
//    public static String connectURL = "";
//    public static String pass = "";
//    public static String userID = "";
//
//    public Connection getConnention() {
//
//        try {
//            if (connection != null) {
//                return connection;
//            }
//            connectURL = "jdbc:mysql:///node194395-quanlyorder1.jelastic.servint.net/:3306/sonoo";
//            userID = "root";
//            pass = "RPTlst81161";
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            return DriverManager.getConnection(connectURL, userID, pass);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
//    public DbManager() {
//        DbManager.connection = getConnention();
//    }
//    
//    public static void main(String[] args) {
//        new DbManager();
//    }
//}

//}
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DbManager {

    public static Connection connection = null;

    public DbManager() throws IOException, ClassNotFoundException, SQLException {
        connection = createConnection();
    }

    public Connection createConnection() throws IOException, ClassNotFoundException, SQLException {
        if (connection != null) {
            return connection;
        }
        Properties prop = new Properties();
        System.out.println("test");
        prop.load(new FileInputStream(System.getProperty("user.home") + "/mydb.cfg"));
        System.out.println("user.home: " + System.getProperty("user.home"));
        String host = prop.getProperty("host").toString();
        String username = prop.getProperty("username").toString();
        String password = prop.getProperty("password").toString();
        String driver = prop.getProperty("driver").toString();

        System.out.println("host: " + host + "\nusername: " + username + "\npassword: " + password
                + "\ndriver: " + driver);
        Class.forName(driver);
        System.out.println("--------------------------");
        System.out.println("DRIVER: " + driver);

        connection = DriverManager.getConnection(host, username, password);
        System.out.println("CONNECTION: " + connection);
        return connection;
    }
}
