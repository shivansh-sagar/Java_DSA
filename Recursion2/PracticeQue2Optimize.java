package Recursion2;

public class PracticeQue2Optimize {
    static String digits[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    public static void NumToEng(int num) {
        if (num == 0) {
            return;
        }
        int lastdigit = num % 10;

        NumToEng(num / 10);
        System.out.println(digits[lastdigit]);
    }

    public static void main(String[] args) {
        NumToEng(1911);
    }
}
