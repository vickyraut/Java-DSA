import java.lang.reflect.Array;
import java.util.Stack;

public class StockSpanProblem {

    // Brute force Approach
    // Mere se First time approch aaya BC, Yeyyy!
//    public static void stockSpanProblem(int[] stocks, int[] span){
//        for(int i = 0; i<stocks.length; i++){
//            int days = 0;
//            int currDay = i;
//            while (currDay>=0 && stocks[currDay] <= stocks[i]){
//                days++;
//
//                currDay--;
//            }
//
//            span[i] = days;
//        }
//    }


    // Optimised using Stack
    public static void stockSpanProblem(int[] stocks, int[] span){
        Stack<Integer> stack = new Stack<>();
        // Span of first day is always 0
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i< stocks.length; i++){
            int currStock = stocks[i];
            while (!stack.isEmpty() && currStock>= stocks[stack.peek()]){
                stack.pop();
            }

            if (stack.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = stack.peek();
                span[i] = i-prevHigh;
            }

            stack.push(0);
        }

    }

    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];

        stockSpanProblem(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
}
