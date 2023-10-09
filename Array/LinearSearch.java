package Array;

public class LinearSearch {
    public static int linear_Search(int number[], int tar){
        for(int i= 0; i<number.length; i++){
            if(number[i]== tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,21,4,78,33,16,9,18,41,};
        int tar = 178;

        int index=linear_Search(number, tar);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found on index : "+ index);
        }

       
    }
}
