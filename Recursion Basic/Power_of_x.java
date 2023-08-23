public class Power_of_x {
    public static int power(int num, int pow){
        if (pow == 0){
            return 1;
        }

        int pow_numM1 = power(num, pow-1);
        int pow_num = num * pow_numM1;

        return pow_num;
    }

    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
