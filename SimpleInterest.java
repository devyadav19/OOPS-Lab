import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        double years = months / 12.0;
        double totalInterest = principal * annualRate * years;
        double balance = principal + totalInterest;

        System.out.println("Total interest: $" + totalInterest);
        System.out.println("Final balance: $" + balance);
    }
}
