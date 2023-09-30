package Loops;

import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        // WAP to find the factorial of any number entered by the user.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;
        if (n == 0) {
            factorial = 0;
        } else {
            for (int i = 0; i <= n - 1; i++) {
                factorial *=(n - i);
            }
        }
        System.out.println("factorial of "+n+" = "+factorial);
    }
}
