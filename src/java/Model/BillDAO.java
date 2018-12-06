/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Bill;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author dell
 */
public class BillDAO extends DAO<Bill> {
//    ArrayList<Bill> all(){
//        
//    }
//}

    public static void main(String[] args) {
        SimpleDateFormat sq= new SimpleDateFormat("mm ss hh dd/MMM/YYYY");
        System.out.println(sq.format(Calendar.getInstance().getTime()));
    }
}