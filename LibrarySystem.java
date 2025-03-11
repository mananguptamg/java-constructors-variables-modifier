import java.util.Scanner;

class Books {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is not available.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();

        System.out.print("Enter the price of the book: ");
        double price = scanner.nextDouble();

        Books books = new Books(title, author, price);

        System.out.println("\nBook details:");
        books.displayBookDetails();

        System.out.println("\nBorrowing the book...");
        books.borrowBook();

        System.out.println("\nUpdated book details:");
        books.displayBookDetails();

        scanner.close();
    }
}

//Sample Output
//Enter the title of the book: Programming in Java
//Enter the author of the book: James Goshling
//Enter the price of the book: 299
//
//Book details:
//Title: Programming in Java
//Author: James Goshling
//Price: 299.0
//Availability: Available
//
//Borrowing the book...
//You have successfully borrowed: Programming in Java
//
//Updated book details:
//Title: Programming in Java
//Author: James Goshling
//Price: 299.0
//Availability: Not Available
