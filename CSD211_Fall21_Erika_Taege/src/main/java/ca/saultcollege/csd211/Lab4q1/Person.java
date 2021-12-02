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
    private double height; // in cm
    private double weight ;//  in kg 
    private String firstname;
    private String lastname;
    private char gender;
    

    public Person(String firstname, String lastname,int age, double height, double weight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
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
     public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
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


