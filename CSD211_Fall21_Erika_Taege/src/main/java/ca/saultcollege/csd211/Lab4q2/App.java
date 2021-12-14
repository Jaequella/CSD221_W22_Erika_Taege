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
private Car[] cars = new Car[100];
    private int currentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add Car\n"
            + "2. List Cars\n"
            + "3. Edit Car\n"
            + "4. Delete Car\n"
            + "99. quit";
    private String soldCarsMenu = ""
            + "1. List Cars\n"
            + "99. quit";
    
    public void run() {
    final int numCars = 100;
    boolean done = false;
    while(!done){
        System.out.println(menu);
        input = new Scanner(System.in);
        System.out.println("Please enter your choice; ");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                addCar();
                break;
            case 2:
                listCar();
                break;
            case 3:
                editCar();
                break;
            case 4:
                deleteCar();
                break;
            case 99:
                done =true;
                break;
            default:
                System.out.println("Invalid entry, please put in valid entry.");
                break;
        }
    }
    }
    Person shane=new Person("Shane", "Mollari");
    Car ford=new Car("Ford", "Mustang", 2012);
    Car chev=new Car("Chevrolet", "Camaro", 2012, shane);
    Car ford=new Car("Ford", "Focus", 2013, 1234);
    
    

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

    private void addCar() {
        input = new Scanner(System.in);
        System.out.println("Enter Car Make: ");
        String maken =getInput("");
        System.out.println("Enter Car Model: ");
        String cm =getInput("");
        System.out.println("Enter Car Year: ");
        String cy =getInput("");
        System.out.println("Enter VIN: ");
        String vn =getInput("");
        Car car = new Car(maken, cm, cy, vn);
        cars[currentIndex]=car;
        currentIndex++;
    }

    private void listCar() {
        for (int i=0;i<cars.length;i++){
            if(cars[i]==null)
                break;
            System.out.println((i+1) +". "+cars[i]);
        }
    }

    private void editCar() {
        listCar();
        System.out.println("Which Car would you like to edit ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in); // reset the scanner
        if ((choice < currentIndex + 1) && choice > 0) {
            Car c = cars[choice - 1];
            System.out.println("Current Book Name: " + cars.getName());
            c.setName(getInput(c.getName()));
            System.out.println("Current Author Name: " + cars.getAuthName());
            c.setAuthName(getInput(c.getAuthName()));
            System.out.println("Current ISBN: " + c.getISBN());
            c.setISBN(getInput(c.getISBN()));
            System.out.println("Current Publish Date: " + c.getPublishedDate());
            c.setPublishedDate(getInput(c.getPublishedDate()));
        } else {
            System.out.println("Choice out of bounds");
        }
        System.out.println("");
    }

    private void deleteCar() {
        System.out.println("Which Car would you like to Delete?:");
        int choice = input.nextInt();
        input = new Scanner(System.in);
        
    }

}
