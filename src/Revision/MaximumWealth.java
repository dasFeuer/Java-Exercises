package Revision;

import java.util.Arrays;

public class MaximumWealth {

    static int maxWealth(int[][]account){
        int ans = Integer.MIN_VALUE;
        for (int[] person : account) {
            int sum = 0;
            for (int accounts : person) {
                sum += accounts;
            }

            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[][]account = {
                {2,5,7},
                {4,6,1},
        };

        System.out.println(Arrays.deepToString(account));
        System.out.println(maxWealth(account));

    }
}
