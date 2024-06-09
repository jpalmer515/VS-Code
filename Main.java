// Changed from having four methods, to have a single method controlling the vehicle information.
// Create a method for handling how the inventory will be displayed.
// This method will also encompass the header for the inventory, making it more visually appealing.
// Utilize a while loop to keep the program running until the user decides to exit the program
// Add an exit menu button and logic

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
// import VehicleTwo;

class Main {

    public static void displayInventory (ArrayList<VehicleTwo> vehicleInventory) {
        try {
            String HeaderString = String.join( " ", "MAKE", "MODEL", "COLOR", "YEAR", "MILEAGE");
            System.out.println(HeaderString);
            for (int i = 0; i < vehicleInventory.size(); i++) {
                System.out.println(vehicleInventory.get(i));
            }   
        }
        catch (Exception e) {
            System.out.println("An error has occurred" + e.getMessage());
        }
    }

    public static void main (String[] args) {
        //Scanners for user inputs
        Scanner UserInput = new Scanner(System.in);

        //Vehicle list instantiation
        ArrayList<VehicleTwo> vehicleInventory = new ArrayList<VehicleTwo>();
        
    while (true) {

        System.out.println("\nBAD NEWS CAR SALES\n");
        System.out.println("Select from the following options:");
        System.out.println("----------------------------------");
        System.out.println("1. ADD VEHICLE");
        System.out.println("2. UPDATE VEHICLE");
        System.out.println("3. REMOVE VEHICLE");
        System.out.println("4. DISPLAY INVENTORY");
        System.out.println("5. EXPORT INVENTORY");
        System.out.println("6. EXIT");
        
        //Method for applying user inputs
        int menuNumber = UserInput.nextInt();

        //Checking for appropriate user menu choice
        if (menuNumber <= 0 || menuNumber >= 7) {
            System.out.printf("Not a menu option. Please choose a number between 1-6.");
        }

        //logic for adding a vehicle
        else
            if (menuNumber == 1) {
                try {
                    //Tried requesting all vehicle information at once, but didn't output the way I wanted it to
                    //Changed to reflect requesting each piece of information separately and then triggering the scanner
                    System.out.printf("\nEnter make: ");
                        String make = UserInput.next();
                    System.out.printf("Enter model: ");
                        String model = UserInput.next();
                    System.out.printf("Enter color: ");
                        String color = UserInput.next();
                    System.out.printf("Enter year: ");
                        int year = UserInput.nextInt();
                    System.out.printf("Enter mileage: ");
                        int mileage = UserInput.nextInt();
                    VehicleTwo newVehicle = new VehicleTwo(make, model, color, year, mileage);
                    vehicleInventory.add(newVehicle);
                    System.out.println("\nVehicle has been added:");
                    System.out.println(make + " " + model + " " + color + " " + year + " " + mileage + " ");
                }
                catch (Exception e) {
                    System.out.println("An error has occurred" + e.getMessage());
                }
            }

            //logic for updating a vehicle in the list
            else if (menuNumber == 2) {
                if (vehicleInventory.size() <=  0) {
                    System.out.printf("\n Inventory is empty \n");
                }
                else
                    System.out.printf("Enter the index number of the vehicle to be updated: ");
                    int vehicleIndex = UserInput.nextInt();
                    if (vehicleIndex <= 0 || vehicleIndex > vehicleInventory.size()) {
                        System.out.printf("\n Invalid Index Number \n");
                    }
                    else
                        try {
                            System.out.printf("\nEnter make: ");
                                String make = UserInput.next();
                            System.out.printf("Enter model: ");
                                String model = UserInput.next();
                            System.out.printf("Enter color: ");
                                String color = UserInput.next();
                            System.out.printf("Enter year: ");
                                int year = UserInput.nextInt();
                            System.out.printf("Enter mileage: ");
                                int mileage = UserInput.nextInt();
                            
                            //Setting VehicleTwo object to variable newVehicle
                            VehicleTwo newVehicle = new VehicleTwo(make, model, color, year, mileage);
                            
                            //Changing information at vehicleIndex with newVehicle information
                            vehicleInventory.set(vehicleIndex, newVehicle);
                            System.out.printf("\nVehicle has been updated:\n");
                            System.out.println("---------------------------------");
                            displayInventory(vehicleInventory);
                        }
                        catch (Exception e) {
                            System.out.println("An error has occurred" + e.getMessage());
                        }
            }

            //logic for removing a vehicle from the list
            else if (menuNumber == 3) {
                if (vehicleInventory.size() <=  0) {
                    System.out.printf("\n Inventory is empty \n");
                }
                else
                    System.out.printf("Enter the index number of the vehicle to be removed: ");
                    int IndexToRemove = UserInput.nextInt();
                    if (IndexToRemove < 0 || IndexToRemove > vehicleInventory.size()) {
                        System.out.printf("\n Invalid Index Number \n");
                    }
                    else
                        try {
                            vehicleInventory.remove(IndexToRemove);
                            System.out.printf("\nVehicle has been removed. \n");
                        }
                        catch (Exception e) {
                            System.out.println("An error has occurred" + e.getMessage());
                        }
            }

            //logic for displaying the list (vehicle inventory)
            else if (menuNumber == 4) {
                if (vehicleInventory.size() <=  0) {
                    System.out.printf("\nInventory is empty");
                }
                else
                    displayInventory(vehicleInventory);
                }

            //logic for converting the list to a .txt file
            else if (menuNumber == 5) {
                if (vehicleInventory.size() <=  0) {
                    System.out.printf("\nInventory is empty");
                }
                else
                    System.out.printf("Do you want to print the information to a file? (Y/N) ");
                    String YesNo = UserInput.next();
                    System.out.println(YesNo);
                    if (YesNo.contains("Y")) {
                        System.out.println("YES");
                        String filePath = "C:\\Users\\Jake\\OneDrive\\Desktop\\Folder\\School\\CSU Global\\CSC320.txt";
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                            for (VehicleTwo vehicleTwo : vehicleInventory) {
                                writer.write(vehicleTwo.toString());
                                writer.newLine();
                            }
                            System.out.printf("\nVehicle inventory has been printed! \n");
                        } 
                        catch (IOException e) {
                            System.out.println("\nAn error has occurred" + e.getMessage());
                        }
                    }
                    else
                        System.out.printf("\nExiting the menu. Goodbye!"); 
            }

            //logic for exiting the program, otherwise it will loop back to the main menu
            else if (menuNumber == 6) {
                try {
                    System.out.printf("\nExiting the system. Goodbye!");
                    UserInput.close();
                    break;
                }
                catch (Exception e) {
                    System.out.println("\nAn error has occurred" + e.getMessage());
                }
            }
    }
    }
}