import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static int fractionalKnapsack(int[] val, int[] weight, int capacity){
        int maxValue = 0;
        double ratio[][] = new double[val.length][2];
        // 1st col to store index, and 2nd for ratio
        for (int i = 0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = ((double) val[i] / weight[i]);
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        for(int i = ratio.length-1; i>=0; i--){
            int index = (int)ratio[i][0];
            if (weight[index] <= capacity){
                maxValue +=  val[index];
                capacity = capacity - weight[index];
            }else {
                maxValue += (int) (ratio[i][1] * capacity);
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int capacity = 50;

        System.out.println(fractionalKnapsack(val, weight, capacity));

    }
}
