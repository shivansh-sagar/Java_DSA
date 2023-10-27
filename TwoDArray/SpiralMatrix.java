package TwoDArray;



public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int StartRow = 0;
        int EndRow = matrix.length - 1;
        int StartCol = 0;
        int EndCol = matrix[0].length - 1;
        while (StartRow <= EndRow && StartCol <= EndCol) {
            // TOP
            for (int i = StartCol; i <= EndCol; i++) {
                System.out.print(matrix[StartRow][i] + " ");
            }

            // RIGHT
            for (int j = StartRow + 1; j <= EndRow; j++) {
                System.out.print(matrix[j][EndCol] + " ");
            }

            // BOTTOM
            for (int i = EndCol - 1; i >= StartCol; i--) {
                if(StartRow==EndRow){
                    break;
                }
                System.out.print(matrix[EndRow][i] + " ");
            }

            // LEFT
            for (int j = EndRow - 1; j >= StartRow + 1; j--) {
                if(StartCol==EndCol){
                    break;
                }
                System.out.print(matrix[j][StartCol] + " ");
            }

            StartRow++;
            EndRow--;
            StartCol++;
            EndCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
                 };

        printSpiral(matrix);
    }
}
