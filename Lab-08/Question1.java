class Item {
    String title;
    String author;
    int year;

    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

class Book extends Item {
    String publisher;
    String isbn;

    public Book(String title, String author, int year, String publisher, String isbn) {
        super(title, author, year);
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String toString() {
        return super.toString() + ", Publisher: " + publisher + ", ISBN: " + isbn;
    }
}

class Magazine extends Item {
    String publisher;
    int issueNumber;

    public Magazine(String title, String author, int year, String publisher, int issueNumber) {
        super(title, author, year);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public String toString() {
        return super.toString() + ", Publisher: " + publisher + ", Issue Number: " + issueNumber;
    }
}

class DVD extends Item {
    String director;
    int length; // in minutes

    public DVD(String title, String author, int year, String director, int length) {
        super(title, author, year);
        this.director = director;
        this.length = length;
    }

    public String toString() {
        return super.toString() + ", Director: " + director + ", Length: " + length + " mins";
    }
}

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Ali - 24K-3103\n");
        Book book = new Book("Java Basics", "John Doe", 2020, "TechBooks", "123-4567890123");
        Magazine magazine = new Magazine("Tech World", "Ali Amir", 2021, "Info", 45);
        DVD dvd = new DVD("Learn Java", "Nadeem", 2019, "Minhal Raza", 120);

        System.out.println("Book: " + book);
        System.out.println("Magazine: " + magazine);
        System.out.println("DVD: " + dvd);
    }
}
