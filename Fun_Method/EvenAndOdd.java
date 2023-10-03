package Fun_Method;
import java.util.*;
public class EvenAndOdd {
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();

        if(isEven(number)){
            System.out.println("number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
