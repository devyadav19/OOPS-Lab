import java.util.Scanner;

public class GasMilage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMiles = 0, totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to end): ");
            double miles = scanner.nextDouble();
            if (miles == -1) break;

            System.out.print("Enter gallons used: ");
            double gallons = scanner.nextDouble();

            totalMiles += miles;
            totalGallons += gallons;

            double mpg = miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);
        }

        if (totalGallons > 0) {
            System.out.printf("Combined miles per gallon: %.2f\n", totalMiles / totalGallons);
        }
    }
}