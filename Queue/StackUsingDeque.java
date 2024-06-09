import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.pop());  // Output: 20
        System.out.println(stack.pop());  // Output: 10
    }
}
