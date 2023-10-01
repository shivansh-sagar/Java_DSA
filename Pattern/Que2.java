package Pattern;
import java.util.*;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int star = 1;
       int spaces= n-1;
       int row = 1;

       while(row <= n){
        for(int i = 1 ; i<=spaces; i++){
            System.out.print(" ");
        }
        for(int i = 1 ; i<=star; i++){
            System.out.print(i+ " ");
        }

        System.out.println();
        spaces--;
        star++;
        row++;
       }
    }
}
