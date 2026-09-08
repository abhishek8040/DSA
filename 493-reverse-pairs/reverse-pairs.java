class Solution {
    long count =0;
    public int reversePairs(int[] nums) {
        int n = nums.length;
        mergesort(nums,0,n-1);
        return (int)count;
    }
    public void mergesort(int[]nums, int start, int end){
        if(start>=end) return;
        int mid = (start+end)/2;
        mergesort(nums, start,mid);
        mergesort(nums, mid+1, end);
        countPairs(nums,start,mid,end);
        merge(nums, start,mid, end);
    }
    public void countPairs(int[] nums, int start, int mid, int end){
        int right = mid+1;
        for(int i= start; i<=mid;i++){
            while(right<=end && (long)nums[i]> 2L*nums[right]) right++;
            count += right-(mid+1);
        }
    }
    public void merge(int[] nums, int start, int mid, int end){
        int i= start, j = mid+1, k=0;
        int temp[]= new int[end-start+1];
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[k] = nums[i];
                i++;
                k++;
            }
            else{
                temp[k++] = nums[j++];
            }
            
        }
        while(i<=mid){
                temp[k++]= nums[i++];
        }
        while(j<=end){
            temp[k++] = nums[j++];
        }
        for(int p=start;p<=end;p++){
            nums[p] = temp[p-start];
        }
    }
}