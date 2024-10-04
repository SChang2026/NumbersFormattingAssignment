/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbersformatting;


import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigInteger;
import java.util.Random;
import java.security.SecureRandom;


public class NumbersFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asks for the total number of students
        System.out.print("Enter the total number of students at the school: ");
        int totalStudents = scanner.nextInt();
        
        // Asks for the number of girls
        System.out.print("Enter the number of girls at the school: ");
        int numberOfGirls = scanner.nextInt();
        
        // Calculates the number of boys
        int numberOfBoys = totalStudents - numberOfGirls;
        
        // Calculates percentages
        double percentageGirls = (double) numberOfGirls / totalStudents * 100;
        double percentageBoys = (double) numberOfBoys / totalStudents * 100;

        // Formats the percentages
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMinimumFractionDigits(2);
        percentFormat.setMaximumFractionDigits(2);
        
        // Outputs the results
        System.out.println("Percentage of girls: " + percentFormat.format(percentageGirls / 100));
        System.out.println("Percentage of boys: " + percentFormat.format(percentageBoys / 100));
   

        // Ask for the total amount in dollars and cents
        System.out.print("Enter the total amount in dollars and cents (e.g., 123.45): ");
        double amountInDollars = scanner.nextDouble();
        
        // Defines the exchange rate from dollars to British pounds
        final double exchangeRate = 0.83; // 0.83 GBP per 1 USD
        
        // Converts dollars to pounds
        double amountInPounds = amountInDollars * exchangeRate;

        // Formats the amount in British pounds
        NumberFormat poundFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        
        // Outputs the result
        System.out.println("Exchange rate: " + exchangeRate + " GBP per $1");
        System.out.println("Amount in British Pounds: " + (amountInPounds) + " Pounds");
        
System.out.print("Enter an integer between 0 and 15: ");
        int decimalPlaces = scanner.nextInt();

        // Validates input
        if (decimalPlaces < 0 || decimalPlaces > 15) {
            System.out.println("Invalid input! Please enter a number between 0 and 15.");
        } else {
            // Formats Pi to the specified number of decimal places
            String formattedPi = String.format("%." + decimalPlaces + "f", Math.PI);
            System.out.println("Pi to " + decimalPlaces + " decimal places: " + formattedPi);
        }
        
        scanner.close();
    

  SecureRandom random = new SecureRandom();

        // Define the range
        BigInteger lowerBound = new BigInteger("100000000"); // 100 million
        BigInteger upperBound = new BigInteger("999000000000000000"); // 999 quadrillion

        // Generate a random number in the specified range
        BigInteger randomBigInt = new BigInteger(upperBound.subtract(lowerBound).bitLength(), random).add(lowerBound);

        // Ensure the generated number is within the range
        while (randomBigInt.compareTo(upperBound) >= 0) {
            randomBigInt = new BigInteger(upperBound.subtract(lowerBound).bitLength(), random).add(lowerBound);
        }

        // Output the random number
        System.out.println("Random Number: " + randomBigInt.toString());
    }
}