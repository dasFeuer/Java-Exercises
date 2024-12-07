package Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int[][] accounts2 = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(accounts));
        System.out.println(maximumWealth(accounts2));
    }
    public static int maximumWealth(int[][] accounts) {
        // person = row
        //account = column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum  = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
