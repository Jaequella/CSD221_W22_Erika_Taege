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
public class CashTill {
    private double runningTotal;
    CashTill(){
        runningTotal = 0;
    }
    public void sellItem(Publication pPub){
        runningTotal = runningTotal + pPub.getPrice();
        pPub.sellCopy();
        System.out.println("Sold "+ pPub + " @ "+ pPub.getPrice() + "\nSubtotal = "+ runningTotal);
    }
    public void showTotal(){
        System.out.println("Grand Total: " + runningTotal);
    }
    public void sellItem(SaleableItem p){
        runningTotal = runningTotal + p.getPrice();
        p.sellCopy();
        System.out.println("Sold "+ p + " @ "+ p.getPrice() + "\nSubtotal = "+ runningTotal);
    }
    public void saleType(SaleableItem pSelb){
        if (pSelb instanceof Publication){
            System.out.println("This is a publication.");
        }
        else if (pSelb instanceof Ticket){
            System.out.println("This is a Ticket");
        }
        else{
            System.out.println("This is a unknown sale type");
        }
    }
}
