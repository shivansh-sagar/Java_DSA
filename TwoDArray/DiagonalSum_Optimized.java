package TwoDArray;

public class DiagonalSum_Optimized {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // PrimaryDiagonal
            sum += matrix[i][i];
            // SecondaryDiagonal
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(diagonalSum(matrix));
    }
}
