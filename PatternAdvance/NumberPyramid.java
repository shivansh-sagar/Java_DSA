package PatternAdvance;

public class NumberPyramid {
    public static void main(String[] args) {

        int n = 6;
        for (int line = 1; line <= n; line++) {
            // blank space
            for (int j = 1; j <= n - line; j++) {
                System.out.print("_");
            }

            // main pyramid
            for(int j = 1; j<=line; j++ ){
                System.out.print(line );
                if(j!= line){
                    System.out.print("_");
                }
            }

            // blank space
            for (int j = 1; j <= n - line; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
