class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0, end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mid%2!=0) mid -=1; // agr mid even ni h to use piche krke even krdo
            if(nums[mid]==nums[mid+1]){ // rule break ni hua
                start= mid+2;
            }
            else{ // yaani ki rule break hua h or vo single elem us pe ya phle h
                end= mid;
            }
            
        }
        return nums[start];
    }
}