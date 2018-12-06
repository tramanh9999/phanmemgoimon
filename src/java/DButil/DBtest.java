package DButil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author dell
 */
public class DBtest {

    public static Connection connection = null;
    public static String connectURL = "";
    public static String pass = "";
    public static String userID = "";

    public DBtest() {

        connection = getConnention();
    }

    public Connection getConnention() {

        try {
            if (connection != null) {
                return connection;
            }
            connectURL = "jdbc:sqlserver://localhost:1433;databaseName=quanlyorder";
            userID = "sa";
            pass = "123456";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectURL, userID, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBtest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBtest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}

//
//
//package Model;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Properties;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public final class DbManager {
//
//    private final static String createTable = "CREATE TABLE `example` (id INT, data VARCHAR(100))";
//    public static Connection connection  = null;
//
//    public DbManager() throws IOException, ClassNotFoundException, SQLException {
//        connection = createConnection();
//    }
//    public Connection createConnection() throws IOException, ClassNotFoundException, SQLException {
//        if (connection != null) {
//            return connection;
//        }
//        Properties prop = new Properties();
//        System.out.println("test");
//        prop.load(new FileInputStream(System.getProperty("user.home") + "/mydb.cfg"));
//        System.out.println("user.home: " + System.getProperty("user.home"));
//        String host = prop.getProperty("host").toString();
//        String username = prop.getProperty("username").toString();
//        String password = prop.getProperty("password").toString();
//        String driver = prop.getProperty("driver").toString();
//
//        System.out.println("host: " + host + "\nusername: " + username + "\npassword: " + password
//                + "\ndriver: " + driver);
//        Class.forName(driver);
//        System.out.println("--------------------------");
//        System.out.println("DRIVER: " + driver);
//
//        connection = DriverManager.getConnection(host, username, password);
//        System.out.println("CONNECTION: " + connection);
//        return connection;
//    }
//
//    public void runSqlStatement() {
//        try {
//            Statement statement = createConnection().createStatement();
//            boolean rs = statement.execute(createTable);
//        } catch (IOException ex) {
//            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
//}
