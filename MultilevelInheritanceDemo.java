class X {
    protected int i, j;

    public X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int findSum() {
        return i + j;
    }
}
class Y extends X {
    public Y(int i, int j) {
        super(i, j);
    }

    public int findProduct() {
        return i * j;
    }
}

class Z extends Y {
    public Z(int i, int j) {
        super(i, j);
    }

    public int findDifference() {
        return i - j;
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Z z = new Z(5, 3);

        System.out.println("Sum: " + z.findSum());
        System.out.println("Product: " + z.findProduct());
        System.out.println("Difference: " + z.findDifference());
    }
}