public class Matrix {
    static final int X_DIM = 3;
    static final int Y_DIM = 3;
    static final int Z_DIM = 3;

    public static void set(int value, int indexX, int indexY, int indexZ, int[] array) {
        int index = indexX * (Y_DIM * Z_DIM) + indexY * Z_DIM + indexZ;
        array[index] = value;
    }

    public static int get(int indexX, int indexY, int indexZ, int[] array) {
        int index = indexX * (Y_DIM * Z_DIM) + indexY * Z_DIM + indexZ;
        return array[index];
    }

    public static void main(String[] args) {
        int[] oneDArray = new int[X_DIM * Y_DIM * Z_DIM];
        set(10, 1, 2, 2, oneDArray);
        System.out.println("Value at (1, 2, 2): " + get(1, 2, 2, oneDArray));
    }
}
