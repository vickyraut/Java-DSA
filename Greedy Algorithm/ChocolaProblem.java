import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static int getMinCost(Integer[] costVer, Integer[] costHor) {
        // Sorting Array in reverse order to get Max cost cuts first
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int horPointer = 0, verPointer = 0;
        int horPieces = 1, verPieces = 1;
        int minCost = 0;

        while (horPointer < costHor.length && verPointer < costVer.length) {
            if (costHor[horPointer] >= costVer[verPointer]) {
                horPieces++;
                minCost = minCost + (costHor[horPointer] * verPieces);// Cost of cut is Horizontal cut cost * vertical pieces
                horPointer++;
            } else {
                verPieces++;
                minCost = minCost + (costVer[verPointer] * horPieces);// Cost of cut is Vertical cut cost * horizontal pieces
                verPointer++;
            }
        }

        // Finding cost for remaining Horizontal Cuts
        while (horPointer < costHor.length) {
            minCost = minCost + (costHor[horPointer] * verPieces);// Cost of cut is Horizontal cut cost * vertical pieces
            horPieces++;
            horPointer++;
        }

        // Finding cost for remaining Vertical Cuts
        while (verPointer < costVer.length) {
            minCost = minCost + (costVer[verPointer] * horPieces);// Cost of cut is Vertical cut cost * horizontal pieces
            verPieces++;
            verPointer++;
        }

        return minCost;
    }

    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer[] costVer = {2, 1, 3, 1, 4}; // m-1
        Integer[] costHor = {4, 1, 2}; // n-1


        System.out.println(String.format("Minimum cost of Cutting chocolate in %d*%d pieces: ", n, m) + getMinCost(costVer, costHor));
    }
}
