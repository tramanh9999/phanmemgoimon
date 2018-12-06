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
public class Table {
    private int tableId;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    private String tableName;

    @Override
    public String toString() {
        return "Table{" + "tableId=" + tableId + ", tableName=" + tableName + '}';
    }

    public Table(int tableId, String tableName) {
        this.tableId = tableId;
        this.tableName = tableName;
    }

    public Table() {
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

   
    
    
    
}
