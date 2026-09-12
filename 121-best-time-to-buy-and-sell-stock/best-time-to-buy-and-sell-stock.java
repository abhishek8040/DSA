class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length, max=0, cp=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<cp) cp = nums[i];
            max = Math.max(max, nums[i]-cp);
            
        }
        return max;
    }
}