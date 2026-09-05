class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        int ans=0;
        int gap= Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int left= i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum<target){
                    int newgap = target-sum;
                    if(newgap<gap){
                        gap = newgap;
                        ans = sum;
                    }
                    left++;
                }
                else if(sum>target){
                    int newgap = sum-target;
                    if(newgap<gap){
                        gap = newgap;
                        ans = sum;
                    }
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return ans;
    }
}