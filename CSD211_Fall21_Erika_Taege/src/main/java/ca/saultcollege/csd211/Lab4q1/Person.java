/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab4q1;

/**
 *
 * @author Jaequella
 */
public class Person {
    // Attributes of a person
    // defined as instance variables
    private int age;
    private int height; // in cm
    private int weight ;//  in kg 
    private String firstname;
    private String lastname;
    private char gender;
    public Person(String firstname, String lastname, int age, char gender) {
        
     }

    Person(String joe, String student, int i, char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
        return firstname+" "+lastname;
    }


    public int getAge() {
        return age;
    }
     public void setAge(int age) {
        this.age = age;
    }
     public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}


