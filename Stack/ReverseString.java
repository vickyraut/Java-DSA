import java.util.Stack;

public class ReverseString {
    public static StringBuilder reverseString(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder newString = new StringBuilder();

        int iter = 0;
        while (iter < str.length()){
            s.push(str.charAt(iter));
            iter++;
        }

        while (!s.isEmpty()){
            newString.append(s.pop());
        }

        return newString;
    }


    public static void main(String[] args) {
        System.out.println(reverseString("abcde"));
    }
}
