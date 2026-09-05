class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        int tar=0;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left= i+1;
            int right = n-1;
            int newtar= tar-nums[i];
            while(left<right){
                if(nums[left]+nums[right]<newtar){
                    left++;
                }
                else if(nums[left]+nums[right] > newtar){
                    right--;
                }
                else {
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                }
                
                
            }
        }
        return ans;
    }
}