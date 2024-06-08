import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class VehicleTwo {
    
    //private variables for vehicle description
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    //vehicle object
    public VehicleTwo(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } 
        catch (Exception e){
            System.out.printf("Something went wrong!" + e.getMessage());
        }
    }

    //method for displaying the list in a human readable table
    public static void displayInventory(String vehicleInventory) {
        String HeaderString = String.join("MAKE", "MODEL", "COLOR", "YEAR", "MILEAGE");
        System.out.println(HeaderString);
        for (index of VehicleTwo) {
            System.out.println("");
            System.out.println(VehicleTwo);
        System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        try {
            return make + "" + model + "" + color + "" + year + "" + mileage + "";
        }
        catch (Exception e) {
            System.out.println("An error has occurred" + e.getMessage());
            return "";
        }
    }
}

class Main {

    public static void main (String[] args) {

        //Calling a method from VehicleTwo Class
        VehicleTwo ob = new VehicleTwo();

        //Scanners for user inputs
        Scanner menuOption = new Scanner (System.in);
        Scanner userInput = new Scanner (System.in);
        Scanner carIndex = new Scanner (System.in);
        Scanner toFile = new Scanner (System.in);

        //Method for applying user inputs
        int menuNumber = menuOption.nextInt();
        int vehicleIndex = carIndex.nextInt();
        String YesNo = toFile.next();

        //Vehicle list instantiation
        ArrayList<VehicleTwo> vehicleInventory = new ArrayList<VehicleTwo>();

        //Method for finding the list length
        int InventoryLength = vehicleInventory.size();

    while (true);

        System.out.println("\nBAD NEWS CAR SALES\n");
        System.out.println("Select from the following options:\n");
        System.out.println("----------------------------------\n");
        System.out.println("1. ADD VEHICLE\n");
        System.out.println("2. UPDATE VEHICLE\n");
        System.out.println("3. REMOVE VEHICLE\n");
        System.out.println("4. DISPLAY INVENTORY\n");
        System.out.println("5. EXPORT INVENTORY\n");
        System.out.println("6. EXIT");

        //Checking for appropriate user menu choice
        if (menuNumber <= 0 || menuNumber >= 7) {
            System.out.printf("Not a menu option. Please choose a number between 1-6.");
        }

        //logic for adding a vehicle
        else
            if (menuNumber == 1) {
                try {
                    System.out.printf("\nEnter make, model, color, year and mileage");
                    String make = userInput.next();
                    String model = userInput.next();
                    String color = userInput.next();
                    int year = userInput.nextInt();
                    int mileage = userInput.nextInt();

                    VehicleTwo newVehicle = new VehicleTwo(make, model, color, year, mileage);
                    vehicleInventory.add(newVehicle);
                    System.out.println("\nVehicle has been added:");
                    System.out.println("\n" + make + model + color + year + mileage);
                }
                catch (Exception e) {
                    System.out.println("An error has occurred" + e.getMessage());
                }
            }

            //logic for updating a vehicle in the list
            else if (menuNumber == 2) {
                if (vehicleInventory == null) {
                    System.out.printf("\n Inventory is empty \n");
                }
                else
                    System.out.printf("Enter the index number of the vehicle to be updated: ");
                    if (vehicleIndex <= 0 || vehicleIndex > vehicleInventory.size()) {
                        System.out.printf("\n Invalid Index Number \n");
                    }
                    else
                        try {
                            System.out.printf("\nEnter make, model, color, year and mileage");
                            String make = userInput.next();
                            String model = userInput.next();
                            String color = userInput.next();
                            int year = userInput.nextInt();
                            int mileage = userInput.nextInt();

                            vehicleInventory.get(vehicleIndex).VehicleTwo(make, model, color, year, mileage);
                            System.out.printf("\nVehicle has been updated\n");
                            System.out.println(ob.displayInventory(););
                        }
                        catch (Exception e) {
                            System.out.println("An error has occurred" + e.getMessage());
                        }
            }

            //logic for removing a vehicle from the list
            else if (menuNumber == 3) {
                if (vehicleInventory == null) {
                    System.out.printf("\n Inventory is empty \n");
                }
                else
                    System.out.printf("Enter the index number of the vehicle to be removed: ");
                    if (vehicleIndex < 0 || vehicleIndex > vehicleInventory.size()) {
                        System.out.printf("\n Invalid Index Number \n");
                    }
                    else
                        try {
                            vehicleInventory.remove(vehicleIndex);
                            System.out.printf("\nVehicle has been removed. \n");
                        }
                        catch (Exception e) {
                            System.out.println("An error has occurred" + e.getMessage());
                        }
            }

            //logic for displaying the list (vehicle inventory)
            else if (menuNumber == 4) {
                if (vehicleInventory == null) {
                    System.out.printf("\nInventory is empty");
                }
                else
                    ob.displayInventory();
            }

            //logic for converting the list to a .txt file
            else if (menuNumber == 5) {
                if (vehicleInventory == null) {
                    System.out.printf("\nInventory is empty");
                }
                else
                    System.out.printf("\n Do you want to print the information to a file? (Y/N) ");
                    if (YesNo == "Y") {
                        String filePath = "C:\\Users\\Jake\\OneDrive\\Desktop\\Folder\\School\\CSU Global\\CSC320.txt";
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                            for (VehicleTwo vehicleTwo : vehicleInventory) {
                                writer.write(vehicleTwo.toString());
                                writer.newLine();
                            }
                            System.out.printf("\nVehicle inventory has been printed!");
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
                    break;
                }
                catch (Exception e) {
                    System.out.println("\nAn error has occurred" + e.getMessage());
                }
            }
    }
}
