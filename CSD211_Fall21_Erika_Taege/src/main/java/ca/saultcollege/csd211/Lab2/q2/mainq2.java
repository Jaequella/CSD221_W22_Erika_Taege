/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab2.q2;

import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class mainq2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Please enter your degrees in farenheit;");
        Scanner input = new Scanner(System.in);
        String farenheit = input.next();
        double farenheitInt = Double.parseDouble(farenheit);
        double celcius =(farenheitInt-32)*5/9;
        System.out.println("Your temprature in celcius is;" + celcius);
    }
    
}
