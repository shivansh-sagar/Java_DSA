package PatternAdvance;

public class HollowReactangle {
    public static void hollow_Rectangle(int totRow, int totCol) {
        // outer loop
        for (int i = 1; i <= totRow; i++) {
            // inner loop
            for (int j = 1; j <= totCol; j++) {
                if (i == 1 || i == totRow || j == 1 || j == totCol) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void doubleLine_hollow(int totRow, int totCol){
        //outer loop
        for(int i =1;i<=totRow; i++){
            //inner loop
            for(int j =1; j<=totCol; j++){
                if(i ==1|| i==2|| i== totRow || i==totRow-1 || j==1|| j==2 || j==totCol || j== totCol-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
         hollow_Rectangle(5, 6);
         doubleLine_hollow(6, 7);

    }

}
