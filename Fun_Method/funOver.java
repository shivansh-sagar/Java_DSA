package Fun_Method;

public class funOver {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static float sum(float a, float b){
        return a+b;
    }

    // public int
    public static void main(String[] args) {
        int sum = sum(9, 4, 7);
        System.out.println(sum);
        System.out.println(sum(10.9f, 12.234f));
    }
}
 