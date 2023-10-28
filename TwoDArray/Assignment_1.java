package TwoDArray;

import java.util.Scanner;

public class Assignment_1 {
    public static int countnum(int matrix[][], int num){
        int count = 0;
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==num){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[2][3];
        int num = 7;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int output=countnum(matrix, num);
        System.out.println(output);
    }
}
