package com.pluralsight;

import java.util.Scanner;

import static java.lang.Math.round;

public class Main {

    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        //ask user if they want large or regular
       final double basePriceRegular = 5.45;
       final double basePriceLarge = 8.95;
        //if user picks the size, regular give base price $5.45
        //if user picks the size large give base price $8.95
       final float discountStudentPercent = 0.10f;
       final float discountSeniorPercent = 0.20f;

       double price = 0;

        System.out.println(" Welcome please choose your options: ");

        System.out.println(" Sandwich size: (1/2)");




        System.out.println("  1: Regular ( $5.45 ):  ");
        System.out.println("  2: Larger ( $8.95 ): ");
        System.out.println(" Please select your size (1/2): ");
        int sizeOption  = myScanner.nextInt();
        System.out.println(sizeOption );
        if (sizeOption == 1) {
             price = basePriceRegular;
        } else {
             price = basePriceLarge;
        }

        System.out.println("What is your age?: ");
        int age = myScanner.nextInt();

        double totalPrice = 0;
       double discountPrice = 0;
        if ( age < 17 ){
          discountPrice = price * discountStudentPercent;
          totalPrice =  price - discountPrice;
        } else if (age >= 65 ) {
            discountPrice = price * discountSeniorPercent;
            totalPrice =  price - discountPrice;
        }else{
            System.out.println(" No discount ");
        }
        totalPrice = Math.round( totalPrice * 100.0) / 100.0;
        System.out.printf("This is your total price " + "$ " + totalPrice);


    }
}
