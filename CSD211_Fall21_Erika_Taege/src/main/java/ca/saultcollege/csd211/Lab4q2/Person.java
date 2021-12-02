/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab4q2;


/**
 *
 * @author Jaequella
 */
public class Person {
    // Attributes of a person
    // defined as instance variables
    private String firstname;
    private String lastname;
    //All that is needed for cars.
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

    }
    @Override
    public String toString() {
        return firstname+" "+lastname;
    }


    
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}


