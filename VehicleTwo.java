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

    @Override
    public String toString() {
        try {
            return make + " " + model + " " + color + " " + year + " " + mileage + " ";
        }
        catch (Exception e) {
            System.out.println("An error has occurred" + e.getMessage());
            return "";
        }
    }
}
