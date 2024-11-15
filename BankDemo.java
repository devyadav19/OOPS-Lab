import java.util.Scanner;

class Bank {
    public double deposit(double amount, double balance) {
        return balance + amount;
    }

    public double withdraw(double amount, double balance) {
        return (balance >= amount) ? balance - amount : 0;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        double balance = 1000.0; // Initial balance

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        balance = bank.deposit(depositAmount, balance);
        System.out.println("New Balance after deposit: $" + balance);

        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();
        balance = bank.withdraw(withdrawAmount, balance);

        if (balance == 0) {
            System.out.println("Withdrawal failed. Insufficient balance.");
        } else {
            System.out.println("New Balance after withdrawal: $" + balance);
        }
    }
}
