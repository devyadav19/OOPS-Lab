import java.util.Scanner;

public class DrivingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double miles = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average fees per day: ");
        double averageFees = scanner.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = scanner.nextDouble();

        double dailyCost = (miles / 25.0) * costPerGallon + averageFees + tolls; // Assuming 25 MPG
        System.out.printf("Your daily driving cost is: $%.2f\n", dailyCost);
    }
}