package Fun_Method;
import java.util.*;
public class palindrome {
    public static boolean palindrome(int num ) { 
        
        int temp= num;
        int rev = 0;
        while(temp>0){
            int last = temp%10;
            rev= (rev*10)+last;
            temp=temp/10;
        }
        System.out.println("rev : "+ rev);
        if(rev == num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num= sc.nextInt();
        

        palindrome( num );
        if(palindrome(num)){
            System.out.println("It is palindrome number");
        }else{
            System.out.println("it is not palindrome");
        }
        
        
    }
}
