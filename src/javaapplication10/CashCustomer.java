/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 * Creates Cash Customer Object (inherits from Customer Object)
 * @author elijameslennox
 */
public class CashCustomer extends Customer {
    
    private static double CASH_DISCOUNT=.02;

    public CashCustomer(){}
    
    public CashCustomer(int customerID, String customerName, String address, String type){
        this.customerID=customerID;
        this.customerName=customerName;
        this.address=address;
        this.type=type;
    }
    

    
    /**
     * @return the CASH_DISCOUNT
     */
    public static double getCASH_DISCOUNT() {
        return CASH_DISCOUNT;
    }

    /**
     * @param aCASH_DISCOUNT the CASH_DISCOUNT to set
     */
    public static void setCASH_DISCOUNT(double aCASH_DISCOUNT) {
        CASH_DISCOUNT = aCASH_DISCOUNT;
    }
    
}
