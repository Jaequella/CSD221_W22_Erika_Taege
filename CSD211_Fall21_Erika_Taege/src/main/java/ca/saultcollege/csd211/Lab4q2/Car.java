/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ca.saultcollege.csd211.Lab4q2.Person;



/**
 *
 * @author Jaequella
 */
public class Car {
    private String Make;
    private String Model;
    private int Year;
    private Person Owner;
    private String VIN;
    public Car(String Make, String Model, int Year, String Owner, String VIN){
        
    }
    public String getMake() {
        return Make;
    }
     public void setMake(String Make){
        this.Make = Make;
    }
     public String getModel() {
        return Model;
    }
     public void setModel(String Model){
        this.Model = Model;
    }
     public int getYear() {
        return Year;
    }
     public void setYear(int Year) {
        this.Year = Year;
    }
    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
}
