/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1.q6;

/**
 *
 * @author Jaequella
 */
public class Person {
    public String FirstName;
    public String LastName;
    public String SSIN;
    private int COUNT;
    public Person(){
    this.FirstName= "No First Name";
    this.LastName= "No Last Name";
    this.SSIN="No SSID Detected";
    }
    public Person(String FirstName,String LastName, String SSIN){
    this.FirstName= FirstName;
    this.LastName= LastName;
    this.SSIN= SSIN;
    this.COUNT++;
    }

    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSSIN() {
        return SSIN;
    }

    public void setSSIN(String SSIN) {
        this.SSIN = SSIN;
    }
    public int getCOUNT() {
        return COUNT;
    }

    public void setCOUNT(int COUNT) {
        this.COUNT = COUNT;
    }
}
