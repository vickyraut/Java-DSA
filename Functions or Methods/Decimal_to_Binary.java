import static java.lang.Math.pow;

public class Decimal_to_Binary {
    public static void Dec_to_Bin(int DecNum) {
        int BinNum = 0;
        int pow = 0;

        while (DecNum > 0) {
            int reminder = DecNum % 2;

            BinNum = BinNum + (reminder * (int) pow(10, pow));

            pow++;
            DecNum = DecNum / 2;
        }
        System.out.println(BinNum);
    }


    public static void main(String[] args) {
        Dec_to_Bin(10);
    }
}
