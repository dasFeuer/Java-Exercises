package Arrays;

public class EvenDigits {
    public static void main(String[] args) {

        // Give the results which contains even number of digits i.e. 12 and 7896.
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(-53532)); //5 digits
        System.out.println(digits2(-53532)); //5 digits
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
         if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
         */
         return numberOfDigits % 2 == 0;
     }

     //Count number of digits in a number
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count ++;
            num /= 10;
        }
        return count;
    }

    // Optimized way to get the digits
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
