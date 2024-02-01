import java.util.Stack;

public class PushFromBottom {
    public static void pushAtbottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtbottom(stack, data);
        stack.push(top);

        return;
    }

    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        pushAtbottom(stack, 4);
        System.out.println(stack);
    }
}
