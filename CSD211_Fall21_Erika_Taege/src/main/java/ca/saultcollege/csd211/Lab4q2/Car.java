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
    private String VIN;
    private int COUNT;
    public Car(){
    this.Make="Make not assigned";
    this.Model="Model not assigned";
    this.Year=0;
    this.VIN="VIN not assigned";
    }
    
    public Car(String Make, String Model, int Year, String Owner, String VIN){
        this.Make=Make;
        this.Model=Model;
        this.Year= Year;
        this.VIN=VIN;
        this.COUNT++;
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
