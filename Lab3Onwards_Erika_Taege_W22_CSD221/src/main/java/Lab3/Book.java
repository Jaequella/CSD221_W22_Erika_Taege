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
public class Book extends Publication {
    private String author;
    
    public Book(String author,String title,double price){
        this.author = author;
        super.setTitle(title);
        super.setPrice(price);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void orderCopies(int numCopies){
        super.setCopies(numCopies + super.getCopies());
    }
    public String ToString(){
        return String.format("Author: %s\n%s",author,super.ToString());
    }
}
