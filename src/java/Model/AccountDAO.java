/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DButil.DbManager;
import Entity.Account;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.naming.java.javaURLContextFactory;

/**
 *
 * @author dell
 */
public class AccountDAO extends DAO<Account> implements IDAO<Account>{

    public AccountDAO() {
    }

    public Account getuser(String username, String password) {
        try {
            String sql = "select * from  Account where username=? and password=?";
            PreparedStatement pre = DbManager.connection.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet re = pre.executeQuery();
            while (re.next()) {
                Account acc = new Account(re.getInt(1), re.getString(2), re.getString(3));
                return acc;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Account> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
