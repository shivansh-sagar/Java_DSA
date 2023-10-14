package Array;

public class PairsInArray {
    public static void PairinArray(int arr[]) {
        int tp=0;
        for (int i = 0; i <= arr.length-2; i++) {
            
            
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
            
        }
        System.out.println("Toatal number of pairs is : "+ tp);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        PairinArray(arr);
    }
}
