/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1.q6;

import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class App {

    private Person[] people = new Person[100];
    private int currentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add Person\n"
            + "2. List People\n"
            + "3. Delete Person\n"
            + "99. Exit";

    public void Run() {
        final int people = 100;
        boolean done = false;
        while (!done) {
            System.out.println(menu);
            input = new Scanner(System.in);
            System.out.println("Please enter your choice; ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    listPerson();
                    break;
                case 3:
                    deletePerson();
                    break;
                case 99:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid entry, please put in valid entry.");
                    break;
            }
        }
    }

    private void addPerson() {
        input = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        String fn =getInput("");
        System.out.println("Enter Author Name: ");
        String ln =getInput("");
        System.out.println("Enter ISBN: ");
        String id =getInput("");
        Person person = new Person(fn, ln, id);
        people[currentIndex]=person;
        currentIndex++;
    }

    private void listPerson() {
        for (int i=0;i<people.length;i++){
            if(people[i]==null)
                break;
            System.out.println((i+1) +". "+people[i]); //The book still saves all the data correctly, but won't display it, instead displays location?
    }
    }

    private void deletePerson() {
        System.out.println("Which Person would you like to Delete?:");
        int choice = input.nextInt();
        input = new Scanner(System.in);
    }

    private String getInput(String i) {
        String ss = input.nextLine();
        if(ss.trim().isEmpty()){
            return i;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }
}
