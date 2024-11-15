class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d\n", month, day, year);
    }
}

// File: DateTest.java
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(11, 15, 2024);
        date.displayDate();

        date.setMonth(12);
        date.setDay(25);
        date.setYear(2025);
        date.displayDate();
    }
}
