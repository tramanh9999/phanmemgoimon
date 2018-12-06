/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DButil.DbManager;
import Entity.Table;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class TableDAO extends DAO<Table> implements IDAO<Table> {

    @Override
    public ArrayList<Table> all() {
        ArrayList<Table> list = new ArrayList<>();
        try {
            String sql = "Select * from Ban";
            PreparedStatement pre = DbManager.connection.prepareStatement(sql);
            ResultSet re = executeQuerry(pre);
            Table t = new Table();
            while (re.next()) {
                t = new Table(re.getInt(1), re.getString(2));
                list.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        }
    
    public static void main(String[] args) {
        System.out.println(new TableDAO().all().get(1).getTableName());
    }

}
