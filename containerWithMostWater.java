import java.util.ArrayList;

class containerWithMostWater{

    //// BRUTE FORCE //. Time comp: O(n^2)///
    
    public static int mostWaterBruteForce(ArrayList<Integer> height){
        int maxwater = 0;
        for(int i=0 ; i< height.size()-1; i++){
            
            for(int j=i+1;j<height.size();j++){
                maxwater = Math.max(maxwater, (j-i)* Math.min(height.get(i), height.get(j)));
                
            }
            
            
        }
        return maxwater;
    }

    ////      OPTIMAL Approach       TC: O(n)  ////
    /// 
    public static int mostWater(ArrayList<Integer> height){
        int i= 0, j= height.size()-1, maxwater = 0;
        while(i<j){
            maxwater = Math.max(maxwater, Math.min(height.get(i), height.get(j))*(j-i));

            if(height.get(i)<height.get(j)){
                i++;
            }
            else j--;
        }
        return maxwater;
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        int most = mostWaterBruteForce(height);
        System.out.println(most);

        // optimal
        int optimalmost = mostWater(height);
        System.out.println(optimalmost);
    }


}