package Sorting;

public class Assignment2 {
    public static void selection(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j= i+1; j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]  = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3,6,2,1,8,7,4,5,3,1 };
        selection(arr);
        printarr(arr);
    }
}
