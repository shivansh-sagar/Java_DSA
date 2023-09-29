package Loops;
import java.util.*;
public class forloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Print square pattern 4x4

        // for(int Line=1; Line<=4; Line++){
        //     System.out.println("* * * *");
        // }

        // int Line = 1;
        // while(Line<=4){
        //     System.out.println(" * * * *");
        //     Line++;
        // }

        // print Reverse of a Number
        // int n = 191102;
        // for(int i=1; i<=5 ; i++){
        //     int reverse = n%10 ;
        //     System.out.print(reverse);
        //     n= n/10;
        // }

        //Reverse the given number
        
        int num = 10899;
        int rev = 0;
        int i = 0;
        while(i<=5){
            int last = num%10;
            rev = (rev *10)+ last;
            num = num/10; 
            i++; 
        }
        System.out.println(rev);


    }
}
