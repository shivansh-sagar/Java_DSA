package Array;

public class PairsInArray {
    public static void PairinArray(int arr[]) {
        for (int i = 0; i <= arr.length-2; i++) {
            int curr = arr[i]
            for(int j=i+1; j<arr.length-1; j++){
                System.out.print("("+arr[curr]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        PairinArray(arr);
    }
}
