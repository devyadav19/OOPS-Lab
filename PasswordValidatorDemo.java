import java.util.Scanner;
  class PasswordValidator {

    public boolean isValidPassword(String password) {
        if (password.length() < 5 || password.length() > 12) {
            return false;
        }

        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch) || !Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isLowerCase(ch)) {
                hasLower = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (!hasLower || !hasDigit) {
            return false;
        }
        for (int i = 0; i < password.length() - 1; i++) {
            char current = password.charAt(i);
            char next = password.charAt(i + 1);
            if (current == next) {
                return false;
            }
        }

        return true;
    }
}

public class PasswordValidatorDemo {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password to validate: ");
        String password = scanner.nextLine();

        if (validator.isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        scanner.close();
    }
}