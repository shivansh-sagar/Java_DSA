package Recursion2;

public class PracticeQue1 {
    public static void keyIdx(int arr[],int idx, int key){
        //Base Condition
        if(idx == arr.length){
            return;
        }
        //kaam
        if(key == arr[idx]){
            System.out.println(idx);
        }
        keyIdx(arr, idx+1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        keyIdx(arr, 0, 2);
    }
}
