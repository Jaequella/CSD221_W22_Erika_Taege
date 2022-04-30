/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Jaequella
 */
public class Ticket implements SaleableItem {
    public Ticket(String description,String name,double prices){
    
    this.description = description;
    }
    public void sellCopy(){
        System.out.println("**************************************");
        System.out.println("*            TICKET VOUCHER          *");
        System.out.println(ToString());
        System.out.println("**************************************");
        System.out.println("");
    }
    public double getPrice(){
        return this.price = price;
    }
}
