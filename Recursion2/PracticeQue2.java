package Recursion2;

public class PracticeQue2 {
    public static void NumberToStr(String arr[], int idx, String number){
        //BaseCondition
        if(idx==number.length()){
            return;
        }
        // Kaam
        int num = (int)number.charAt(idx)-48;
        System.out.print(arr[num-0]+" ");
        
        //Calling the function idx+1
        NumberToStr(arr, idx+1, number);
    }
    public static void main(String[] args) {
        String arr[]= {"Zero","One", "Two","Three","Four","Five","Six","Seven","Eight", "Nine"};
        NumberToStr(arr, 0, "202000052");
        
        

    }
}
