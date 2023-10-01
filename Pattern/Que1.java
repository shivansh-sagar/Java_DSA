package Pattern;
import java.util.*;
public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;

        while(row<=n-1){
            if(row==1 || row==(n-1)){
                for(int i =1; i<=n; i++){
                    System.out.print("* ");
                }
            }else{
                // print *
                System.out.print("* ");
                
                // print Spaces
                for(int i = 1 ; i<=(n-2); i++){
                    System.out.print("  ");
                }

                // print *
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }
    }
}
