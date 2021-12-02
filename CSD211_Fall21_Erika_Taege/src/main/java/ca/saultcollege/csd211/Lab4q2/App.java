/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab4q2;

import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class App {

    public void run() {
    final int numCars = 100;
    private Car[] cars = new Car[numCars];
    private Car[] sold = new Car[numCars];
    private int currentIndex = 0;
    private int soldCurrentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add Car\n"
            + "2. List Cars\n"
            + "3. Edit Car\n"
            + "4. Delete Car\n"
            + "5. Sell Car\n"
            + "6. Sold Cars\n"
            + "99. quit";
    private String soldCarsMenu = ""
            + "1. List Cars\n"
            + "99. quit";
    Person shane=new Person("Shane", "Mollari");
    Car ford=new Car("Ford", "Mustang", 2012);
    Car chev=new Car("Chevrolet", "Camaro", 2012, shane);
    Car ford=new Car("Ford", "Focus", 2013, 1234);
    
    //TODO Edit the edit command to fit, use this to fit cars in. Figure usage before test
 private void edit() {
        list(1);
        System.out.println("Which car would you like to edit ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in); // reset the scanner
        if ((choice < currentIndex + 1) && choice > 0) {
            Car c = cars[choice - 1];
            System.out.println("Make: " + c.getMake());
            c.setMake(getInput(c.getMake()));
            System.out.println("Model: " + c.getModel());
            c.setModel(getInput(c.getModel()));
            System.out.println("Year: " + c.getYear());
            c.setYear(getInput(c.getYear()));
        } else {
            System.out.println("Choice out of bounds");
        }
        System.out.println("");
    }

    private String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    private int getInput(int i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }
 private double getInput(double i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }

    }
}
