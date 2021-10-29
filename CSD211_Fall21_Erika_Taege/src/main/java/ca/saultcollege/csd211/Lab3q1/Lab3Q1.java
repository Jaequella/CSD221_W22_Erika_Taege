/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.Lab3q1;

/**
 *
 * @author Jaequella
 */
public class Lab3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String validcardNum = "79927398713"; //this is the correct card number
        String cardNum = "79927398714"; //if this is the same as validcardnum, it is valid
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
        if (numberSum % 10 == 0) {
            System.out.println("The card number is correct.");
        } else {
            System.out.println("Sorry, invalid card number.");
        }
    }

}
