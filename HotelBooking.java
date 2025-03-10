import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 0;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Main method to demonstrate constructors
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating default booking
        HotelBooking defaultBooking = new HotelBooking();

        // Creating parameterized booking
        System.out.println("Enter guest name: ");
        String guestName = sc.nextLine();

        System.out.println("Enter room type: ");
        String roomType = sc.nextLine();

        System.out.println("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking paramBooking = new HotelBooking(guestName, roomType, nights);

        // Creating copy of parameterized booking
        HotelBooking copiedBooking = new HotelBooking(paramBooking);

        // Displaying details of all bookings
        System.out.println("\nDefault Booking:");
        defaultBooking.displayBookingDetails();

        System.out.println("\nParameterized Booking:");
        paramBooking.displayBookingDetails();

        System.out.println("\nCopied Booking:");
        copiedBooking.displayBookingDetails();

        sc.close();
    }
}

// Sample Output
//Enter guest name:
//Manan
//Enter room type:
//Deluxe
//Enter number of nights:
//        1
//
//Default Booking:
//Guest Name: Unknown
//Room Type: Standard
//Nights: 0
//
//Parameterized Booking:
//Guest Name: Manan
//Room Type: Deluxe
//Nights: 1
//
//Copied Booking:
//Guest Name: Manan
//Room Type: Deluxe
//Nights: 1

