/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import Lab3.*;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class App {
    private Book[] BookList = new Book[100];
    private Magazine[] MagazineList = new Magazine[100];
    private Ticket[] TicketList = new Ticket[100];
    private int BookIndex = 0;
    private int MagazineIndex = 0;
    private int TicketIndex= 0;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add Book\n"
            + "2. Edit Books\n"
            + "3. Delete Book\n"
            + "4. List Books\n"
            + "5. Add Magazine\n"
            + "6. Edit Magazine\n"
            + "7. Delete Magazine\n"
            + "8. List Magazine\n"
            + "9. Add Ticket\n"
            + "10. Edit Ticket\n"
            + "10. quit";
    
    public void run() {
    final int numObjects = 100;
    boolean done = false;
    while(!done){
        System.out.println(menu);
        input = new Scanner(System.in);
        System.out.println("Please enter your choice; ");
        int choice = input.nextInt();
        switch(choice){
            case 1 -> addBook();
            case 2 -> editBook();
            case 3 -> deleteBook();
            case 4 -> listBook();
            case 5 -> addMagazine();
            case 6 -> editMagazine();
            case 7 -> deleteMagazine();
            case 8 -> listMagazine();
            case 9 -> addTicket();
            case 10 -> editTicket();
            case 11 -> listTicket();
            case 99 -> done =true;
            default -> System.out.println("Invalid entry, please put in valid entry.");
        }
    }
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
    
    private void addBook() {
        input = new Scanner(System.in);
        System.out.println("Enter Author: ");
        String author =getInput("");
        System.out.println("Enter Quantity to order: ");
        String quant =getInput("");
        System.out.println("Enter title: ");
        String titlein =getInput("");
        System.out.println("Enter price: ");
        String prices =getInput("");
        Book book = new Book(author,titlein,Double.parseDouble(prices));
        book.orderCopies(Integer.parseInt(quant));
        System.out.print(book.ToString());
        BookList[BookIndex]=book;
        BookIndex++;
    }

    private void editBook() {
        listBook();
        System.out.println("Which Book would you like to edit ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in);
        if ((choice < BookIndex +1) && choice > 0){
            Book c = BookList[choice-1];
            System.out.println("Enter new Author: ");
            c.setAuthor(getInput(c.getAuthor()));
            System.out.println("Enter new Quantity to order: ");
            c.setCopies(getInput(c.getCopies()));
            System.out.println("Enter new title: ");
            c.setTitle(getInput(c.getTitle()));
            System.out.println("Enter new price: ");
            c.setPrice(getInput(c.getPrice()));
        }
    }

    private void deleteBook() {
        listBook();
        System.out.println("Which Book would you like to delete ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Book removed.");
        BookList[choice] =  null;
    }
    
    private void listBook() {
        for (int i=0; i<BookList.length;i++){
            if(BookList[i]!= null)
             System.out.println((i+1) + ". "+BookList[i].getTitle());
        }
    }

    private void addMagazine() {
        System.out.println("Enter Quantity to order: ");
        String quant =getInput("");
        System.out.println("Enter title: ");
        String titlein =getInput("");
        System.out.println("Enter price: ");
        String prices =getInput("");
        System.out.println("Enter current issue date:(dd/mm/yyyy): ");
        String currentIssue =getInput("");
        Magazine magazine = new Magazine(titlein, Double.parseDouble(prices),currentIssue,Integer.parseInt(quant));
        System.out.print(magazine.ToString());
        MagazineList[MagazineIndex]=magazine;
        MagazineIndex++;
    }

    private void editMagazine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void listMagazine() {
        for (int i=0; i<MagazineList.length;i++){
            if(MagazineList[i]!= null)
             System.out.println((i+1) + ". "+MagazineList[i].getTitle());
        }
    }
    
    private void deleteMagazine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void addTicket() {
        input = new Scanner(System.in);
        System.out.println("Enter Ticket Description; ");
        String desc =getInput("");
        System.out.println("Enter Price: ");
        String prices =getInput("");
        System.out.println("Enter Recipient: ");
        String name =getInput("");
        Ticket ticket = new Ticket(desc,name,Double.parseDouble(prices));
        System.out.print(ticket.ToString());
        TicketList[TicketIndex]=ticket;
        TicketIndex++;
    }

    private void editTicket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listTicket() {
        for (int i=0; i<TicketList.length;i++){
            if(TicketList[i]!= null)
             System.out.println((i+1) + ". "+TicketList[i].getTitle());
        }
    }

}

