class TaxCalculator {
    private static final double TAX_RATE = 0.15;
    private static final double HOURLY_RATE = 12.0;

    public double calculateTax(double grossPay) {
        return grossPay * TAX_RATE;
    }

    public double calculateNetPay(int hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        int hoursWorked = 40;

        System.out.println("Net Pay: $" + calculator.calculateNetPay(hoursWorked));
    }
}
