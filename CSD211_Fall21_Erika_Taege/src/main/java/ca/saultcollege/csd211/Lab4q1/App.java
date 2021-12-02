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
public class App {
        public void run(){
            Person joe = new Person("Joe","Student",23,0.0,0.0,'M');
            Person george = new Person("George", "Student", 24, 188.2, 60.0, 'M');
            Person mary = new Person("Mary", "Teacher", 43, 170, 48.2, 'F');
            System.out.println("Name : " + joe);
            System.out.println("Age : " + joe.getAge());
            System.out.println("Height : " + joe.getHeight());
            System.out.println("Weight : " + joe.getWeight());
            System.out.println("Gender : " + joe.getGender());
            
            System.out.println("Name : " + george);
            System.out.println("Age : " + george.getAge());
            System.out.println("Height : " + george.getHeight());
            System.out.println("Weight : " + george.getWeight());
            System.out.println("Gender : " + george.getGender());
            
            System.out.println("Name : " + mary);
            System.out.println("Age : " + mary.getAge());
            System.out.println("Height : " + mary.getHeight());
            System.out.println("Weight : " + mary.getWeight());
            System.out.println("Gender : " + mary.getGender());
        }
    }
