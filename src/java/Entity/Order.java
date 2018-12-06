/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author dell
 */
public class Order implements Ientity{
    private int id;
    private String tableNo;
    private String itemcode;
    private float quantity;
    private double unitprice;

    public Order() {
    }

    public Order(int id, String tableNo, String itemcode, float quantity, double unitprice) {
        this.id = id;
        this.tableNo = tableNo;
        this.itemcode = itemcode;
        this.quantity = quantity;
        this.unitprice = unitprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableNo() {
        return tableNo;
    }

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    
    
}
