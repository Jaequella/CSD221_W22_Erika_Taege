/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.test3;

/**
 *
 * @author Jaequella
 */
public class App {
    public void run(){
        //a way of testing if a and b are equal PART A, not in a test method
    Course c1 = new Course("Intro to Java","CSD211","September 8th",21,12);
    Course c2 = new Course("Intro to c#","CSD211","September 6th",23,20);// provides parameters for course
    System.out.println("Course 1 is " + c1.getname() + " and has a class code of " + c1.getcode());
    System.out.println("Course 2 is " + c2.getname() + " and has a class code of " + c2.getcode());
    String code1 = c1.getcode();
    String code2 = c2.getcode();//local variables, parameters to define it from each of their course objects
        if (code1.compareTo(code2) == 0){ //return 0 if they are the same
            System.out.println("Course 1 and 2 have the same class code of "+ code1 +". please contact an admin.");
        }
    }
}
