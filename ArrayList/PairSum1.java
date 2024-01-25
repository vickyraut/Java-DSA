<<<<<<< HEAD
import java.util.ArrayList;

public class PairSum1 {
    // Brute Force Approach TC = o(n2)
//    public static boolean pairSum1(ArrayList<Integer> list, int target) {
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) + list.get(j) == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    // Optimized Approach = 2 pointers approach TC = o(n)
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int left_pointer = 0;
        int right_pointer = list.size() - 1;

        while (left_pointer < right_pointer) {
            if (list.get(left_pointer) + list.get(right_pointer) == target) {
                return true;
            } else if (list.get(left_pointer) + list.get(right_pointer) < target) {
                left_pointer++;
            } else { // list.get(left_pointer) + list.get(right_pointer) > target
                right_pointer--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        System.out.println(pairSum1(list, target));
    }
}
=======
import java.util.ArrayList;

public class PairSum1 {
    // Brute Force Approach TC = o(n2)
//    public static boolean pairSum1(ArrayList<Integer> list, int target) {
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) + list.get(j) == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    // Optimized Approach = 2 pointers approach TC = o(n)
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int left_pointer = 0;
        int right_pointer = list.size() - 1;

        while (left_pointer < right_pointer) {
            if (list.get(left_pointer) + list.get(right_pointer) == target) {
                return true;
            } else if (list.get(left_pointer) + list.get(right_pointer) < target) {
                left_pointer++;
            } else { // list.get(left_pointer) + list.get(right_pointer) > target
                right_pointer--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        System.out.println(pairSum1(list, target));
    }
}
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5
