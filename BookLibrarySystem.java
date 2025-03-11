public class BookLibrarySystem {

    public static class Book {
        public String ISBN;
        protected String title;
        private String author;

        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    public static class EBook extends Book {
        private double fileSize;

        public EBook(String ISBN, String title, String author, double fileSize) {
            super(ISBN, title, author);
            this.fileSize = fileSize;
        }

        public void displayBookDetails() {
            System.out.println("EBook Details: ISBN = " + ISBN + ", Title = " + title + ", Author = " + getAuthor() + ", File Size = " + fileSize + "MB");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("123-456-789", "Java Programming", "James");
        System.out.println("Book Details: ISBN = " + book.ISBN + ", Title = " + book.title + ", Author = " + book.getAuthor());
        book.setAuthor("James Oak");
        System.out.println("Updated Book Author: " + book.getAuthor());

        EBook eBook = new EBook("987-654-321", "Advanced Java", "Manan", 1.5);
        eBook.displayBookDetails();
    }
}


//Sample Output
//Book Details: ISBN = 123-456-789, Title = Java Programming, Author = James
//Updated Book Author: James Oak
//EBook Details: ISBN = 987-654-321, Title = Advanced Java, Author = Manan, File Size = 1.5MB

