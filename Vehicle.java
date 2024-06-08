import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Vehicle {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Vehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } 
        catch (Exception e) {
            System.out.println("Error initializing vehicle: " + e.getMessage());
        }
    }

    public void updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } 
        catch (Exception e) {
            System.out.println("Error updating vehicle: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        try {
            return make + " " + model + " " + color + " " + year + " " + mileage;
        } 
        catch (Exception e) {
            System.out.println("Error converting vehicle to string: " + e.getMessage());
            return "";
        }
    }
}

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Vehicle> vehicleInventory = new ArrayList<>();

        while (true) {
            
            System.out.println("\nBAD NEWS CAR SALES");
            System.out.println("Select from the following options:");
            System.out.println("----------------------------------");
            System.out.println("1. ADD VEHICLE");
            System.out.println("2. UPDATE VEHICLE");
            System.out.println("3. REMOVE VEHICLE");
            System.out.println("4. DISPLAY INVENTORY");
            System.out.println("5. EXPORT INVENTORY");
            System.out.println("6. EXIT");

            int menuNumber = input.nextInt();

            if (menuNumber < 1 || menuNumber > 5) {
                System.out.println("Not a menu option. Please choose a number between 1-5.");
                continue;
            }

            if (menuNumber == 1) {
                try {
                    System.out.println("Enter make, model, color, year, and mileage:");
                    String make = input.next();
                    String model = input.next();
                    String color = input.next();
                    int year = input.nextInt();
                    int mileage = input.nextInt();

                    Vehicle newVehicle = new Vehicle(make, model, color, year, mileage);
                    vehicleInventory.add(newVehicle);
                    System.out.println("Vehicle Added: " + newVehicle);
                } 
                catch (Exception e) {
                    System.out.println("Error adding vehicle: " + e.getMessage());
                }
            } 

            else if (menuNumber == 2) {
                try {
                    if (vehicleInventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } 
                    else {
                        System.out.println("Enter the index number of the vehicle to be updated:");
                        int vehicleIndex = input.nextInt();
                        if (vehicleIndex < 0 || vehicleIndex >= vehicleInventory.size()) {
                            System.out.println("Invalid Index Number");
                        } 
                        else {
                            System.out.println("Enter new make, model, color, year, and mileage:");
                            String make = input.next();
                            String model = input.next();
                            String color = input.next();
                            int year = input.nextInt();
                            int mileage = input.nextInt();

                            vehicleInventory.get(vehicleIndex).updateVehicle(make, model, color, year, mileage);
                            System.out.println("Vehicle has been updated: " + vehicleInventory.get(vehicleIndex));
                        }
                    }
                } 
                catch (Exception e) {
                    System.out.println("Error updating vehicle: " + e.getMessage());
                }
            } 

            else if (menuNumber == 3) {
                try {
                    if (vehicleInventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } 
                    else {
                        System.out.println("Enter the index number of the vehicle to be removed:");
                        int vehicleIndex = input.nextInt();
                        if (vehicleIndex < 0 || vehicleIndex >= vehicleInventory.size()) {
                            System.out.println("Invalid Index Number");
                        } 
                        else {
                            vehicleInventory.remove(vehicleIndex);
                            System.out.println("Vehicle has been removed.");
                        }
                    }
                } 
                catch (Exception e) {
                    System.out.println("Error removing vehicle: " + e.getMessage());
                }
            } 

            else if (menuNumber == 4) {
                try {
                    if (vehicleInventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    }
                    else {
                        System.out.println("\nBad Newz Inventory");
                        System.out.println("\n-------------------\n");
                        System.out.println(vehicleInventory);
                    }
                }
                catch (Exception e) {
                    System.out.printf("Error displaying the inventory! " + e.getMessage());
                }

            }
            else if (menuNumber == 5) {
                try {
                    if (vehicleInventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } 
                    else {
                        System.out.println("Do you want to print the information to a file? (Y/N)");
                        String YesNo = input.next();
                        if (YesNo.equalsIgnoreCase("Y")) {
                            String filePath = "C:\\Users\\Jake\\OneDrive\\Desktop\\Folder\\School\\CSU Global\\CSC320.txt";
                            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                                for (Vehicle vehicle : vehicleInventory) {
                                    writer.write(vehicle.toString());
                                    writer.newLine();
                                }
                                System.out.println("Vehicle inventory has been printed!");
                            } 
                            catch (IOException e) {
                                System.out.println("An error occurred while writing to the file: " + e.getMessage());
                            }
                        } 
                        else {
                            System.out.println("Vehicle Inventory:");
                            for (Vehicle vehicle : vehicleInventory) {
                                System.out.println(vehicle);
                            }
                        }
                    }
                } 
                catch (Exception e) {
                    System.out.println("Error displaying inventory: " + e.getMessage());
                }
            } 

            else if (menuNumber == 6) {
                System.out.println("Exiting the menu. Goodbye!");
                break;
            }
        }

        input.close();
    }
}

