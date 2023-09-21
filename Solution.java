import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // que1- input 3 no. and  avg of 3 number
        // int a = sc.nextInt();

        // int b = sc.nextInt();

        // int c = sc.nextInt();

        // float Avg = (a+b+c)/3;
        // System.out.println("avarage is :"+ Avg);

        //In a program, input the side of the square and you have to output the area of the square
        // System.out.println("Enter the side of the square"); 
        // float side = sc.nextFloat();

        // float Area = side * side;
        // System.out.println("are of the square is:"+ Area);

        // Enter cost of 3 items from the user a pencil, apen,and an erasaer you have to output the total cost of the item back to the user as 
        //their bill.(add on You can also try adding !8% gst tax yo the items in the billsas the advance problem)

        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eraser = sc.nextInt();

        int Total = pencil + pen + eraser;
        int gst = (Total/100)*18;
        
        int finalPrise = Total + gst;
        System.out.println("Final prise including Gst:"+ finalPrise); 
        
        // Will the following statement give any error in java
        int $ =24;
        System.out.println($);

    }
}
