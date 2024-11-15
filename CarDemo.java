abstract class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    public abstract void avg();
    public abstract void mode();
}

class Maruti extends Car {
    public Maruti() {
        super("Maruti");
    }

    public void avg() {
        System.out.println("Maruti average: 18 km/l");
    }

    public void mode() {
        System.out.println("Maruti mode: Economy");
    }
}

class Santro extends Car {
    public Santro() {
        super("Santro");
    }

    public void avg() {
        System.out.println("Santro average: 20 km/l");
    }

    public void mode() {
        System.out.println("Santro mode: Comfort");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Maruti();
        car1.displayBrand();
        car1.avg();
        car1.mode();

        Car car2 = new Santro();
        car2.displayBrand();
        car2.avg();
        car2.mode();
    }
}