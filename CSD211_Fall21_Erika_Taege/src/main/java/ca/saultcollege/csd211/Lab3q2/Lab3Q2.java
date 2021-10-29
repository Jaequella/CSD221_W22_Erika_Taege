/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab3q2;

import java.util.Scanner;

/**
 *
 * @author Jaequella
 */
public class Lab3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String validcardNum = "79927398713"; //this is the correct card number
        boolean isValid = false;
        System.out.println("Please enter your card number.");
        while (isValid = false) {
            Scanner inputNum = new Scanner(System.in);
            String cardNum = inputNum.next();
            int nDigits = cardNum.length();
            int numberSum = 0;
            boolean isSecond = false; //checks every second value, start as false to swap to true.
            for (int i = nDigits - 1; i >= 0; i--) {
                int d = cardNum.charAt(i) - '0';
                if (isSecond == true) { //follow lhun algorhythym
                    d = d * 2; //double the value
                    numberSum += d / 10;
                    numberSum += d % 10;
                    isSecond = !isSecond; //reset to off for next loop
                }
            }
        }

    }

}
