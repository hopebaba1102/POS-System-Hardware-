/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author elijameslennox
 */
public class CustomerDatabase {

    public static ArrayList<Customer> customer=new ArrayList<Customer>();

    //reads customer information from file, instantiates customer & populates customer's variables
    public void loadCustomer() throws FileNotFoundException, IOException{
        try{
        
            //invokes buffered reader to read file
            BufferedReader read=new BufferedReader(new FileReader("Customer.csv"));
            
            String line=read.readLine();
            StringTokenizer nextItem=null;
                   
            Customer cust=new CashCustomer();
            customer.add(cust);
            //EOF loop to read file and calculate variables
            while(line!=null){
               
                nextItem=new StringTokenizer(line, ",");
                
                while(nextItem.hasMoreTokens()){
                //assigns file data to variables to be displayed and used
                //in calculations
                int customerNumber=Integer.parseInt(nextItem.nextToken());
                String customerName=nextItem.nextToken();
                String address=nextItem.nextToken();
                String type=(nextItem.nextToken()).trim();
                
                String credit="CreditCustomer";
                String cash="CashCustomer";
                
                if(type.equalsIgnoreCase(credit)){
                    CreditCustomer dope=new CreditCustomer(customerNumber, customerName, address, type);


                    customer.add((CreditCustomer)dope);}
                else if(type.equalsIgnoreCase(cash)){
                    CashCustomer smarty=new CashCustomer(customerNumber, customerName, address, type);

                    
                    customer.add((CashCustomer)smarty);
                }
                else{
                    continue;
                }
                   

                
                //primes pump for next line
                line = read.readLine();
                }
                //Collections.sort(CustomerDatabase.customer);
            }
            read.close();//closes buffered reader
            
    }catch(FileNotFoundException fnfe){
        System.out.printf("Sorry, the file appears to be missing.  Please contact IT.");
    }catch(IOException ioe){
        System.out.printf("An error has occurred.  Please contact IT.");
    }catch(Exception e){
        System.out.printf("General error: please contact IT");
    }finally{}

    }
    
    public int customerEntry(){

            Scanner input=new Scanner(System.in);
            System.out.printf("\nPlease enter a customer number: \n");
            String entry=input.next();
            String str2=entry.trim();
            int result=Integer.parseInt(str2);
        
        return result;
                
    }
    
    public void list(){
        Customer p;

        for(int i=0; i<customer.size(); i++){
            p=customer.get(i);
        }
    }
    
    //searches for customer's index on customer arraylist
    public int searchCustomer(int searchedCustomer){
        int result=-1;
        Iterator iterate=customer.iterator();
            while(iterate.hasNext()){
                Object temp;
                temp=iterate.next();
                int sCustomerID=((Customer)temp).getCustomerID();
                if(sCustomerID==searchedCustomer){
                    
                        result=customer.indexOf(temp);
                    }
            
        }
        
        return result;
    }


    

    //determines if cash or credit customer
   public boolean creditCustomer(int customerID){
        boolean credit=false;
        if(customer.get(customerID) instanceof CreditCustomer){
            credit=true;
        }
        return credit;
    }
    
    

    
    //approves transaction based on final price and credit limit (if credit customer)
    public boolean approveTransaction(int customerLocation, double creditLimit, double finalPrice){
        boolean approved=false;
        if((customer.get(customerLocation) instanceof CashCustomer)||((customer.get(customerLocation) instanceof CreditCustomer) && (creditLimit>=finalPrice))){
            approved=true;
        }
        
        return approved;
    }

        
   
    
}


