abstract class Debuggable {
    public abstract void debug();
}

class ClassA extends Debuggable {
    public void debug() {
        System.out.println("Debugging ClassA");
    }
}

class ClassB extends Debuggable {
    public void debug() {
        System.out.println("Debugging ClassB");
    }
}

public class DebugDemo {
    public static void main(String[] args) {
        Debuggable[] classes = {new ClassA(), new ClassB()};
        for (Debuggable cls : classes) {
            cls.debug();
        }
    }
}