class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100);
    }
}

// File: EmployeeTest.java
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 5000);
        Employee emp2 = new Employee("Jane", "Smith", 4500);

        System.out.printf("%s's yearly salary: $%.2f\n", emp1.getFirstName(), emp1.getYearlySalary());
        System.out.printf("%s's yearly salary: $%.2f\n", emp2.getFirstName(), emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.printf("After 10%% raise:\n");
        System.out.printf("%s's yearly salary: $%.2f\n", emp1.getFirstName(), emp1.getYearlySalary());
        System.out.printf("%s's yearly salary: $%.2f\n", emp2.getFirstName(), emp2.getYearlySalary());
    }
}
