import java.util.LinkedList;
import java.util.Queue;

public class StackUsing_2queues {
    public static class stack {
        static Queue<Integer> queue1 = new LinkedList<>();
        static Queue<Integer> queue2 = new LinkedList<>();

        public static boolean isEmpty() {
            return queue1.isEmpty() && queue2.isEmpty();
        }

        public void push(int data) {
            if (!queue1.isEmpty()) {
                queue1.add(data);
            } else {
                queue2.add(data);
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int top = -1;

            if (!queue1.isEmpty()) {
                while (!queue1.isEmpty()) {
                    top = queue1.remove();
                    if (queue1.isEmpty()) {
                        break;
                    }
                    queue2.add(top);
                }
            } else { // case 2
                while (!queue2.isEmpty()) {
                    top = queue2.remove();
                    if (queue2.isEmpty()) {
                        break;
                    }
                    queue1.add(top);
                }

            }

            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int top = -1;

            if (!queue1.isEmpty()) {
                while (!queue1.isEmpty()) {
                    top = queue1.remove();
                    queue2.add(top);
                }
            } else { // case 2
                while (!queue2.isEmpty()) {
                    top = queue2.remove();
                    queue1.add(top);
                }

            }

            return top;
        }
    }

    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
