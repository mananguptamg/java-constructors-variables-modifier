import java.util.Scanner;

public class PersonInformation {
    private String name;
    private int age;
    private int phoneNumber;

    // Default constructor
    public PersonInformation() {
        this.name = "";
        this.age = 0;
        this.phoneNumber = 0;
    }

    // Parameterized constructor
    public PersonInformation(String name, int age, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Copy constructor
    public PersonInformation(PersonInformation other) {
        this.name = other.name;
        this.age = other.age;
        this.phoneNumber = other.phoneNumber;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input to create original person
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline

        System.out.println("Enter phone number: ");
        int phoneNumber = sc.nextInt();

        // Create original person object
        PersonInformation person1 = new PersonInformation(name, age, phoneNumber);

        // Cloning person1 into person2 using the copy constructor
        PersonInformation person2 = new PersonInformation(person1);

        System.out.println("\nOriginal Person Details:");
        person1.displayPersonDetails();

        System.out.println("\nCloned Person Details:");
        person2.displayPersonDetails();

        sc.close();
    }
}

//Sample Output
//Enter name:
//Manan
//Enter age:
//        22
//Enter phone number:
//        98989898
//
//Original Person Details:
//Name: Manan
//Age: 22
//Phone Number: 98989898
//
//Cloned Person Details:
//Name: Manan
//Age: 22
//Phone Number: 98989898


