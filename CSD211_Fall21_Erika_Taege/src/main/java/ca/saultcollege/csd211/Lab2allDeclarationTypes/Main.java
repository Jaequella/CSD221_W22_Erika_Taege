/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab2allDeclarationTypes;

import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class Main {
//Primitive Data Types

    public static void main(String[] args) {
        //Primitive Data Types
    String Str = "This is a string value";
    int num = 1;
    double doublenum = 3.14;
    float deci = 4.99f;
    char letter = 'B'; //single ' required
    boolean TF = true;
    short shortnum = 34;
    long longnum = 342;
    byte bytenum = 98;
    
       Scanner sc = new Scanner(System.in);
      System.out.println("My string is "+ Str +". What is yours?" );
      Str = sc.nextLine();
      System.out.println("Your string is "+ Str);
      
      System.out.println("My Int is "+ num +". What is yours?" );
      num = sc.nextInt();
      System.out.println("Your Int is "+ num);
      
      System.out.println("My Double is "+ doublenum +". What is yours?" );
      doublenum = sc.nextDouble();
      System.out.println("Your Double is "+ doublenum);
      
      System.out.println("My Short int is "+ shortnum +". What is yours?" );
      shortnum = sc.nextShort();
      System.out.println("Your Short int is "+ shortnum);
      
      System.out.println("My Long int is "+ longnum +". What is yours?" );
      longnum = sc.nextLong();
      System.out.println("Your Long int is "+ longnum);
      
      System.out.println("My Byte int is "+ bytenum +". What is yours?(between -128 and 127)" );
      bytenum = sc.nextByte();
      System.out.println("Your Byte int is "+ bytenum);
      
      System.out.println("My Float is "+ deci +". What is yours?" );
      deci = sc.nextFloat();
      System.out.println("Your Float is "+ deci);
      
      System.out.println("My Char is "+ letter +". What is yours?(if there is more than one, it will be shortened to the first letter or number.)" );
      String lettertemp = sc.nextLine();
      letter = lettertemp.charAt(0);
      System.out.println("Your Char is "+ letter);
       
      System.out.println("My Boolean is "+ TF +". What is yours?(true or false)" );
      TF = sc.nextBoolean();
      System.out.println("Your Boolean is "+ TF);
      
      
    }
    
}
