public class Friend_Pairing {
    public static int friendsPairing(int n){
        //base
        if (n==1 || n==2){
            return n;
        }

        // work
        // choice to be single
        int fn1 = friendsPairing(n-1);

        // choice to be in pair
        // Number of choices to make pair * remaining after creating 1 pair
        int fn2 = (n-1) * friendsPairing(n-2);

        int totalWays = fn1+fn2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
