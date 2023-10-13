package Array;

public class SubArray {
    public static void subarray(int arr[], int SumN) {
        int totalsub = 0;
        int sum[] = new int[SumN];
        int index = 0;
        for (int i = 0; i < arr.length; i++) { // start
            int start = i;
            for (int j = i; j < arr.length; j++) {// end
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum[index] += arr[k];
                }
                totalsub++;
                index++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of pair : " + totalsub);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + "  ");
            if (sum[i] > largest) {
                largest = sum[i];
            }
            if (sum[i] < smallest) {
                smallest = sum[i];
            }

        }
        System.out.println();
        System.out.println("The largest sum of all the sub array is :" + largest);
        System.out.println("The smallest sum of all sub array is : " + smallest);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int N = arr.length;
        int SumN = (N * (N + 1)) / 2;
        subarray(arr, SumN);
    }

}
