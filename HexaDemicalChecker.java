class NotHexadecimalException extends Exception {
    public NotHexadecimalException(String message) {
        super(message);
    }
}

class HexadecimalChecker {
    public void checkHexadecimal(String input) throws NotHexadecimalException {
        if (!input.matches("[0-9A-Fa-f]+")) {
            throw new NotHexadecimalException("Input is not a valid hexadecimal number.");
        }
        System.out.println(input + " is a valid hexadecimal number.");
    }

    public static void main(String[] args) {
        HexadecimalChecker checker = new HexadecimalChecker();
        String input = "1A3F"; // Example input

        try {
            checker.checkHexadecimal(input);
        } catch (NotHexadecimalException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ending the program.");
        }
    }
}
