// public class CSC320_CTA3_OPT1 
    
import java.util.Scanner;

public class CSC320_CTA3_OPT1 {

    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int income = userInput.nextInt();  
        if (income <= 500) {
            System.out.printf("Withholdings: %f" ,(double)income * .1);
        }   else if (income > 500 && income <= 1500) { 
            System.out.printf("Withholdings: %f" ,(double)income * .15);
        }   else if (income > 1500 && income <= 2500) {
            System.out.printf("Withholdings: %f" ,(double)income * .2); 
        }   else if (income > 2500) {
            System.out.printf("Withholdings: %f" ,(double)income * .3);
        }        
        userInput.close();
    }
}