package Arraylist;

import java.util.ArrayList;

public class ContainerOptimized {
    // 2 pointer approach
    public static int WaterStored(ArrayList<Integer> heights) {
        int MaxStore = Integer.MIN_VALUE;
        int Lp = 0;
        int Rp = heights.size() - 1;
        while (Lp < Rp) {
            // Calculate Water area
            int ht = Math.min(heights.get(Lp), heights.get(Rp));
            int wt = Rp - Lp;
            int CurrWater = ht * wt;
            MaxStore = Math.max(MaxStore, CurrWater);
            // Update pointer
            if (heights.get(Lp) < heights.get(Rp)) {
                Lp++;
            } else {
                Rp--;
            }

        }
        return MaxStore;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(2);
        heights.add(3);
        heights.add(4);
        heights.add(5);
        heights.add(18);
        heights.add(17);
        heights.add(6);
        // heights.add(3);
        // heights.add(7);

        System.out.println(WaterStored(heights));
    }
}
