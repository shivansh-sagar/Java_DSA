package TwoDArray;
import java.util.Scanner;
public class LargestAndSmallest {
    public static void LargeAndSmall(int matrix[][]){
        int Largest= Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]>Largest){
                    Largest=matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest in the array "+Largest);
        System.out.println("Smallest in the array "+smallest);

    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        LargeAndSmall(matrix);
    }
}
