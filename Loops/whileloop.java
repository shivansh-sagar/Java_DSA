package Loops;
import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Print hello world 100 times
        int counter =0;
        while(counter < 100){
            System.out.println("Hello World");
            counter ++;
        }

        //print number from 1 to 10
        
        int num = 1;
        while(num <= 100){
            System.out.print(num+ " ");
            num++;
        }

        //Print number from 1 to n
        int count = 1;
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        while(count <= n){
            System.out.print(count + " ");
            count++;
        }

        //Print sum of first n natural number

        int i = 1;
        int sum = 0;
        int n =sc.nextInt();

        while (i <= n) {
            sum +=i; 
            i++;   
        }

        System.out.println(sum);

    }
}
