/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author elijameslennox
 */
public class Inventory implements Comparable<Inventory> {
    
    private int itemID;
    private int quantityInStock;
    
    public Inventory(){};
    
    public Inventory(int itemID, int quantityInStock){
        this.itemID=itemID;
        this.quantityInStock=quantityInStock;
    }
    
    

    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the quantityInStock
     */
    public int getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * @param quantityInStock the quantityInStock to set
     */
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    @Override
    public int compareTo(Inventory inventory) {
        if (this.itemID < inventory.itemID) {
            return -1;
        } else if (this.itemID > inventory.itemID) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
