package TwoDArray;

public class StairCaseSearch {
    public static boolean staincase(int matrix[][], int key) {
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix.length) {
            if (key == matrix[row][col]) {
                System.out.println("Element is found at index (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
            System.out.println(matrix[row][col]);
        }
        System.out.println("Element is not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int key = 11;
        staincase(matrix, key);
    }
}
