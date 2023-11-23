package Recursion2;

public class BinaryString {
    public static void printBinary(int n, int lastplace, String str) {
        // Base
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // choice
        // 0
        printBinary(n - 1, 0, str+0);
        if (lastplace == 0) {
            // printBinary(n - 1, 0, str+0);
            printBinary(n - 1, 1, str+1);
        }
        //1
        // if(lastplace==1){
        //     printBinary(n-1,0, str+0);
        // }

    }

    public static void main(String[] args) {
        printBinary(3, 0,"" );
    }
}
