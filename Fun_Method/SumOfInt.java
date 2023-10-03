package Fun_Method;
import java.util.*;
public class SumOfInt {
    public static void findSum(int num) {
        int sum = 0;
        while(num>0){
            int last = num%10;
            sum = sum + last;
            num = num/10;
        }
        System.out.println("The sum of the digit in an integer : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int num = sc.nextInt();
        findSum(num);
    }
}
