package Pattern;

public class Floyds_Triangle {
    public static void main(String[] args) {
        int num = 1;
        int n= 5;
        for(int line=1; line<=n; line++){
            for(int j =1; j<=line; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
