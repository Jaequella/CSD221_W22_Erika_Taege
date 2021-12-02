/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab2.q3;

import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class mainq3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your length.");
        String length = input.next();
        double lengthDouble = Double.parseDouble(length);
        System.out.println("Please input your radius.");
        String radius = input.next();
        double radiusDouble = Double.parseDouble(radius);
        double area = radiusDouble*radiusDouble*Math.PI;
        double volume = area*lengthDouble;
        System.out.println("your volume of a cylinder with a length of " + length + " and a radius of " + radius + " is " + volume);
        
    }
    
}
