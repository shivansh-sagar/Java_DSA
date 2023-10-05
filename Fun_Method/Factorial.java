package Fun_Method;

public class Factorial {
    public static int factorial(int num) {
        int fact = 1;
        if (num == 0) {
            return fact;
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}
