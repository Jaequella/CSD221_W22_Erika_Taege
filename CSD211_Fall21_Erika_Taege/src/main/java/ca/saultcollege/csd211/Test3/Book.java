/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Test3;

/**
 *
 * @author Jaequella
 */
public class Book {

    //Instanced variables, declaired before anything
    private String name;
    private String authName;
    private String ISBN;
    private String publishedDate;
    //class variable COUNT
    private int COUNT;
    
    public Book(){ //Declaire standard variables in case nothing is claimed in place.
    this.name="No Name Provided";
    this.authName="No Author Provided";
    this.ISBN="No ISBN Provided";
    this.publishedDate="No Date Published Provided";
    this.COUNT++;
    }
    
    public Book(String name,String authName,String ISBN,String publishedDate){
    this.name=name;
    this.authName=authName;
    this.ISBN=ISBN;
    this.publishedDate=publishedDate;
    this.COUNT++; //increase count
    }
    public boolean equals(Object obj){
    Book sampler;
    if (obj instanceof Book)
        sampler=(Book)obj;
    else
        return false;
    
    if (this == obj)
        return true;
    
    if(this.getISBN().equals(sampler.getISBN()))
        return true;
    
    return false;
    }
    
    //Get Set Method time
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAuthName() {
        return authName;
    }

    /**
     * @param authName the name to set
     */
    public void setAuthName(String authName) {
        this.authName = authName;
    }
    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the publishedDate
     */
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * @param publishedDate the publishedDate to set
     */
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * @return the COUNT
     */
    public int getCOUNT() {
        return COUNT;
    }

    /**
     * @param COUNT the COUNT to set
     */
    public void setCOUNT(int COUNT) {
        this.COUNT = COUNT;
    }
}
