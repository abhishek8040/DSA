class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length, max = nums[0];
        for(int i=0;i<n;i++){
            int cmax =1;
            for(int j=i;j<n;j++){
                cmax = cmax*nums[j];
                max = Math.max(max,cmax);
                
            }
            
        }
        return max;
    }
}