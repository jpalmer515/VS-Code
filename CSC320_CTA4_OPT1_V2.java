// Add the Scanner function under the while loop
// Set the loop to iterate until the list reaches the max length(5)
// Initialize variables for Total, Average, Max, Min and Total + 20% interest
// Use if statements for Max, Min
// Total, average, total + interest can be used in a cascading fashion
// Use a for loop to iterate over the list for total, average, and interest

import java.util.Scanner;
import java.util.ArrayList;

enum numbersLength {
    ZERO, ONE, TWO, THREE, FOUR, FIVE
}

public class CSC320_CTA4_OPT1_V2 {
    
    public static void main (String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter a number: ");
        float newNumber = userInput.nextFloat();

        numbersLength maxLength = numbersLength.FIVE;
        ArrayList<Double> userNumbers = new ArrayList<Double>();
        float numbersTotal = 0;
        float numbersAverage = 0;
        float numbersMax = -99999;
        float numbersMin = 99999;
        float numbersInterest = 0;

        while(userNumbers.size() < maxLength.ordinal()) {
            if (newNumber >= -99999) {
                userNumbers.add(newNumber); }
                else {
                    System.out.println("Your number is too low, try again.");
                }
            for(int counter = 0; counter < maxLength.ordinal(); counter++) {
                numbersTotal += newNumber;
            numbersAverage = numbersTotal / maxLength.ordinal();
            numbersInterest = numbersTotal + (numbersTotal *.2f);
            }
        System.out.printf("Total: " + numbersTotal + "\n");
        System.out.printf("Average: " + numbersAverage + "\n");
        System.out.printf("Interest: " + numbersInterest + "\n");
                
            if (newNumber > numbersMax) {
                numbersMax = newNumber;
        System.out.printf("Max: " + numbersMax + "\n");
            }
            if (newNumber < numbersMin) {
                numbersMin = newNumber;
        System.out.printf("Min: " + numbersMin + "\n");
            }
        }
        userInput.close();
    }
}