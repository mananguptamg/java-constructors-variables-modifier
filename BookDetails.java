import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();

        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();

        System.out.println("Enter the price of the book: ");
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);
        book.displayBookDetails();
        sc.close();
    }
}

//Sample Output
//Enter the title of the book:
//Java Language
//Enter the author of the book:
//ABC
//Enter the price of the book:
//        909
//Title: Java Language
//Author: ABC
//Price: 909.0
