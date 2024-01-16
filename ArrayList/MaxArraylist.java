import java.util.ArrayList;
import java.util.Random;

public class MaxArraylist {
    public static int maxArraylist(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Just adding random data to Arraylist
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            list.add(random.nextInt(1, 10));
        }

        System.out.println("Original List");
        System.out.println(list);

        System.out.println("Max value from arraylist is " + maxArraylist(list));
    }
}
