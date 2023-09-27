package Operators;

public class Question {
    public static void main(String[] args) {
        //Question: what will the output of the following program
        
        //(i)

        int x2 = 2 , y2 = 5;
        int exp1 = (x2 * y2 /x2);
        int exp2 = (x2 * (y2/ x2));

        System.out.print(exp1 + ",");
        System.out.print(exp2);

        //output = 


        // (ii)

        // int x1 =200, y1=50,z1=100;
        // if(x1 > y1 && y1 >z1){
        //     System.out.println("hello");
        // }

        // if( z1 > y1 && z1 < x1){
        //     System.out.println("java");
        // }

        // if((y1+200) < x1 && (y1+150)<z1){
        //     System.out.println("hello java");
        // }

        //output= java

        //(iii)

        // int a, b, c;
        // a = b = c = 2;
        // a += b;
        // b -= c;
        // c /= (a + b);
        // System.out.println(a + " " + b + " " + c);

        //  output= 4 0 0

        // (iv)

        // int x = 9, y = 12;
        // int a1 = 2, b1 = 4, c1 = 6;

        // int exp = 4/3 * (x+34) + 9 * (a1+b1*c1) + (3+y*(2+a1)) / (a1 + b1*y);
        // System.out.println(exp);

        // output= 278
        
        //(v)

        // int x3 = 10, y3 = 5;
        // int exp_1 = (y3 * (x3 / y3 + x3 / y3));
        // int exp_2 = (y3 * x3 / y3 + y3 * x3 / y3);
        
        // System.out.println(exp_1);
        // System.out.println(exp_2);
        // output = 20    20 
    }
    
}
