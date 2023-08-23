public class Fibonacci_Nth {

    private static int fib(int n) {
        if (n == 0 || n == 1){
            return n;
        }

        int fib_Nm1 = fib(n-1);
        int fib_Nm2 = fib(n-2);
        int fib_N = fib_Nm1+fib_Nm2;
        return fib_N;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
