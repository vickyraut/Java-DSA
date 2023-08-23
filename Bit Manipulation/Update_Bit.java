public class Update_Bit {
    public static int updateBit(int num, int i, int newbit) {
        // newbit decides what to do if it is 1 than set bit if it is 0 then clear bit

        // To clear bit
        int bitmask = ~(1 << i);
        num = num & bitmask;

        // To set bit
        bitmask = newbit << i;

        return num | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(updateBit(10, 2, 1));
    }
}
