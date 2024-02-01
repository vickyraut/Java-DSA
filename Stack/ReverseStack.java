import java.util.Stack;

public class ReverseStack {
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

    public static void reverseStack(Stack<Integer> stack){
        //base
        if(stack.isEmpty()){
            return;
        }

        // Remove All the Elements & Call for next element
        int top = stack.pop();
        reverseStack(stack);

        //Push Element At bottom
        pushAtbottom(stack, top);
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }
}
