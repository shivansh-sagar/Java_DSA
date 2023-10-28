package TwoDArray;

public class Search2D {
    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix.length - 1;
        while (row < matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key is found at index ("+ row+","+ col+ ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col --;
            }
            else{
                row++;
            }
        }
        System.out.println("key is not found");
        return false;
            
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int key = 11;
        stairCaseSearch(matrix, key);

    }
}
