package Array;

public class TwiceIsTrue {
    public static boolean TwiceNumber( int num[]){
        for(int i=0 ; i<num.length; i++){
            int curr = num[i];
            for(int j=i+1; j<num.length; j++){
                if( curr == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] = {1,2,4,6,8,9,2}; 
        System.out.println(TwiceNumber(num));
    }
}
