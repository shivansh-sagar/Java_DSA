package Array;

public class ReverseArray {
    public static void Reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int j = 0; j <= arr.length - 1; j++) {
            System.out.print(arr[j] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Reverse(arr);
    }
}
