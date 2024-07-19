import java.util.Scanner;

public class PracticeTwo {
    
    public static void main(String[] args) {

        Scanner userFloatInput = new Scanner(System.in);

        int startingNumberOfLoops = 0;
        int maxNumberOfLoops = 5;
        float numbersAdded = 0;
        float numbersAveraged = 0;
        float largestNumber = -999999999;
        float smallestNumber = Float.MAX_VALUE;
        double numbersPlusInterest = 0;

        while (startingNumberOfLoops < maxNumberOfLoops) {

            System.out.println("Please enter a number");
            float userFloat = userFloatInput.nextFloat();
            numbersAdded = numbersAdded + userFloat;
            numbersAveraged = numbersAdded / maxNumberOfLoops;
            if (largestNumber < userFloat) {
                largestNumber = userFloat;
            }
            else if (smallestNumber > userFloat) {
                smallestNumber = userFloat;
            }
            double interestRate = .2;
            numbersPlusInterest = numbersAdded * interestRate;
            startingNumberOfLoops++;
        }

        System.out.println("Total: " + numbersAdded + ", Average: " + numbersAveraged + ", Max: " + largestNumber + ", Min: " + smallestNumber + ", Interest: " + numbersPlusInterest );
    }
}


// get 5 integers from a user
// add type check
// store 5 integers
// create a for loop to return the total of all 5
// add average, max, min and interest to the loop
