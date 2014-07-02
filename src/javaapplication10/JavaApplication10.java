/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elijameslennox
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        AMenu switchboard=new AMenu();
        Items oItem=new Items();
        CustomerDatabase db=new CustomerDatabase();
        try {
            //loads customer
            db.loadCustomer();
            //prepares inventory 
            oItem.initInventory();
            //prepares items
            oItem.initItems();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication10.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            switchboard.setVisible(true);
        }
        
        

        
        
        
    }
}
