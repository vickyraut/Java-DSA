<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Just adding random data to Arraylist
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            list.add(random.nextInt(1, 10));
        }

        System.out.println("Original List");
        System.out.println(list);

        // Sorting list
        Collections.sort(list);

        System.out.println("Ascending order Sorted List");
        // Sorting list
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Descending order Sorted List");
        // Sorting list
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Just adding random data to Arraylist
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            list.add(random.nextInt(1, 10));
        }

        System.out.println("Original List");
        System.out.println(list);

        // Sorting list
        Collections.sort(list);

        System.out.println("Ascending order Sorted List");
        // Sorting list
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Descending order Sorted List");
        // Sorting list
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5
