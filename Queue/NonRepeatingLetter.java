import java.util.LinkedList;
import java.util.Queue;

public class NonRepeatingLetter {
    public static void nonRepeating(String str) {
        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            queue.add(ch);

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }

            if (queue.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        nonRepeating(str);
    }
}
