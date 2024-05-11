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

public class CSC320_CTA4_OPT1 {
    
    public static void main (String[] args) {
        Scanner userInput = new Scanner (System.in);
        numbersLength maxLength = numbersLength.FIVE;

        ArrayList<Float> userNumbers = new ArrayList<Float>();

        float numbersTotal = 0;
        float numbersAverage = 0;
        float numbersMax = Float.MIN_VALUE;
        float numbersMin = Float.MAX_VALUE;
        float numbersInterest = 0;

        while(userNumbers.size() < maxLength.ordinal()) {
            System.out.print("Enter a floating-point number: ");
            float newNumber = userInput.nextFloat();
            if (newNumber >= -99999f) {
                userNumbers.add(newNumber); 

                if (newNumber > numbersMax)
                    numbersMax = newNumber;

                if (newNumber < numbersMin)
                    numbersMin = newNumber;
                
                numbersTotal += newNumber;
                numbersAverage = numbersTotal / maxLength.ordinal();
                numbersInterest = numbersTotal + (numbersTotal * .2f);
        }
        else
            System.out.println("Your number is too low, try again.");
    }
    userInput.close();
    System.out.printf("Total: " + numbersTotal + "\n");
    System.out.printf("Average: " + numbersAverage + "\n");
    System.out.printf("Interest: " + numbersInterest + "\n");
    System.out.printf("Max: " + numbersMax + "\n");
    System.out.printf("Min: " + numbersMin + "\n");
    }
}

