public class Power_of_x_Optimized {
    public static int power(int num, int pow){
        if (pow == 0){
            return 1;
        }

        int halfPower = power(num, pow/2);
        int halfPower_x = halfPower * halfPower;

        // if number is odd
        if(pow%2 != 0){
            halfPower_x = halfPower_x * num;
        }

        return halfPower_x;
    }

    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
