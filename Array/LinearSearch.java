package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 10;
        arr[1] = 1;
        arr[2] = 4;
        arr[3]= 33;
        arr[4]= 41;
        arr[5] =4;
        int tar = 4;

        for(int i=0 ; i<=arr.length; i++){
            if(arr[i]== tar){
                System.out.println(arr[i]+ " at index : "+ i);
            }
        }
    }
}
