/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author Jaequella
 */
public class Publication {
   private String title;
   private double price;
   private int copies;
   
   public Publication(){
       
   }
   public String getTitle(){
       return title;
   }
   public void setTitle(String title){
       this.title = title;
   }
   public double getPrice(){
       return price;
   }
   public void setPrice(double price){
       this.price = price;
   }
   public int getCopies(){
       return copies;
   }
   public void setCopies(int copies){
       this.copies = copies;
   }
   public void sellCopy(){
       
   }
   public String ToString(){
       return String.format("Title: %s\n Price:%.2f\nCopies:%d", title,price,copies);
   }
   
}
