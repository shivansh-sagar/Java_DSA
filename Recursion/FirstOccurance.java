package Recursion;

public class FirstOccurance {
    public static int firstOcc(int arr[],int key, int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5};
        int key = 5;
        System.out.println(firstOcc(arr, key, 0));
    }
}
