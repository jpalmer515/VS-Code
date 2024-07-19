import java.util.Scanner;
import java.util.ArrayList;

public class PracticeTwo {
    
    public static void main(String[] args) {

        Scanner userFloatInput = new Scanner(System.in);

        ArrayList userFloatList = new ArrayList<>();

        int numberOfLoops = 5;

        while (userFloatList.size() < numberOfLoops) {

            System.out.println("Please enter a number");
            float userFloat = userFloatInput.nextFloat();
            userFloatList.add(userFloat);
        }

        System.out.println(userFloatList);
    }
}


// get 5 integers from a user
// add type check
// store 5 integers
// create a for loop to return the total of all 5
// add average, max, min and interest to the loop
