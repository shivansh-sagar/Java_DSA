package Loops;
import java.util.*;
public class dowhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        do{
            System.out.println("Hello World");
            counter++;
        }while(counter<=0);
       
        // keep entering number till the user enter a multiple of 10
        
        do{
            System.out.print("enter your number:" );
            int num =sc.nextInt();
            
            if(num%10 == 0){
                break;
            }
        }while(true);
        System.out.println("you enter a multiple of 10");

         //Display all number entered by user except multiple of 10
         do{
            int value = sc.nextInt();
            if(value%10==0){
                continue;
            }
            System.out.println("you enter :" + value);
         }while(true);

    }
}
