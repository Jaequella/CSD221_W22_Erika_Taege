/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Date;

/**
 *
 * @author Jaequella
 */
public class Magazine extends Publication{
    private int orderQty = 10;
    private Date currIssue;
    
    public Magazine(String title, double price,String curIssue, int copies){
        super.setTitle(title);
        super.setPrice(price);
        super.setCopies(copies);
    }
    public void adjustQty(int n){
        
    }
    public void receiveNewIssue(Date newIssue){
        currIssue = newIssue;
    }
    public String toString(){
        return (String.format("Issue: %t\nQuantity: %d\n", currIssue ,orderQty,super.ToString()));
    }
}
