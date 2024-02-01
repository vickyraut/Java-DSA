import java.util.Stack;

public class ValidParenthesis {

    public static boolean isParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // If String has only closing bracket i.e.., "))))))"
                if (stack.isEmpty()) {
                    return false;
                } else {
                    // Closing
                    if ((stack.peek() == '(' && ch == ')')
                            || (stack.peek() == '[' && ch == ']')
                            || (stack.peek() == '{' && ch == '}')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = new String("(){}");
        System.out.println(isParenthesis(str));
    }
}
