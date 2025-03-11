public class VehicleRegistration {

    static class Vehicle {
        private String ownerName;
        private String vehicleType;
        private static double registrationFee = 5000.0;

        // Constructor to initialize instance variables
        public Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        // Instance method to display vehicle details
        public void displayVehicleDetails() {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }

        // Static method to update registration fee
        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create instances of Vehicle
        Vehicle vehicle1 = new Vehicle("Ramesh", "Car");
        Vehicle vehicle2 = new Vehicle("Suresh", "Motorcycle");

        // Display details of each vehicle
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(6000.0);

        // Display details again after updating registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

//Sample Output
//Owner Name: Ramesh
//Vehicle Type: Car
//Registration Fee: 5000.0
//Owner Name: Suresh
//Vehicle Type: Motorcycle
//Registration Fee: 5000.0
//Owner Name: Ramesh
//Vehicle Type: Car
//Registration Fee: 6000.0
//Owner Name: Suresh
//Vehicle Type: Motorcycle
//Registration Fee: 6000.0