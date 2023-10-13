package Array;

public class MaxSubarray3 {
    public static void maxSubarray(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currentSum = currentSum+ arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(currentSum, maxSum);

        }
        System.out.println("Our max sunarray sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -1,-2,-6,-1,-3 };
        maxSubarray(arr);
    }
}
