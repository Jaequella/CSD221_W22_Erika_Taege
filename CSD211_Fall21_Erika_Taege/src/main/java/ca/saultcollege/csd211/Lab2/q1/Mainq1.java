/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab2.q1;

import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class Mainq1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter your degrees in celcius;");
        Scanner input = new Scanner(System.in);
        String celcius = input.next();
        double celciusInt = Double.parseDouble(celcius);
        double farenheit =(9.0/5)*celciusInt+32;
        System.out.println("Your temprature in farenheit is;" + farenheit);
    }
    
}
