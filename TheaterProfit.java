import java.util.Scanner;

public class TheaterProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of attendees: ");
        int attendees = scanner.nextInt();

        int ticketPrice = 5;
        double performanceCost = 20 + (0.50 * attendees);
        double income = attendees * ticketPrice;
        double totalProfit = income - performanceCost;

        System.out.println("Total Profit: $" + totalProfit);
    }
}
