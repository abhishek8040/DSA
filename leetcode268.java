public class leetcode268 {
    public static void main(String[] args) {
        /// return missing number in range from 1 to n;
        int nums[]= {1,3,2,5,0};
        int n= nums.length;
        int sum=0;
        int actualsum= n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum+= nums[i];
        }
        System.out.println(actualsum-sum);
    }
}
