import java.util.Scanner;

public class CreditLimitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number (-1 to end): ");
            int accountNumber = scanner.nextInt();
            if (accountNumber == -1) break;

            System.out.print("Enter balance at beginning of the month: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter total charges this month: ");
            double charges = scanner.nextDouble();

            System.out.print("Enter total credits this month: ");
            double credits = scanner.nextDouble();

            System.out.print("Enter credit limit: ");
            double creditLimit = scanner.nextDouble();

            double newBalance = balance + charges - credits;

            System.out.printf("New balance: %.2f\n", newBalance);
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }
        }
    }
}
