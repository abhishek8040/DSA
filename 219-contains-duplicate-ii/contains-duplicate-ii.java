class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int i=0;
        for(int num:nums){
            if(mp.containsKey(num) && Math.abs(mp.get(num)-i) <=k){
                return true;
            }
            else{
                mp.put(num,i);
            }
            i++;
        }
        return false;
    }
}