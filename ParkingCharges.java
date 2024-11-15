import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCharges = 0;

        while (true) {
            System.out.print("Enter hours parked (-1 to end): ");
            int hours = scanner.nextInt();
            if (hours == -1) break;

            double charge = 2.0;
            if (hours > 3) {
                charge += 0.5 * (hours - 3);
            }
            charge = Math.min(charge, 10.0);

            System.out.printf("Charge for this customer: $%.2f\n", charge);
            totalCharges += charge;
        }

        System.out.printf("Total charges for all customers: $%.2f\n", totalCharges);
    }
}
