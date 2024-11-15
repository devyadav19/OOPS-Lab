class WashingMachine {
    public void switchOn() {
        System.out.println("Washing Machine Switched On");
    }

    public int acceptClothes(int noOfClothes) {
        System.out.println(noOfClothes + " clothes accepted.");
        return noOfClothes;
    }

    public void acceptDetergent() {
        System.out.println("Detergent accepted.");
    }

    public void switchOff() {
        System.out.println("Washing Machine Switched Off");
    }
}

public class WashingMachineDemo {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();
        machine.switchOn();

        machine.acceptClothes(5);
        machine.acceptDetergent();

        machine.switchOff();
    }
}
