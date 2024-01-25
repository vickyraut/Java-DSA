<<<<<<< HEAD
public class Grid_Ways {
    /* Here i = start row
    *       j = start column
    *       n = target row
    *       m = target column*/
    public static int gridWays(int i, int j, int n, int m){
        // base
        if(i == n-1 && j == m-1){
            return 1;
        }else if (i == n || j == n){
            return 0;
        }

        // recursion
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1+w2;
    }

//     simplified gridWays()
//    public static int gridWays(int i, int j, int n, int m){
//        // base
//        if(i == n-1 && j == m-1){
//            return 1;
//        }else if (i == n || j == n){
//            return 0;
//        }else{
//            // recursion
//            return gridWays(i+1, j, n, m)+gridWays(i, j+1, n, m);
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Total Number of ways are "+ gridWays(0,0,3,3));
    }
}
=======
public class Grid_Ways {
    /* Here i = start row
    *       j = start column
    *       n = target row
    *       m = target column*/
    public static int gridWays(int i, int j, int n, int m){
        // base
        if(i == n-1 && j == m-1){
            return 1;
        }else if (i == n || j == n){
            return 0;
        }

        // recursion
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1+w2;
    }

//     simplified gridWays()
//    public static int gridWays(int i, int j, int n, int m){
//        // base
//        if(i == n-1 && j == m-1){
//            return 1;
//        }else if (i == n || j == n){
//            return 0;
//        }else{
//            // recursion
//            return gridWays(i+1, j, n, m)+gridWays(i, j+1, n, m);
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Total Number of ways are "+ gridWays(0,0,3,3));
    }
}
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5
