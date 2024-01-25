   public static int storeWater(ArrayList<Integer> height){
       int maxWater = 0;

       for (int i = 0; i<height.size(); i++){
           for (int j = i+1; j<height.size(); j++){
               int ht = Math.min(height.get(i), height.get(j));
               int width = j-i;
               int currWater = ht*width;

               maxWater = Math.max(maxWater, currWater);
           }
       }
       return maxWater;
   }