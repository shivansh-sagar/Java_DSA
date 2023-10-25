package TwoDArray;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int SR = 0;
        int ER = matrix.length - 1;
        int SC = 0;
        int EC = matrix[0].length - 1;
        while (SR > ER / 2 && SC > EC / 2) {
            // TOP
            // RIGHT
            // BOTTOM
            // LEFT
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
    }
}
