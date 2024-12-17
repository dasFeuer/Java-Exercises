package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithMaxCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximumCandies = 0;
        for(int candy : candies){
            maximumCandies = Math.max(maximumCandies, candy);
        }

        List<Boolean>result = new ArrayList<>();

        for(int candy : candies){
            result.add(candy + extraCandies >= maximumCandies);
        }
        return result;
    }
        public static void main(String[] args) {
        int[] candies ={3, 2, 1, 5, 7};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
