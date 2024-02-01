import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicateParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Closing
            if (ch == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // Duplicate
                } else {
                    stack.pop(); // Opening pair
                }
            } else {
                // Opening
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))"; // True
        String str2 = "(a+b)"; // False

        System.out.println(isDuplicateParenthesis(str));
        System.out.println(isDuplicateParenthesis(str2));
    }
}
