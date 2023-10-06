package Array;
import java.util.*;
public class arr {
    public static void update( int number[], int nonChangeable){
        nonChangeable= 52;
        for(int i=0; i<number.length; i++){
            number[i]= number[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int marks[] = new int[50];

        //marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy : "+ marks[0]);
        // System.out.println("che : "+ marks[1]);
        // System.out.println("math : "+ marks[2]);

        // marks[2] = 100;
        // System.out.println("math : "+ marks[2]);

        // int per= (marks[0]+marks[1]+marks[2])/3;
        // System.out.println(marks.length);

        int number[]= {87,92,25};
        int nonChangeable = 15;

        update(number,nonChangeable);
        System.out.println(nonChangeable);
        for(int i=0;i<number.length; i++){
            System.out.println(number[i]);
        }


        
    }
}
