package Operators;
import java.util.*;
public class Lecture {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //ARITHEMATIC OPERATOR


        //1- Binary
        int A = 10;
        int B = 5;
        System.out.println("Addition = "+ (A+B));
        System.out.println("Subtraction ="+ (A-B));
        System.out.println("Multiplication ="+(A*B));
        System.out.println("Division ="+ (A/B));
        System.out.println("Modulo ="+ (A%B));

        //Unary
        // pre increment: ++a   post increment:a++   
        int a= 10;
        int b= a++;
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);
        // pre decrement:--a   post decrement:a--
        int c = 5;
        int d = c++;
        System.out.println("c ="+ c);
        System.out.println("d ="+ d);


        // RELATIONAL OPERATORS

        int x= 10;
        int y = 5;
        System.out.println((x==y));  // == equal to
        System.out.println((x!=y));  // != not equal to
        System.out.println((x>y));   // > x is greater then y
        System.out.println((x<y));   // < x is less then y
        System.out.println((x<=y));  // <= x less then equal to y
        System.out.println((x>=y));  // >= x greater then equal to y

        // LOGICAl OPERATORS
        System.out.println((4>2)&&(9>2));
        System.out.println((1>10)||(21<100));
        System.out.println(!(10==10));

        // ASSIGNMENT OPERATOR

        int A1 = 10;
        int b1=0;
        System.out.println((b1>>A1));
        System.out.println(A1);
        System.out.println(b1);
        int B1=20;
        B-=10;
        System.out.println(B1);
        int C =4;
        C*= 4;
        System.out.println(C);
        



    }
}
