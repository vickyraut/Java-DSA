import java.util.ArrayList;

public class HeapOperations {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add element at last
            arr.add(data);

            int childIndex = arr.size() - 1;
            int parentIndex = (childIndex - 1) / 2;

            while (arr.get(childIndex) < arr.get(parentIndex)) {
                // Swap
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
            ;
        }

        public int remove() {
            // store element return at last
            int data = arr.get(0);

            // Step 1: swap 1st & Last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2: Remove last element
            arr.remove(arr.size() - 1);

            // Step 3: Heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);

        while (!heap.isEmpty()) {
            System.out.println(heap.peek());
            heap.remove();
        }
    }
}
