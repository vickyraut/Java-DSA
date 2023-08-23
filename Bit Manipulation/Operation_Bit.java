import java.util.Scanner;

public class Operation_Bit {
    public static int getBit(int num, int i) {
        int bitmask = 1 << i;
        if ((num & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int num, int i) {
        int bitmask = 1 << i;

        return num | bitmask;
    }

    public static int clearBit(int num, int i) {
        int bitmask = 1 << i;

        // reverse bitmask
        int r_bitmask = ~bitmask;

        return num & r_bitmask;
    }

    public static int clearIbits(int num, int i) {
        int bitmask = (-1) << i;

        return num & bitmask;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        System.out.println("Enter position");
        int i = sc.nextInt();

        System.out.println(getBit(num, i));
        System.out.println(setBit(num, i));
        System.out.println(clearBit(num, i));
        System.out.println(clearIbits(num, i));
    }
}
