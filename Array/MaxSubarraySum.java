package Array;

public class MaxSubarraySum {
    public static void maxSubarray(int arr[]) {
        int currentSum = 0;
        int maxsum= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum= 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+ " ");
                    currentSum += arr[k];
                   
                }
                if(currentSum>maxsum){
                    maxsum = currentSum;
                }
                 System.out.println("  The sum of sub array is   : " + currentSum);
                System.out.println();
                
            }
            System.out.println();

        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubarray(arr);
    }
}
