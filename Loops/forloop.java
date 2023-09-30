package Loops;

import java.util.*;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print square pattern 4x4

        for(int Line=1; Line<=4; Line++){
        System.out.println("* * * *");
        }

        int Line = 1;
        while(Line<=4){
        System.out.println(" * * * *");
        Line++;
        }

        // print Reverse of a Number

        int n = 191102;
        for(int i=1; i<=5 ; i++){
        int reverse = n%10 ;
        System.out.print(reverse);
        n= n/10;
        }

        // Reverse the given number

        int num = 10899;
        int rev = 0;

        while(num>0){
        int last = num%10;
        rev = (rev *10)+ last;
        num = num/10;

        }
        System.out.println(rev);

        // keep entering number till the user enter a multiple of 10

        for(int i=1;i>0; i++){
        int num = sc.nextInt();
        System.out.println("You enter:"+ num);
        if(num%10==0){
        break;
        }
        }
        System.out.println(" you enter the multiple of 10");

        // Continue Statement
        for(int i=1; i<=5; i++){
        if(i == 3){
        continue;
        }
        System.out.println(i);
        }

        // Display all number entered by user except multiple of 10

        for(int i=1; i>0; i++){

        int value = sc.nextInt();
        if(value%10 == 0){
        continue;
        }
        System.out.println("Enter value : "+ value);
        }

        // check if a number is primr or not

        int num1 = sc.nextInt();
        if (num1 == 2) {
            System.out.println(" n is prime number");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime == true) {
                System.out.println("It is prime number");
            } else {
                System.out.println("It is not prime number");
            }
        }

    }
}
