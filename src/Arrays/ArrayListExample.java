package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();


//        arrayList.add(12); // --> 0 index
//        arrayList.add(1);
//        arrayList.add(42); //<-- contains
//        arrayList.add(142);
//        arrayList.add(1222);

//        System.out.println(arrayList.contains(42)); // --> true else false
//        arrayList.set(0, 22); //--> 12 will replace with 22\
//        System.out.println(arrayList);

//        arrayList.remove(2); //--> will remove index 2

        //Input
        System.out.println("Enter the number: ");
        for (int i = 0; i < 5; i++) {
            arrayList.add(sc.nextInt());
        }

        //Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.get(i));// pass the index here. List[index] syntax wil not work here!
        }
        System.out.println(arrayList);
    }
}
