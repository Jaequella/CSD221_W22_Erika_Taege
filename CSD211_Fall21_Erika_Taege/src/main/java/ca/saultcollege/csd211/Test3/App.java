/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Test3;

import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class App {
    private Book[] books = new Book[100];
    private int currentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add Book\n"
            + "2. List Books\n"
            + "3. Edit Book Entry\n"
            + "99. quit";
    public void Run(){
    final int numBooks = 100;
    boolean done = false;
    while(!done){
        System.out.println(menu);
        input = new Scanner(System.in);
        System.out.println("Please enter your choice; ");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                addBook();
                break;
            case 2:
                listBook();
                break;
            case 3:
                editBook();
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

    private void addBook() {
        input = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        String bn =getInput("");
        System.out.println("Enter Author Name: ");
        String an =getInput("");
        System.out.println("Enter ISBN: ");
        String isbn =getInput("");
        System.out.println("Enter Publish Date: ");
        String pd =getInput("");
        Book book = new Book(bn, an, isbn, pd);
        books[currentIndex]=book;
        currentIndex++;
    }

    private void listBook() {
        for (int i=0;i<books.length;i++){
            if(books[i]==null)
                break;
            System.out.println((i+1) +". "+books[i]); //The book still saves all the data correctly, but won't display it, instead displays location?
    }
    }

    private void editBook() {
        listBook();
        System.out.println("Which Book would you like to edit ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in); // reset the scanner
        if ((choice < currentIndex + 1) && choice > 0) {
            Book c = books[choice - 1];
            System.out.println("Current Book Name: " + c.getName());
            c.setName(getInput(c.getName()));
            System.out.println("Current Author Name: " + c.getAuthName());
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

    
    private String getInput(String i) {
        String ss = input.nextLine();
        if(ss.trim().isEmpty()){
            return i;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }
   
}
