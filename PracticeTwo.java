import java.util.Scanner;

public class PracticeTwo {
    
    public static void main(String[] args) {

        Scanner userFloatInput = new Scanner(System.in);

        int startingNumberOfLoops = 0;
        int maxNumberOfLoops = 5;
        float numbersAdded = 0;
        float numbersAveraged = 0;
        float largestNumber = -999999999;
        float smallestNumber = 999999999;
        double numbersPlusInterest = 0;

        while (startingNumberOfLoops < maxNumberOfLoops) {

            System.out.println("Please enter a number");
            float userFloat = userFloatInput.nextFloat();
            numbersAdded = numbersAdded + userFloat;
            numbersAveraged = numbersAdded / maxNumberOfLoops;
            if (largestNumber < userFloat) {
                largestNumber = userFloat;
            }
            if (smallestNumber > userFloat) {
                smallestNumber = userFloat;
            }
            double interestRate = .2;
            numbersPlusInterest = numbersAdded * interestRate;
            startingNumberOfLoops++;
        }

        System.out.println("Total: " + numbersAdded + ", Average: " + numbersAveraged + ", Max: " + largestNumber + ", Min: " + smallestNumber + ", Interest: " + numbersPlusInterest );
    }
}

