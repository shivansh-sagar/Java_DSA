package basic;
public class TwoSum {
    public static int[] twoSum( int num[], int target){
        
        for(int i=0; i<num.length; i++){
            int start = i+1;
            for(int j=start; j<num.length; j++){
                
                if(num[i]+num[j]==target){
                   int a[]={i,j};
                   return a;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5};
        int target = 6;
        for(int i=0;i<twoSum(num, target).length;i++){
            System.out.print(twoSum(num, target)[i]+" ");
        }
    }
}
