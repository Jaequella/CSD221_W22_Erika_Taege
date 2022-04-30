/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Date;

/**
 *
 * @author Jaequella
 */
public class DiscMag extends Magazine{

    public DiscMag(String title, double price,String curIssue, int copies) {
        super(title, price, orderQty, curIssue, copies);
    }
    
    public void receiveNewIssues(Date newIssue){
        
    }
}
