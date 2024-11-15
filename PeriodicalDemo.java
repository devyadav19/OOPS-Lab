import java.util.Scanner;

class Book {
    int bookID;
    String title;
    String author;
    double price;

    public Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

class Periodical extends Book {
    String period;

    public Periodical(int bookID, String title, String author, double price, String period) {
        super(bookID, title, author, price);
        this.period = period;
    }

    public void modify(double newPrice, String newPeriod) {
        this.price = newPrice;
        this.period = newPeriod;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Period: " + period);
    }
}

public class PeriodicalDemo {
    public static void main(String[] args) {
        Periodical periodical = new Periodical(101, "Tech Weekly", "John Doe", 10.5, "Weekly");
        periodical.display();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new price: ");
        double newPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new period: ");
        String newPeriod = scanner.nextLine();

        periodical.modify(newPrice, newPeriod);
        periodical.display();
    }
}
