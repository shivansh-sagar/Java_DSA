package LeetCode;

public class ContainerWithWater {
    public static int maxArea(int[] height) {
        int maxWater = 0; 
        int lp= 0; 
        int rp= height.length-1;
        while(lp<rp){
            int ht = Math.min(height[lp],height[rp]);
            int wt= rp-lp;
            int waterStore= ht*wt;
            //condition
            if(lp<rp){
               lp++; 
            }
            if(rp<lp){
                rp--;
            }
            if(maxWater<waterStore){
                maxWater= waterStore;
            }
            
        }
        return maxWater;
     }
     public static void main(String[] args) {
        int height[]= {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
     }
}
