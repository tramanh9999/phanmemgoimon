/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DButil.DBtest;
import DButil.DbManager;
import Entity.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SanPhamDAO extends DAO<SanPham> {

    public SanPhamDAO() {
    }

    public ArrayList<SanPham> all() {
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            String sql = "select * from Sanpham";
            Statement st = DbManager.connection.createStatement();
            ResultSet re = st.executeQuery(sql);

            while (re.next()) {
                int id = re.getInt(1);
                String itemcode = re.getString(2);
                String itemname = re.getString(3);
                String image = re.getString(4);

                String priceStrlist = re.getString(5);
                ArrayList<Double> priceDoubleList = devidePriceList(",", priceStrlist);
                String description = re.getString(6);
                ArrayList<String> containList = devideContainList(",", re.getString(7));
                String type = re.getString(8);
                SanPham sp = new SanPham(id, itemcode, itemname, image, priceDoubleList, description, containList, type);
                list.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<SanPham> getItemlistByType(String type) {
        ArrayList<SanPham> list = new ArrayList<>();
        ArrayList<SanPham> arr = all();

        for (SanPham sp : arr) {
            if (sp.getItemtype().equalsIgnoreCase(type.trim())) {
                list.add(sp);
            }
        }
        return list;
    }

    ArrayList<String> devideContainList(String regex, String containString) {
        ArrayList<String> list = new ArrayList<>();

        if (containString == null || containString.trim() == "") {
            return list;
        }
        String[] arr = containString.split(regex);
        for (String a : arr) {
            list.add(a);
        }
        return list;
    }

    ArrayList<Double> devidePriceList(String regex, String priceStrList) {

        String[] arr = priceStrList.split(regex);
        ArrayList<Double> list = new ArrayList<>();
        for (String a : arr) {
            list.add(Double.parseDouble(a));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new SanPhamDAO().all().get(1).getItemname());
    }

}
