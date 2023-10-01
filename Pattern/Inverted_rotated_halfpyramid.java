package Pattern;

public class Inverted_rotated_halfpyramid {
    public static void main(String[] args) {
        int n = 5;
        int space = (n-1);
        
        for(int line = 1; line<=n; line++){
            //space
            for(int j=1; j<=space; j++){
                System.out.print("  ");
                
            }

            //star
            for(int j =1; j<=line; j++){
                System.out.print("* ");
                
            }
            System.out.println();
            space--;
        }
}
}
