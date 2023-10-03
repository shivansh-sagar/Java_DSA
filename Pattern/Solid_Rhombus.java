package Pattern;
import java.util.*;
public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space =n-1;
        
        for(int line =1; line<=n; line++){
            //space
            for(int j =1;j<=space;j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
    }
}
