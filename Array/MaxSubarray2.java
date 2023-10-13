//Prefix sum
package Array;

public class MaxSubarray2 {
    public static void maxSubarray(int arr[]) {

        int currentSum = 0;
        int maxSum= Integer.MIN_VALUE;
        int preA[] = new int[arr.length];
        // Calculate prefix
        preA[0] = arr[0];
        System.out.println(preA[0]);
        for (int i = 1; i < arr.length; i++) {
            preA[i] = preA[i - 1] + arr[i];
            System.out.println(preA[i]);
        }

        for(int i = 0; i<arr.length; i++){
            int start =i;
            for(int j = i ; j<arr.length; j++){
                int end = j;

                currentSum = start == 0? preA[end]: preA[end]- preA[start - 1];
                if(maxSum < currentSum){
                    maxSum= currentSum;
                }
            }
        }
        System.out.println("MaxSum of th esub array is :" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubarray(arr);
    }
}
