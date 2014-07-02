/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author elijameslennox
 */
public abstract class Customer implements Comparable<Customer> {
    public int customerID;
    public String customerName;
    public String address;
    public String type;
    

    
    public Customer(){

        

    };
    public Customer(int customerID, String customerName, String address, String type){
        this.customerID=customerID;
        this.customerName=customerName;
        this.address=address;
        this.type=type;
        
        
    }
    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the creditLimit
     */
    @Override
        public int compareTo(Customer customer) {
        if (this.customerID < customer.customerID) {
            return -1;
        } else if (this.customerID > customer.customerID) {
            return 1;
        } else {
            return 0;
        }
    }

    
    

}
