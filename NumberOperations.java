import java.util.Scanner;
interface Operations {
    void calculate(int a, int b, int c);
}

abstract class CalculateOperations implements Operations {
    public abstract void calculate(int a, int b, int c);

     int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    int smallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}

public class NumberOperations extends CalculateOperations {
    @Override
    public void calculate(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        int product = a * b * c;
        int largest = largest(a, b, c);
        int smallest = smallest(a, b, c);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int c = scanner.nextInt();

        NumberOperations obj = new NumberOperations();
        obj.calculate(a, b, c);
    }
}
