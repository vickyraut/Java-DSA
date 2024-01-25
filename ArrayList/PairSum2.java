import java.util.ArrayList;

public class PairSum2 {
    // TC = o(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // finding the pivot point
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int lp = pivot + 1;
        int rp = pivot;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else { // list.get(left_pointer) + list.get(right_pointer) > target
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum2(list, 16));
    }
}
