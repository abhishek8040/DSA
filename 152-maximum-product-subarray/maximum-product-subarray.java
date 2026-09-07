class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1, suffix=1, n= nums.length, max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1; // agar 0 se multiply hoke 0 ho gya to vha se
            if(suffix==0) suffix=1; // to nayi subarray chek krege 
            prefix = prefix*nums[i];
            suffix= suffix*nums[n-i-1];
            max = Math.max(max, Math.max(prefix,suffix));
        }
        return max;
    }
}