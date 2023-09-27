package Conditional_statement;

import java.util.*;

public class If_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int age = 14;
        // if(age>=18){
        // System.out.println("You are adult and you can vote");

        // }
        // if(age>13 && age<18){
        // System.out.println("You are teenger");
        // }
        // else{
        // System.out.println("not adult");
        // }
        System.out.println("----------------------------------------------------------");

        // Print the largest of 2

        // int A = 10;
        // int B = 3;
        // if(A>B){
        // System.out.println("A is greater");
        // }
        // else{
        // System.out.println("B is greater ");
        // }
        System.out.println("----------------------------------------------------------");

        // print if a number is even or odd

        // int num = sc.nextInt();
        // if(num%2==0){
        // System.out.println("The number is Even");
        // }
        // else{
        // System.out.println("The number is odd");
        // }
        // System.out.println("----------------------------------------------------------");

        // ELSE IF Statememt
        // if(age>=18){
        // System.out.println("adult");
        // }
        // else if(age>=13 && age<18){
        // System.out.println("teenager");
        // }
        // else{
        // System.out.println("not adult");
        // }

        // INCOME TAX Calculator income <5L (0% tax) income b/w 5-10L(20%) income>10L
        // (30% tax)

        // int income = sc.nextInt();
        // int Tax;

        // if(income <= 500000){
        // Tax = 0;
        // }
        // else if(income >= 500000 && income <1000000){
        // Tax = (int) (income * 0.3);
        // }
        // else{
        // Tax = (int) (income * 0.3);
        // }
        // System.out.println("total tax amount : " + Tax);
        System.out.println("----------------------------------------------------------");

        // Print the largest of 3
        // int X = 1, Y = 3, Z = 6;

        // if((X>Y) && (X>Z)){
        // System.out.println("X is largest");
        // }
        // else if(Y>=Z){
        // System.out.println("Y is largest");
        // }
        // else{
        // System.out.println("Z is largest");
        // }
        System.out.println("----------------------------------------------------------");

        // Ternary Operator

        // boolean larger = (5>41)? true : false;
        // System.out.println(larger);
        // System.out.println("----------------------------------------------------------");

        // int Marks= 21;
        // String result = (Marks >=33)? "Pass": "fail";
        // System.out.println(result);

        // System.out.println("----------------------------------------------------------");

        // Switch Statement

        int number = 10;
        switch (number) {
            case 1: {
                System.out.println("Samosa");
                break;
            }
            case 2: {
                System.out.println("pizza");
                break;
            }
            case 3: {
                System.out.println("mango shake");
                break;
            }
            default:System.out.println("hello");
        }

    }
}
