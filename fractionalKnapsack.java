import java.util.Comparator;
import java.util.Arrays;

public class fractionalKnapsack {
    public static void maxProfitFractionalKnapsack(int profit[], int weight[],int W){
        int n = profit.length;
        int mat[][] = new int[n][2];
        for(int i=0;i<n;i++){
            mat[i][0] = i;
            mat[i][1] = profit[i]/weight[i];
        }
        Arrays.sort(mat, Comparator.comparingDouble(o-> o[1]));
        int capacity = W;
        int maxprofit = 0;
        for(int i=n-1;i>=0;i--){
            int idx = (int)mat[i][0];
            if(capacity > weight[idx]){
                maxprofit += profit[idx];
                capacity -= weight[idx];
            }
            else{
                maxprofit += mat[i][1]*capacity;
                capacity =0;
                break;
            }
        }
        System.out.println("Maximum Profit using fractional knapsack: "+maxprofit);
    }
    public static void main(String[] args) {
        int profit[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;
        maxProfitFractionalKnapsack(profit, weight, W);

    }
}
