interface Function {
    int evaluate(int value);
}

class Half implements Function {
    @Override
    public int evaluate(int value) {
        return value / 2;
    }
}

public class FunctionDemo {
    public static int[] processArray(int[] inputArray) {
        Function function = new Half();
        int[] resultArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            resultArray[i] = function.evaluate(inputArray[i]);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40};
        int[] output = processArray(input);

        System.out.println("Processed Array:");
        for (int value : output) {
            System.out.print(value + " ");
        }
    }
}