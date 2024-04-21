import java.util.Scanner;

public class taxCalculator1 {
    
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int income = userInput.nextInt();  
        switch (income) {
            (income <= 500):
                System.out.printf("Withholdings: %f" ,(double)income * .1);
                break;
            (income > 500 && income <= 1500):
                System.out.printf("Withholdings: %f" ,(double)income * .15);
                break;
            (income > 1500 && income <= 2500):
                System.out.printf("Withholdings: %f" ,(double)income * .2);
                break;
            (income > 2500):
                System.out.printlnprintf("Withholdings: %f" ,(double)income * .3);
                break;

        }

    }

}


