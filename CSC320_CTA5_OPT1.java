// Create a menu asking user for their requested temp
// Use print statements for menu
// Use preset temps and calculate average for the week
// - If enough time, create a "9 Update" to update the temp of any day of the week
// Use if, else-if logic to check for each option given to the user
// Need a userinput to take in the menu option chosen
// - Need 1 for menu option
// - Need 1 for the Update option, requesting the new temp and what day it's for
// Daily Temp List
// - Day of the variable linked to list index for the temp
// - update by changing number at that index

import java.util.Scanner;
import java.util.ArrayList;

public class CSC320_CTA5_OPT1 {
    
    public static void main (String[] args) {
        Scanner menuOption = new Scanner (System.in);

        ArrayList<Integer> dailyTemps = new ArrayList<Integer>();

        dailyTemps.add(59);
        dailyTemps.add(58);
        dailyTemps.add(53);
        dailyTemps.add(64);
        dailyTemps.add(71);
        dailyTemps.add(76);
        dailyTemps.add(78);

        ArrayList<Integer> weeklyAverage = new ArrayList<Integer>();

        int sundayTemp = dailyTemps.get(0);
        int mondayTemp = dailyTemps.get(1);
        int tuesdayTemp = dailyTemps.get(2);
        int wednesdayTemp = dailyTemps.get(3);
        int thursdayTemp = dailyTemps.get(4);
        int fridayTemp = dailyTemps.get(5);
        int saturdayTemp = dailyTemps.get(6);

        // Loop for getting total sum of the dailyTemps
        int weeklyTotal = dailyTemps.stream().mapToInt(Integer::intValue).sum();
        int weeklyTemp = weeklyTotal / dailyTemps.size();

        weeklyAverage.add(weeklyTemp);

        System.out.printf("\n FAKENEWZ WEATHER \n");
        System.out.printf("Select from the following options: \n");
        System.out.printf("1. SUNDAY \n");
        System.out.printf("2. MONDAY \n");
        System.out.printf("3. TUESDAY \n");
        System.out.printf("4. WEDNESDAY \n");
        System.out.printf("5. THURSDAY \n");
        System.out.printf("6. FRIDAY \n");
        System.out.printf("7. SATURDAY \n");
        System.out.printf("8. WEEKLY \n");

        int menuNumber = menuOption.nextInt();

        if (menuNumber <= 0 || menuNumber >= 9) {
            System.out.printf("Not a menu option. Please choose a number between 1-8.");
        }

        else
            switch(menuNumber) {
                case 1:
                    System.out.printf("Sunday will be " + sundayTemp +"F\n");
                    break;

                case 2:
                    System.out.printf("Monday will be " + mondayTemp +"F\n");
                    break;

                case 3:
                    System.out.printf("Tuesday will be " + tuesdayTemp +"F\n");
                    break;

                case 4:
                    System.out.printf("Wednesday will be " + wednesdayTemp +"F\n");
                    break;

                case 5:
                    System.out.printf("Thursday will be " + thursdayTemp +"F\n");
                    break;

                case 6:
                    System.out.printf("Friday will be " + fridayTemp +"F\n");
                    break;

                case 7:
                    System.out.printf("Saturday will be " + saturdayTemp +"F\n");
                    break;

                case 8:
                    System.out.printf("Sunday will be " + sundayTemp +"F\n");
                    System.out.printf("Monday will be " + mondayTemp +"F\n");
                    System.out.printf("Tuesday will be " + tuesdayTemp +"F\n");
                    System.out.printf("Wednesday will be " + wednesdayTemp +"F\n");
                    System.out.printf("Thursday will be " + thursdayTemp +"F\n");
                    System.out.printf("Friday will be " + fridayTemp +"F\n");
                    System.out.printf("Saturday will be " + saturdayTemp +"F\n");
                    System.out.printf("The average throughout the week will be " + weeklyTemp +"F\n");
                    break;
            }
    }
}
