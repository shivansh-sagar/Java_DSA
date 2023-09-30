package Loops;

import java.util.*;

public class Que2 {
    public static void main(String[] args) {
        // Write a program that reads a set of integers, and then prints the sum of the
        // even and odd integers
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int choice = 0;
        do {
            System.out.print("Enter Number : ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
            System.out.println("Sum of even numbers : " + even);
            System.out.println("Sum of odd numbers : " + odd);
            System.out.println("Do you want to continue? press 1 for yes and 0 for no");
            choice = sc.nextInt();
        } while (choice == 0);

    }

}
