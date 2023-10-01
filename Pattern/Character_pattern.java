package Pattern;

import java.util.*;

public class Character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
