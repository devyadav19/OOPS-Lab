class Figure {
    protected double r, a, v;

    public void dispArea() {
        System.out.printf("Area: %.2f\n", a);
    }

    public void dispVolume() {
        System.out.printf("Volume: %.2f\n", v);
    }
}

class Cone extends Figure {
    private double h, s;

    public Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public void calcArea() {
        a = (Math.PI * r * s) + (Math.PI * r * r);
    }

    public void calcVolume() {
        v = (Math.PI * r * r * h) / 3;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Cone cone = new Cone(3, 5, 7);
        cone.calcArea();
        cone.calcVolume();
        cone.dispArea();
        cone.dispVolume();
    }
}