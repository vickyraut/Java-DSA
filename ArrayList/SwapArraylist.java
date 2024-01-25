import java.util.ArrayList;
import java.util.Random;

public class SwapArraylist {

    public static void swapArraylist(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
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

        System.out.println("Swapped List");
        swapArraylist(list, 0,4);
    }
}
