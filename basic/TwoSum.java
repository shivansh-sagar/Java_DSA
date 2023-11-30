package basic;
public class TwoSum {
    public static int twoSum( int num[], int target){
        int sum=0;
        int out[] =new int[2] ;
        
        for(int i=0; i<num.length; i++){
            int start = i+1;
            for(int j=start; j<num.length; j++){
                
                if(num[i]+num[j]==target){
                   

                    return out[]{i,j};
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5};
        int target = 6;
        System.out.println(twoSum(num
        , target));
    }
}
