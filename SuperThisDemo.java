class SuperClass {
    String message = "Hello from SuperClass";

    public SuperClass() {
        System.out.println("SuperClass Constructor Called");
    }
}

class SubClass extends SuperClass {
    String message = "Hello from SubClass";

    public SubClass() {
        super();
        System.out.println("SubClass Constructor Called");
    }

    public void displayMessages() {
        System.out.println(super.message);
        System.out.println(this.message);
    }
}

public class SuperThisDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.displayMessages();
    }
}