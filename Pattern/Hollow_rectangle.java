package Pattern;

public class Hollow_rectangle {
   public static void main(String[] args) {
    int n = 4;
    for(int line=1; line<=n; line++){
        if(line==1 || line==n){
            for(int j =1; j<=(n+1); j++){
                System.out.print("* ");
            }
        }else{
            //star
            System.out.print("* ");

            //space
            for(int k=1; k<=(n-2+1); k++){
                System.out.print("  ");
            }

            //star
            
            System.out.print("* ");
        }
        System.out.println();
    }
   } 
}
