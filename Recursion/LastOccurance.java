package Recursion;

public class LastOccurance {
    public static int lastOcc(int arr[], int key, int i) {
        if (i == 0) {
            return -1;
        }
        
        if (arr[i] == key) {
            return i;
        }
        int index = lastOcc(arr, key, i - 1);
        return index;

    }

    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5};
        int key=5;
        System.out.println(lastOcc(arr, key,arr.length-1));
    }
}
