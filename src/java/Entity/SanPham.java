/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class SanPham implements Ientity{

    private int id;
    private String itemcode;
    private String itemname;
    private String itemimage;
    private ArrayList<Double> itemprice;
    private String description;
    private ArrayList<String> itemcontain;
    private String itemtype;

    public SanPham() {
    }

    public SanPham(int id, String itemcode, String itemname, String itemimage, ArrayList<Double> itemprice, String description, ArrayList<String> itemcontain, String itemtype) {
        this.id = id;
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.itemimage = itemimage;
        this.itemprice = itemprice;
        this.description = description;
        this.itemcontain = itemcontain;
        this.itemtype = itemtype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemimage() {
        return itemimage;
    }

    public void setItemimage(String itemimage) {
        this.itemimage = itemimage;
    }

    public ArrayList<Double> getItemprice() {
        return itemprice;
    }

    public void setItemprice(ArrayList<Double> itemprice) {
        this.itemprice = itemprice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getItemcontain() {
        return itemcontain;
    }

    public void setItemcontain(ArrayList<String> itemcontain) {
        this.itemcontain = itemcontain;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }
    

}
