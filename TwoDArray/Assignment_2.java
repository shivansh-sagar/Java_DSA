package TwoDArray;
import java.util.Scanner;

public class Assignment_2 {
    // public static int Sumof2Row(int matrix[][]){
    //     int sum = 0;
    //     for(int i = 1; i<matrix[0].length-1;i++){

    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
       
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<matrix[0].length-1;i++){
            System.out.println(matrix[1][i]);
        }
    }
}
