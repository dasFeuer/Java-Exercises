package LinearSearching;

import java.util.Arrays;

public class searchString {
    public static void main(String[] args) {
        String name = "Barun";
        char target = 'n';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchTheString(name, target));
    }

    static boolean searchTheString(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean searchTheString2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
