package Operators;

public class Question {
    public static void main(String[] args) {
        //Question: what will the output of the following program
        
        //(i)

        int x = 2 , y = 5;
        int exp1 = (x * y /x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + ",");
        System.out.print(exp2);

        //output = 


        // (ii)

        int x1 =200, y1=50,z1=100;
        if(x1 > y1 && y1 >z1){
            System.out.println("hello");
        }

        if( z1 > y1 && z1 < x1){
            System.out.println("java");
        }

        if((y1+200) < x1 && (y1+150)<z1){
            System.out.println("hello java");
        }

        //output= java

        //(iii)

        int a, b, c;
        a = b = c = 2;
        a += b;
        b -= c;
        c /= (a + b);
        System.out.println(a + " " + b + " " + c);

        //  output= 4 0 0

        // (iv)

        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4/3 * (x+34) + 9 * (a+b+c) + (3+y*(2+a)) / (a + b*y);
        System.out.println(exp);

        // output= 153
        
        //(v)

        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        
        System.out.println(exp1);
        System.out.println(exp2);
        // output = 20    20 
    }
    
}
